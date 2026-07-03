############################################################################################################
#
# Function name:   DivisibleList
# Input:           list
# Output:          list
# Description:     write a lambda function using filter() which accepts a list of numbers and returns a list
#                  of numbers divisible by both 3 and 5
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


def DivisibleList(Data):
   
    Result = list(filter(lambda No : (No % 3 == 0) and (No % 5 == 0), Data))

    return Result


def main():

    List =[10,15,18,21,24,25,20,40,45]

    Result = DivisibleList(List)

    print("Original List :",List)
    print("Filtered List :",Result)

   
if __name__ == "__main__":
    main()