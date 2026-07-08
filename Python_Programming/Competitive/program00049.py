############################################################################################################
#
# Function name:   FilterMapReduce
# Input:           list
# Output:          int
# Description:     Accept a list of numbers. Filter all even numbers, calculate
#                  their squares using map(), and return their addition using
#                  reduce()
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from functools import reduce

def FilterMapReduce(data):

    FilterData = list(filter(lambda no: (no % 2 == 0),data))

    MapData = list(map(lambda no: no ** 2, FilterData))

    ReduceData = reduce(lambda num1, num2: num1 + num2,MapData)

    return FilterData,MapData,ReduceData

    
def main():

    List = []

    size = int(input("Enter number of elements: "))

    print("Enter elements: ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    FilterList, MapList, Sum = FilterMapReduce(List)

    print("Input List : ",List)
    print("List after filter : ",FilterList)
    print("List after map : ",MapList)
    print("result of reduce : ",Sum)


if __name__ == "__main__":
    main()