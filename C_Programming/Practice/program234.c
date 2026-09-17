// problems on string
// header file mde functions prototye astat

#include<stdio.h>
#include<string.h>

int main()
{
    char str[] = "Jay Ganesh";
    int iRet = 0;


    // print all character till reaches to \0

    // strlen will give only character length 10.
    iRet = strlen(str);
    printf("Length of string is : %d\n",iRet); 

    return 0;
}