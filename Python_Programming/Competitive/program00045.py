############################################################################################################
#
# Function name:   CountEven
# Input:           list
# Output:          int
# Description:     write a lambda function using filter() which accepts a list of numbers and returns the
#                  count of even numbers
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


def CountEven(Data):
   
    Result = list(filter(lambda No : (No % 2 == 0), Data))

    Count = len(Result)
    
    return Count


def main():

    List =[10,11,21,51,13,14,15,16,20,40]

    Result = CountEven(List)

    print("Original List :",List)
    print("Count of even numbers :",Result)

   
if __name__ == "__main__":
    main()