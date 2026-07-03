############################################################################################################
#
# Function name:   Minimum
# Input:           list
# Output:          int
# Description:     write a lambda function using reduce() which accepts a list of numbers and returns the 
#                  minimum number
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from functools import reduce

def Minimum(Data):
   
    Result = reduce(lambda No1, No2 : No1 if (No1 < No2) else No2,Data)

    return Result


def main():

    List =[10,20,30,40,25]

    Result = Minimum(List)

    print("Original List :",List)
    print("Minimum number is :",Result)

   
if __name__ == "__main__":
    main()