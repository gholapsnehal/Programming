############################################################################################################
#
# Function name:   multiplication
# Input:           int,int
# Output:          int
# Description:     write a lambda function which accepts two parameter and return its multiplication
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


def multiplication(no1, no2):

    result = (lambda num1, num2: num1 * num2)(no1,no2)

    return result

def main():

    value1 = int(input("Enter first number: "))
    value2 = int(input("Enter second number: "))

    answer = multiplication(value1,value2)

    print(f"Multiplication of {value1} and {value2} is :",answer)

if __name__ == "__main__":
    main()