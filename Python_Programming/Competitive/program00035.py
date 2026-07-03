############################################################################################################
#
# Function name:   Lambda Function
# Input:           int,int,int
# Output:          int
# Description:     write a lambda function which accepts three numbers and returns largest number
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


MaximumOfThree = lambda No1, No2, No3 : No1 if(No1 >= No2 and No1 >= No3) else (No2 if No2 >= No3 else No3)

 
def main():

    Value1 = int(input("Enter first Number : "))
    Value2 = int(input("Enter second Number : "))
    Value3 = int(input("Enter third Number : "))
    
    Result = MaximumOfThree(Value1,Value2,Value3)

    print("Largest number is : ",Result)
    
if __name__ == "__main__":
    main()