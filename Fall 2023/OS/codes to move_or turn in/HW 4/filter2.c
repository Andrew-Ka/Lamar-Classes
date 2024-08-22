#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>

//Andrew Kalathra
//10/27/23

void filter(FILE *original, FILE *toOpp){
    
    /*
    FILE *toLower; 
    toLower = fopen("exampleLower.txt", "w");
    */
    char hold = fgetc(original);
    while(hold != EOF){
        if( (hold >= 65) || (hold <= 90) ){ 
            //upper case to lower case
            hold += 32;
        }else{ //lower case to upper case
            hold -= 32;
        }

        fputc(hold, toOpp);
    }
    //return *toLower;
}