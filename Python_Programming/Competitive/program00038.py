############################################################################################################
#
# Function name:   OddList
# Input:           list
# Output:          list
# Description:     write a lambda function using filter() which accepts a list of numbers and returns a list 
#                  of odd numbers
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def OddList(Data):
   
    Result = list(filter(lambda No : (No % 2 != 0), Data))

    return Result


def main():

    List = [10,11,12,13,14,15]

    Result = OddList(List)

    print("Original List :",List)
    print("Odd List :",Result)

   
if __name__ == "__main__":
    main()