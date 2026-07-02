############################################################################################################
#
# Function name:   CountDigits
# Input:           int
# Output:          int
# Description:     write a program which accepts one number and prints count of digits in that number
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CountDigits(Number):

    Count = 0
    
    while(Number != 0):
    
        Count = Count + 1

        Number = Number // 10

    return Count
                
     
def main():

    Value = int(input("Enter number : "))
    
    Result = CountDigits(Value)

    print("Count of digits: ",Result)


if __name__ == "__main__":
    main()