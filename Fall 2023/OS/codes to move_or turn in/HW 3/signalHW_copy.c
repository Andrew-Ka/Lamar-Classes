// Andrew Kalathra
// 9/6/2023
#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h> //only available on linux
#include <stdlib.h>
#include <signal.h> //this lets us signal

void handler_sighup(int sig){
    printf("I am child process with PID of %d, and I have recieved SIGHUP\n", getpid());
    fflush(stdout);
}
void handler_sigint(int sig){
    printf("I am child process with PID of %d, and I have recieved SIGINT\n", getpid());
    fflush(stdout);
}
void handler_sigquit(int sig){
    printf("I am child process with PID of %d, and I have recieved SIGQUIT\n", getpid());
    fflush(stdout);
}

int main(void){
    struct sigaction sigHup;
    sigHup.sa_handler = handler_sighup;
    struct sigaction sigInt;
    sigInt.sa_handler = handler_sigint;
    struct sigaction sigQuit;
    sigQuit.sa_handler = handler_sigquit;

    int pid = fork(); //child process created

    if(pid == -1){//good to check if 
        return 1; //child was made correctly
    }else if(pid == 0){ //for the child process
        sigaction(SIGHUP, &sigHup, NULL);
        sigaction(SIGINT, &sigInt, NULL);
        sigaction(SIGQUIT, &sigQuit, NULL);
        for(;;);
    }else{//for parent process
        printf("Parent Process has started! PID of %d\n", getpid());
        kill(pid, SIGHUP);
        sleep(5);
        kill(pid, SIGINT);
        sleep(5);
        kill(pid, SIGQUIT);
        sleep(5);
        printf("parent process is done now\n");
    }

}