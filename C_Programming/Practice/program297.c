//Swapping : duckCup whiteCup and thirdCup(temp)

#include<stdio.h>

// call by value so same result i= 11 and j = 21
void Swap(int No1, int No2)
{
    int temp = 0;

    temp = No1;
    No1 = No2;
    No2 = temp;

}


int main()
{
    int i = 11;
    int j = 21;

    Swap(i,j);
   
    printf("%d\n",i);  
    printf("%d\n",j); 


    return 0;
}