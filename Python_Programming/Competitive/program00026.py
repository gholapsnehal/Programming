############################################################################################################
#
# Function name:   Lambda Function
# Input:           int
# Output:          int
# Description:     write a lambda function which accepts one number and returns square of number
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


Square = lambda Number : Number * Number

 
def main():

    Value1 = int(input("Enter Number : "))
    
    Result = Square(Value1)

    print("Square of",Value1,"is",Result)
    
if __name__ == "__main__":
    main()