##################################################################################################
#
# Function name:   CubeOfNumber
# Input:           int
# Output:          int
# Description:     write a program which accepts one number and returns the cube of that number
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
##################################################################################################

def CubeOfNumber(No1):

    return No1 * No1 * No1
    
    
def main():

    Value1 = int(input("Enter number : "))

    Result = CubeOfNumber(Value1)

    print("Cube of number",Value1, "is",Result)


if __name__ == "__main__":
    main()