############################################################################################################
#
# Function name:   SumDigit
# Input:           int
# Output:          int
# Description:     Accept one number from user and return the addition of digits
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def SumDigit(No):

    Sum = 0

    while(No > 0):

        Digit = No % 10
        Sum = Sum + Digit
        No = No // 10

    return Sum

    
def main():

    Value = int(input("Enter number : "))

    Answer = SumDigit(Value)

    print("Addition of digits is : ", Answer)

      
if __name__ == "__main__":
    main()