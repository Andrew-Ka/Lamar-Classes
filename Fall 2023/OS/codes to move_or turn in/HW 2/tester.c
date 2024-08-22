//Andrew Kalathra
//9/15/2023
#include <sys/wait.h>//only available on linux
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h> //only available on linux
#include <stdlib.h>
#include <pthread.h> //only available on linux

int main(){
    FILE *flptr;
    flptr = fopen("data.txt","r");

    /*if(flptr == NULL){
        printf("file does not exist");
    }*/

    int num_lines = 0;
    char c = fgetc(flptr);
    while(c != EOF){
        if (c == '\n'){
            num_lines++;
        }
        c = fgetc(flptr);
    }
    fclose(flptr);

    printf("This file has %d line(s)\n", num_lines);
    

}