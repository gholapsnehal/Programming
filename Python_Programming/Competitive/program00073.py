############################################################################################################
#
# Function name:   SumFactors
# Input:           int
# Output:          int
# Description:     Accept one number from user and return the addition of its factors
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def SumFactors(No):

    Result = 0

    for i in range(1, No):

        if(No % i == 0):

            Result = Result + i

    return Result

    
def main():

    Value = int(input("Enter number : "))

    Answer = SumFactors(Value)

    print("Addition of factors is :",Answer)

  
if __name__ == "__main__":
    main()