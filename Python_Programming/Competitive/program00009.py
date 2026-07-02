############################################################################################################
#
# Function name:   Even
# Input:           int
# Output:          None
# Description:     write a program which accepts one number and prints all even numbers till that
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Even(Number):
                # (start,end,jump)
    for i in range(2, Number + 1,2):

        print(i, end=" ")
        
    
def main():

    Value = int(input("Enter number : "))

    Even(Value)


if __name__ == "__main__":
    main()