############################################################################################################
#
# Function name:   CheckDivisible
# Input:           int
# Output:          bool
# Description:     Check whether the given number is divisible by 5 or not
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CheckDivisible(No):

    if(No % 5 == 0):
        return True
    
    else:
        return False


def main():
    
    Value = int(input("Enter Number : "))
    
    Result = CheckDivisible(Value)

    print(Result)

    if(Result):
        print(f"{Value} is divisible by 5")
    else:
        print(f"{Value} is not divisible by 5")

  
if __name__ == "__main__":
    main()