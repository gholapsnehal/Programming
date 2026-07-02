############################################################################################################
#
# Function name:   DisplayFactors
# Input:           int
# Output:          None
# Description:     write a program which accepts one number and prints its factors
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def DisplayFactors(Number):

    i = 0

    for i in range(1,Number + 1):

        if(Number % i == 0):

            print(i,end=" ")

def main():

    Value = int(input("Enter a number : "))
    
    DisplayFactors(Value)

if __name__ == "__main__":
    main()