############################################################################################################
#
# Function name:   CheckNum
# Input:           int
# Output:          None
# Description:     Check whether the given number is positive, negative or zero
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CheckNum(No):

    if(No > 0):
        print("Positive Number")

    elif(No < 0):
        print("Negative Number")

    else:
        print("Zero")


def main():
    
    Value = int(input("Enter Number : "))
    
    CheckNum(Value)

  
if __name__ == "__main__":
    main()