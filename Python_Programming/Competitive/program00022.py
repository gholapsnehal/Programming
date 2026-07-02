############################################################################################################
#
# Function name:   CalculateArea
# Input:           float
# Output:          float
# Description:     write a program which accepts radius of a circle and prints area of the circle
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CalculateArea(radius):

    PI = 3.14

    area = PI * radius * radius

    return area
   

def main():

    Value1 = float(input("Enter number : "))
    
    Result = CalculateArea(Value1)

    print("Area of circle is : ",Result)
    
if __name__ == "__main__":
    main()