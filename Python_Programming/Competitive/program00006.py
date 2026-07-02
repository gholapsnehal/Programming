############################################################################################################
#
# Function name:   MultTable
# Input:           int
# Output:          None
# Description:     write a program which accepts one number and prints multiplication table of that number
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def MultTable(No1):

    for i in range(1,11):
        print(No1 * i, end=" ")
   
def main():

    Value1 = int(input("Enter number : "))

    MultTable(Value1)


if __name__ == "__main__":
    main()