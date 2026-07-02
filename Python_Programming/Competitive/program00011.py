############################################################################################################
#
# Function name:   CheckPrime
# Input:           int
# Output:          bool
# Description:     write a program which accepts one number and checks whether it is prime or not
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CheckPrime(Number):

    iCount = 0
                
    for i in range(1, Number + 1):

        if(Number % i == 0):
            iCount = iCount + 1

    if(iCount == 2):
        return True
    else:
        return False
  
def main():

    Value = int(input("Enter number : "))
    
    Result = CheckPrime(Value)

    if(Result):
        print("prime number")
    else:
        print("not a prime number")


if __name__ == "__main__":
    main()