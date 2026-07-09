############################################################################################################
#
# Function name:   CheckNum
# Input:           int
# Output:          None
# Description:     Check whether the given number is even or odd
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CheckNum(No):

    if(No % 2 == 0):
        print("Even Number")
    else:
        print("Odd Number")


def main():

    value = int(input("Enter number : "))

    CheckNum(value)

if __name__ == "__main__":
    main()