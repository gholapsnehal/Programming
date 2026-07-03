############################################################################################################
#
# Function name:   Lambda Function
# Input:           int,int
# Output:          int
# Description:     write a lambda function which accepts two numbers and returns multiplication
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


multiplication = lambda No1, No2 : No1 * No2

 
def main():

    Value1 = int(input("Enter first Number : "))
    Value2 = int(input("Enter second Number : "))
    
    Result = multiplication(Value1,Value2)

    print("multiplication is : ",Result)
    
if __name__ == "__main__":
    main()