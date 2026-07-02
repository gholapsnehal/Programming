############################################################################################################
#
# Function name:   CalculateArea
# Input:           int,int
# Output:          int
# Description:     write a program which accepts length and width of rectangle and prints area
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CalculateArea(length, width):

    area = length * width

    return area
   

def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Result = CalculateArea(Value1,Value2)

    print("Area of rectangle is : ",Result)
    
if __name__ == "__main__":
    main()