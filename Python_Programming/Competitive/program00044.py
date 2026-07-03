############################################################################################################
#
# Function name:   Product
# Input:           list
# Output:          list
# Description:     write a lambda function using reduce() which accepts a list of numbers and returns the
#                  products of all elements
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from functools import reduce

def Product(Data):
   
    Result = reduce(lambda No1, No2 : No1 * No2, Data)

    return Result


def main():

    List =[2,3,4,5]

    Result = Product(List)

    print("Original List :",List)
    print("Product of all elements :",Result)

   
if __name__ == "__main__":
    main()