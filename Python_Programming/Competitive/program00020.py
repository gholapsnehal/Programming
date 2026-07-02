############################################################################################################
#
# Function name:   DisplayReverse
# Input:           int
# Output:          None
# Description:     write a program which accepts one number and prints that many numbers in reverse order
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def DisplayReverse(Number):

    i = 0

    for i in range(Number,0,-1):

        print(i, end=" ")

def main():

    Value = int(input("Enter number : "))

    DisplayReverse(Value)
    

if __name__ == "__main__":
    main()