############################################################################################################
#
# Function name:   SquareList
# Input:           list
# Output:          list
# Description:     write a lambda function using map() which accepts a list of numbers and returns list of squares
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def SquareList(Data):
   
    Result = list(map(lambda No : No * No, Data))

    return Result


def main():

    List = [2,3,4,5]

    Result = SquareList(List)

    print("Original List :",List)
    print("Square List :",Result)

   
if __name__ == "__main__":
    main()