//Andrew Kalathra
//9/6/2023
#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h> //only available on linux
#include <stdlib.h>

// #define NULL 0

int main(void)
{
    int id = fork();
    if(id !=0){
        printf("I am Parent with PID of %d \n", getpid());
    }

    if (id == 0) // for the child process, self-note:
    {                // when child, fork returns 0
        printf("I am Child, PID is %d \n", getpid());
    }
    else
    {
        sleep(20);
        printf("I'm the Parent again, check my PID, its %d \n", getpid());
    }
}