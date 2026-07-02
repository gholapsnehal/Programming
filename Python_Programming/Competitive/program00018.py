############################################################################################################
#
# Function name:   Arithmetic
# Input:           int,int
# Output:          int,int,int,float
# Description:     write a program which accepts two numbers and returns addition, substraction, multiplication
#                  and division
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Arithmetic(No1,No2):

    Addition = No1 + No2
    Substraction = No1 - No2
    Multiplication = No1 * No2
    Division = No1 / No2

    return Addition, Substraction, Multiplication, Division


def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))
    
    Result1,Result2,Result3,Result4 = Arithmetic(Value1,Value2)

    print("Addition is : ",Result1)
    print("Substraction is : ",Result2)
    print("Multiplication is : ",Result3)
    print("Division is : ",Result4)

if __name__ == "__main__":
    main()