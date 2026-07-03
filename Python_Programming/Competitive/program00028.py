############################################################################################################
#
# Function name:   Lambda Function
# Input:           int,int
# Output:          int
# Description:     write a lambda function which accepts two numbers and returns the maximum numbers
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


Maximum = lambda Number1,Number2 : Number1 if Number1 > Number2 else Number2

 
def main():

    Value1 = int(input("Enter first Number : "))
    Value2 = int(input("Enter second Number : "))
    
    Result = Maximum(Value1,Value2)

    print("Maximum number is : ",Result)
    
if __name__ == "__main__":
    main()