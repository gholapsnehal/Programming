############################################################################################################
#
# Function name:   Factorial
# Input:           int
# Output:          int
# Description:     write a program which accepts one number and prints factorial of that number
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Factorial(Number):

    Fact = 1

    for i in range(1, Number + 1):
        Fact = Fact * i

    return Fact
   
def main():

    Value = int(input("Enter number : "))

    Result = Factorial(Value)

    print("Factorial of ",Value, "is ",Result)


if __name__ == "__main__":
    main()