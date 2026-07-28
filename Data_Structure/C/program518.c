//RECURSION

#include<stdio.h>

void Display(int iNo)
{
        
    if(iNo != 0)   
    {
        printf("Jay Ganesh...%d\n",iNo);
            
        Display(iNo--);   // post decrement: issue
    } 
        
}

int main()
{
    int iValue = 0;

    printf("Enter frequency : ");
    scanf("%d",&iValue);

    Display(iValue);
    printf("End of main");
    
    return 0;
}