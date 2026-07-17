/*   accept number from user and check whether it's even or odd.
        START
            Accept number as No
            If no is completely divisible by 2
                then print Even
            otherwise
                print Odd
        STOP
        
        START
            Accept number as No
            Divide No by 2
            If reaminder is 0
                the print as Even
            otherwise
                print as Odd
        STOP
*/

#include<stdio.h>

int main()
{
    int iValue = 0;
    int iRemainder = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRemainder = iValue % 2;

    if(iRemainder == 0)
    {
        printf("Number is Even\n");
    }
    else
    {
        printf("Number is Odd");
    }

    return 0;
}