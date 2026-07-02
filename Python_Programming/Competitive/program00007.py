############################################################################################################
#
# Function name:   SumNatural
# Input:           int
# Output:          int
# Description:     write a program which accepts one number and prints sum of first N natural numbers
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def SumNatural(No1):

    sum = 0

    for i in range(1, No1 + 1):
        sum = sum + i

    return sum
   
def main():

    Value1 = int(input("Enter number : "))

    Result = SumNatural(Value1)

    print("Sum of first",Value1, "natural number is ",Result)


if __name__ == "__main__":
    main()