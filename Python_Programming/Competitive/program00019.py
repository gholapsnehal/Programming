############################################################################################################
#
# Function name:   Display
# Input:           int
# Output:          None
# Description:     write a program which accepts one number and prints that many numbers starting from 1
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Display(Number):

    for i in range(1,Number + 1):

        print(i, end=" ")

def main():

    Value = int(input("Enter number : "))

    Display(Value)
    

if __name__ == "__main__":
    main()