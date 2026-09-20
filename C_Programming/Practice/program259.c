// problems on string
// how to pass string to function
// accept string from user and remove l and repace with L

#include<stdio.h>

// strlenX() - user defined function

void Update(char *str)
{
  
    while(*str != '\0')
   {
       if(*str == 'l')
       {
         
        *str = 'L';          
       }  
       str++;              
   }
   
}

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);
       
    Update(Arr);

    printf("Updated string is : %s\n");

  
    return 0;
}
