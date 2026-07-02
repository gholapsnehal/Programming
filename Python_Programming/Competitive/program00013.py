############################################################################################################
#
# Function name:   SumDigits
# Input:           int
# Output:          int
# Description:     write a program which accepts one number and prints sum of digits
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def SumDigits(Number):

    sum = 0
    Digit = 0
    
    while(Number != 0):
    
        Digit = Number % 10

        sum = sum + Digit

        Number = Number // 10

    return sum
                
     
def main():

    Value = int(input("Enter number : "))
    
    Result = SumDigits(Value)

    print("Sum of digits :",Result)


if __name__ == "__main__":
    main()