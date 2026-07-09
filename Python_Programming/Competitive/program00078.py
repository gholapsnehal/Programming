############################################################################################################
#
# Function name:   CountDigits
# Input:           int
# Output:          int
# Description:     Accept one number from user and return the number of digits
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CountDigits(No):

    Count = 0

    while(No > 0):

        Count = Count + 1

        No = No // 10

    return Count

    
def main():

    Value = int(input("Enter number : "))

    Answer = CountDigits(Value)

    print("Number of digits is : ", Answer)

      
if __name__ == "__main__":
    main()