############################################################################################################
#
# Function name:   DisplayOdd
# Input:           int
# Output:          None
# Description:     write a program which accepts one number and prints all odd numbers till that
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def DisplayOdd(Number):
                # (start,end,jump)
    for i in range(1, Number + 1,2):

        print(i, end=" ")
        
    
def main():

    Value = int(input("Enter number : "))

    DisplayOdd(Value)


if __name__ == "__main__":
    main()