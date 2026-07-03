############################################################################################################
#
# Function name:   Lambda Function
# Input:           int
# Output:          bool
# Description:     write a lambda function which accepts two numbers and returns true if number is even otherwise false
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


ChkEven = lambda Number : True if(Number % 2 == 0) else False

 
def main():

    Value1 = int(input("Enter Number : "))
    
    Result = ChkEven(Value1)

    if(Result):
        print("Number is EVEN")
    else:
        print("Number is ODD")
    
if __name__ == "__main__":
    main()