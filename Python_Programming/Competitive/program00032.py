############################################################################################################
#
# Function name:   Lambda Function
# Input:           int,int
# Output:          int
# Description:     write a lambda function which accepts two numbers and returns addition
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


Addition = lambda No1, No2 : No1 + No2

 
def main():

    Value1 = int(input("Enter first Number : "))
    Value2 = int(input("Enter second Number : "))
    
    Result = Addition(Value1,Value2)

    print("Addition is : ",Result)
    
if __name__ == "__main__":
    main()