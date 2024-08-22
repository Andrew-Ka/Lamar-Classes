#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>
#include <signal.h>

//Andrew Kalathra
//10/27/23

void filter(FILE *original, FILE *toOpp);

int main(){
    
    FILE *changedFile; 
    changedFile = fopen("exampleLower.txt", "w");
    
    //first, the filter part
    
    int fd_s_f[2];//source to filter
    //file descriptor
    //fd[0] = read
    //fd[1] = write
    if(pipe(fd_s_f) == -1){
        printf("Error with pipe\n");
        return 1;
    }

    int pid = fork();
    if(pid == -1){
        printf("Error with fork 1\n");
        return 2;
    }else if(pid == 0){ //child process
        printf("Child is running, pid of %d \n", getpid());
        close(fd_s_f[0]); //we don't need child to read
        FILE *exText;
        exText = fopen("example.txt", "r");
        write(fd_s_f[1], exText, malloc(3)); //****
        close(fd_s_f[1]); //child is done writing
        fclose(exText);
        kill(pid, SIGKILL);
    }else{ //parent process, the filter
        printf("Parent is running, pid of %d \n", getpid());
        close(fd_s_f[1]); //don't need parent to write
        FILE *theFile;
        read(fd_s_f[0], theFile, malloc(3)); //****
        filter(theFile, changedFile);
        close(fd_s_f[0]); //parent is done reading
    }

    printf("The text is as such:\n");
    char txtLines[150];
    while(1){
        if( !fgets(txtLines, 150, changedFile)
        || feof(changedFile)
        || ferror(changedFile)){
            break;
        }//this is to make sure to get to the end of file

        printf("%s\n",txtLines);
    }
    
    


    //second, the sink part
    //don't need another pipe for implementation,
    //but this would be the general skeleton
    /*
    int fd_f_s[2];//filter to sink
    if(pipe(fd_f_s) == -1){
        printf("Error with pipe\n");
        return 3;
    }
    int pid2 = fork();
    if(pid2 == -1){
        printf("Error with fork 1\n");
        return 4;
    }else if{pid == 0}{ //child process
        close(fd_f_s[0]); //we don't need child to read

    }
    */
    return 0;
}