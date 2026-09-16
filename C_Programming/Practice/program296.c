//Swapping : duckCup whiteCup and thirdCup(temp)

#include<stdio.h>

int main()
{
    int i = 11;
    int j = 21;

    int temp = 0;

    temp = i;
    i = j;
    j = temp;

    printf("%d\n",i);  //21 
    printf("%d\n",j);  //11


    return 0;
}