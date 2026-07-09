############################################################################################################
#
# Function name:   Addition
# Input:           int,int
# Output:          int
# Description:     Accept two numbers from the user and return their addition
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Addition(No1, No2):

    Result = No1 + No2

    return Result


def main():

    value1 = int(input("Enter first number : "))
    value2 = int(input("Enter second number : "))

    Answer = Addition(value1,value2)

    print("Addition is : ",Answer)

if __name__ == "__main__":
    main()