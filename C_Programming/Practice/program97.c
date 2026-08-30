// ARRAY STATIC

#include<stdio.h>

int Arr[7];             // decare outside main function
// as we declare this globally the values which are not assigned with any values for those data type default
//values will set 

int main()
{
    Arr[0] = 10;
    Arr[3] = 20;
    Arr[6] = 30;

    printf("%d\n",sizeof(Arr));

    printf("%d\n",Arr[0]);
    printf("%d\n",Arr[3]);
    printf("%d\n",Arr[6]);
    
    printf("%d\n",Arr[2]);            // for these two indices it will assign with default values.
    printf("%d\n",Arr[5]);

    return 0;
}