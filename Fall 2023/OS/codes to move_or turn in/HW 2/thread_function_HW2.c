//Andrew Kalathra
//9/15/2023
#include <sys/wait.h>//only available on linux
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h> //only available on linux
#include <stdlib.h>
#include <pthread.h> //only available on linux

// #define NULL 0
void *count_lines(void *arg){
    
    int *resultLines = malloc(sizeof(int)); //dynamically allocate spot for it
    int num_lines = 0; 
    
    char c = fgetc(arg); //use to temporarily hold each character
    while(c != EOF){
        if(c == '\n'){ //check for new line
            num_lines++;
        }
        c = fgetc(arg);
    }
    fclose(arg);

    *resultLines = num_lines;
    return (void*) num_lines; //so we need to cast it to void*
}