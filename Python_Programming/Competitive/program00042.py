############################################################################################################
#
# Function name:   FilterString
# Input:           list
# Output:          list
# Description:     write a lambda function using filter() which accepts a list of strings and returns a list
#                  of strings having length greater than 5
# Date :           03/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################


def FilterString(Data):
   
    Result = list(filter(lambda Str : len(Str) > 5, Data))

    return Result


def main():

    List =["Java","JavaScript","Python","Ruby","Golang","Android"]

    Result = FilterString(List)

    print("Original List :",List)
    print("Filter List :",Result)

   
if __name__ == "__main__":
    main()