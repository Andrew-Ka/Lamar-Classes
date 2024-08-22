#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>

//Andrew Kalathra
//10/27/23

void filter(FILE *original){
    
    
    FILE *toOpp; 
    toOpp = fopen("temp.txt", "w");
    
    char hold = fgetc(original);
    //printf("%c\n", hold);
    //int charIndex = 0;
    while(hold != EOF){
        if( (hold >= 65) || (hold <= 90) ){ 
            //upper case to lower case
            hold += 32;
        }else if( (hold >= 97) || (hold <= 122)){
            //lower case to upper case
            hold -= 32;
        }else{ //don't do anything
            
        }
        fputc(hold, toOpp);
        hold = fgetc(original);
    }
    fclose(toOpp);
    *original = toOpp;
    //return *toLower;
}