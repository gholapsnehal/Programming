############################################################################################################
#
# Function name:   chkDivisible
# Input:           int
# Output:          bool
# Description:     write a program which accepts one number and checks whether it is divisible by 3 and 5
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def chkDivisible(No1):

    if((No1 % 3 == 0) and (No1 % 5 == 0)):
        return True
    else:
        return False
   
def main():

    Value1 = int(input("Enter number : "))

    result = chkDivisible(Value1)

    if (result):
        print("Number is divisible by 3 and 5")
    else:
        print("Number is not divisible by 3 and 5")


if __name__ == "__main__":
    main()