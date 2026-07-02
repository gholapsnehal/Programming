############################################################################################################
#
# Function name:   Reverse
# Input:           int
# Output:          int
# Description:     write a program which accepts one number and displays that number in reverse order
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Reverse(Number):

    Reverse = 0
    Digit = 0

    while(Number != 0):
    
        Digit = Number % 10

        Reverse = (Reverse * 10) + Digit

        Number = Number // 10

    return Reverse    

                     
def main():

    Value = int(input("Enter number : "))
    
    Result = Reverse(Value)

    print("Reverse number is:",Result)


if __name__ == "__main__":
    main()