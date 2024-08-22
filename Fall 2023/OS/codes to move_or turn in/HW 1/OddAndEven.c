// Andrew Kalathra
// 9/6/2023
#include <sys/wait.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h> //only available on linux
#include <stdlib.h>

int main(void)
{
    int n;
    int sum = 0;
    // String name;
    int id = fork();
    if (id == 0) // child
    {
        n = 1;
        // for odd
        printf("The sum of all odd numbers from 0 to 1000 is ");
    }
    else // parent
    {
        if (wait(NULL) > 0)
        {
            n = 2;
            // for even
            printf("The sum of all even numbers from 0 to 1000 is ");
        }
    }

    for (n; n <= 1000; n += 2)
    {
        sum += n;
    }
    printf("%d\n", sum);
}