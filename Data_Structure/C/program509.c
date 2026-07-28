//RECURSION

// Iteration using while loop
#include<stdio.h>

void Display()
{
    static int i = 0;

    i = 1;   // ISSUE
        
    if(i <= 4)   
    {
        printf("Jay Ganesh\n");
        i++;    // as i is static this also going infinte
        Display();
    } 
        
}

int main()
{
    Display();
    
    return 0;
}