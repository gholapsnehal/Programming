############################################################################################################
#
# Function name:   DisplayPrime
# Input:           int
# Output:          None
# Description:     Accept one number from user and display all prime numbers till that number
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def DisplayPrime(No):

    for i in range(2, No + 1):

        Flag = True

        for j in range(2, i):

            if(i % j == 0):

                Flag = False
                break

        if(Flag == True):

            print(i, end="\t")

    
def main():

    Value = int(input("Enter number : "))

    DisplayPrime(Value)

      
if __name__ == "__main__":
    main()