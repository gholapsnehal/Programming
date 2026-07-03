############################################################################################################
#
# Function name:   Lambda Function
# Input:           int
# Output:          bool
# Description:     write a lambda function which accepts two numbers and returns true if it is divisible by 5
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


ChkDivisible = lambda Number : True if(Number % 5 == 0) else False

 
def main():

    Value1 = int(input("Enter Number : "))
    
    Result = ChkDivisible(Value1)

    if(Result):
        print("Number is divisible by 5")
    else:
        print("Number is not divisible by 5")
    
if __name__ == "__main__":
    main()