##################################################################################################
#
# Function name:   SquareOfNumber
# Input:           int
# Output:          int
# Description:     write a program which accepts one number and prints square of that number
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
##################################################################################################

def SquareOfNumber(No1):

    Ans = No1 * No1
    
    return Ans
    
def main():

    Value1 = int(input("Enter number : "))

    Result = SquareOfNumber(Value1)

    print("Square of number",Value1, "is",Result)


if __name__ == "__main__":
    main()