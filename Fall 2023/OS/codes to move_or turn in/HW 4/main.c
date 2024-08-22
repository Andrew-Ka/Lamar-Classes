#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>
#include <signal.h>

//Andrew Kalathra
//10/27/23

void filter(FILE *original);

int main(){
    /*
    C => P => C
    Source => Filter => Sink
    */

    /*FILE *changedFile; 
    changedFile = fopen("exampleLower.txt", "w");*/

    int p1[2];//from C => P, this is pipe 1
    int p2[2];//from P => C, this is pipe 2
    //p1[0] = read
    //p1[1] = write

    if(pipe(p1) == -1){
        printf("Error with pipe\n");
        return 1;
    }
    if(pipe(p2) == -1){
        printf("Error with pipe\n");
        return 1;
    }

    int pid = fork();
    if(pid == -1){
        printf("Error with fork 1\n");
        return 2;
    }else if(pid == 0){//child process

        close(p1[0]); //child isn't reading on pipe 1
        close(p2[1]); //child isn't writing on pipe 2

        //printf("Child is running, pid of %d \n", getpid());
        FILE *exText;
        exText = fopen("example.txt", "r");

        write(p1[1], exText, 3);

        FILE *result;

        read(p2[0], result, 3);

        close(p1[1]); //child is done writing on pipe 1
        close(p2[0]); //child is done reading on pipe 2

        printf("The text is as such:\n");
        char txtLines[150];
        while(1){
            if( !fgets(txtLines, 150, result)
            || feof(result)
            || ferror(result)){
                break;
            }//this is to make sure to get to the end of file

        printf("%s\n",txtLines);
    }
    }else{//parent process
        close(p1[1]); //parent isn't writing on pipe 1
        close(p2[0]); //parent isn't reading on pipe 2

        FILE *changedFile;
        
        read(p1[0], changedFile, 3);

        filter(changedFile);

        write(p2[1], changedFile, 3);

        close(p1[0]); //parent is done reading on pipe 1
        close(p2[1]); //parent is done writing on pipe 2
    }

    return 0;
}