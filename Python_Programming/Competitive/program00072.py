############################################################################################################
#
# Function name:   Factorial
# Input:           int
# Output:          int
# Description:     Accept one number from user and return its factorial
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Factorial(No):

    fact = 1

    for i in range(1, No + 1):

        fact = fact * i

    return fact

    
def main():

    Value = int(input("Enter number : "))

    Answer = Factorial(Value)

    print("Factorial is :",Answer)

  
if __name__ == "__main__":
    main()