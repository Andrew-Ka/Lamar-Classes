// Andrew Kalathra
// 9/6/2023
#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <pthread.h>
#include <unistd.h> //only available on linux
#include <stdlib.h>
#include <signal.h> //this lets us signal
#include <semaphore.h>
//when typing in the command, must look like this:
//gcc -g pthread main.c -o main
//where the main's are the file to be compiled

int counter = 1; //shared between t1 & t2
sem_t semaphore;
void* t1_routine();
void* t2_routine();

int main(void){
    
    sem_init(&semaphore, 0, 1);
    printf("Counter is initially %d\n", counter);

    pthread_t t1, t2;
    if(pthread_create(&t1, NULL, &t1_routine , NULL) != 0){
        return 1;
    }
    if(pthread_create(&t2, NULL, &t2_routine , NULL) != 0){
        return 1;
    }
    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    sem_destroy(&semaphore);
    return 0;
}

void* t1_routine(){
    sem_wait(&semaphore);
    counter++;
    printf("Counter is now equal to %d \n", counter);
    sem_post(&semaphore);
}
void* t2_routine(){
    sem_wait(&semaphore);
    counter--;
    printf("Counter is now equal to %d \n", counter);
    sem_post(&semaphore);
}