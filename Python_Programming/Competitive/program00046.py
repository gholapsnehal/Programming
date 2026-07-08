############################################################################################################
#
# Function name:   power
# Input:           int
# Output:          int
# Description:     write a lambda function which accepts one parameter and returns its square
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


def power(no):

    result = (lambda value: value ** 2)(no)

    return result

def main():

    value = int(input("Enter number: "))

    answer = power(value)

    print(f"Square of {value} is :",answer)

if __name__ == "__main__":
    main()