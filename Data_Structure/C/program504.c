//RECURSION

#include<stdio.h>

void Display()
{
    printf("Jay Ganesh\n");  
    
    Display();    // it will go in infinite recursion
        
}

int main()
{
    Display();

    return 0;
}