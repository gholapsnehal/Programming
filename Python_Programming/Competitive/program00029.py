############################################################################################################
#
# Function name:   Lambda Function
# Input:           int,int
# Output:          int
# Description:     write a lambda function which accepts two numbers and returns the minimum number
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


Minimum = lambda Number1,Number2 : Number1 if Number1 < Number2 else Number2

 
def main():

    Value1 = int(input("Enter first Number : "))
    Value2 = int(input("Enter second Number : "))
    
    Result = Minimum(Value1,Value2)

    print("Minimum number is : ",Result)
    
if __name__ == "__main__":
    main()