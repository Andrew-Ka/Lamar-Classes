//Andrew Kalathra
//9/15/2023
#include <sys/wait.h>//only available on linux
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h> //only available on linux
#include <stdlib.h>
#include <pthread.h> //only available on linux

void *count_lines(void *arg);

// #define NULL 0
int main(){
    // make var fh for file handler
    FILE *fh;
    fh = fopen("data.txt", "r");
    int *result;

    pthread_t t1;
    if(pthread_create(&t1, NULL, count_lines, (void*)fh) != 0){
        return 1; //just incase we can't make a thread
    }
    
    if(pthread_join(t1, (void**) &result) != 0){
        return 2;
    }

    printf("Number of Lines: %d\n", result);
    //free(result); //just good practice to deallocate, IDK why this doesn't work
}