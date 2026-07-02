############################################################################################################
#
# Function name:   CheckPalindrome
# Input:           int
# Output:          bool
# Description:     write a program which accepts one number and checks whether it is palindrome or not
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CheckPalindrome(Number):

    Original = Number
    Reverse = 0

    while(Number != 0):
    
        Digit = Number % 10

        Reverse = (Reverse * 10) + Digit

        Number = Number // 10

    if(Original == Reverse):
        return True
    else:
        return False  

                     
def main():

    Value = int(input("Enter number : "))
    
    Result = CheckPalindrome(Value)

    if(Result):
        print("Palindrome number")
    else:
        print("not a palindrome number")


if __name__ == "__main__":
    main()