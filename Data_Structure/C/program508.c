//RECURSION

// Iteration using while loop
#include<stdio.h>

void Display()
{
    auto int i = 0;
    i = 1;       

    if(i <= 4)   
    {
        printf("Jay Ganesh\n");
        i++;    // as i is auto i value again reset to 1 so it will also infinite
        Display();
    } 
        
}

int main()
{
    Display();
    
    return 0;
}