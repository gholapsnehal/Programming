############################################################################################################
#
# Function name:   Addition
# Input:           list
# Output:          int
# Description:     write a lambda function using reduce() which accepts a list of numbers and returns the 
#                  addition of all elements
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from functools import reduce

def Addition(Data):
   
    Result = reduce(lambda num1, num2 : num1 + num2, Data)

    return Result


def main():

    List =[10,20,30,40,50]

    Result = Addition(List)

    print("Original List :",List)
    print("Addition of List elements :",Result)

   
if __name__ == "__main__":
    main()