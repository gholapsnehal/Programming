//RECURSION

#include<stdio.h>

void Display()
{
    static int i = 1;

    printf("Jay Ganesh...%d \n",i);  
    i++;
    
    Display();   
        
}

int main()
{
    Display();

    return 0;
}

// segmentation fault: stack overflow: stack frames will get generate so program will terminate at one point