/*
Write a program which accept temperature in Fahrenheit and convert it into Celsius.
Formula:

Celsius=(Fahrenheit−32)×5/9

Input : 10
Output : -12.2222

Input : 34
Output : 1.11111
*/

#include<stdio.h>


double FhtoCs(float fTemp)
{
    double dCelsius = 0.0;

    dCelsius = (fTemp - 32) * (5.0/9.0);

    return dCelsius;

}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temprature in Fahrenheit: ");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf("Temprature in celsius is : %lf\n",dRet);

    return 0;

}

//Only constant arithmetic operations are performed.
//Time Complexity: O(1)