############################################################################################################
#
# Function name:   Lambda Function
# Input:           int
# Output:          int
# Description:     write a lambda function which accepts one number and returns cube of number
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


Cube = lambda Number : Number * Number * Number

 
def main():

    Value1 = int(input("Enter Number : "))
    
    Result = Cube(Value1)

    print("Square of",Value1,"is",Result)
    
if __name__ == "__main__":
    main()