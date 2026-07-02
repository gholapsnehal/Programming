############################################################################################################
#
# Function name:   DisplayBinary
# Input:           int
# Output:          str
# Description:     write a program which accepts one number and print its binary equivalent
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def DisplayBinary(Number):

    Binary = ""
    
    while(Number != 0):

        Digit = Number % 2

        Binary = str(Digit) + Binary

        Number = Number // 2

    return Binary

 
def main():

    Value1 = int(input("Enter number : "))
    
    Result = DisplayBinary(Value1)

    print("Binary equivalent is : ",Result)
    
if __name__ == "__main__":
    main()