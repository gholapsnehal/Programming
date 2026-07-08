############################################################################################################
#
# Function name:   FilterMapReduce
# Input:           list
# Output:          int
# Description:     Accept a list of numbers. Filter all prime numbers, multiply
#                  each prime number by 2 using map(), and return the maximum
#                  number using reduce()
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from functools import reduce

def CheckPrime(no):

    if no <= 1:
        return False
    
    for i in range(2,(no // 2) + 1):
        if(no % i == 0):
            return False
    
    return True


def FilterMapReduce(data):

    FilterData = list(filter(CheckPrime,data))

    MapData = list(map(lambda no: no * 2, FilterData))

    ReduceData = reduce(lambda num1, num2: num1 if num1 > num2 else num2,MapData)

    return FilterData,MapData,ReduceData

    
def main():

    List = []

    size = int(input("Enter number of elements: "))

    print("Enter elements: ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    FilterList, MapList, Maximum = FilterMapReduce(List)

    print("Input List : ",List)
    print("List after filter : ",FilterList)
    print("List after map : ",MapList)
    print("result of reduce : ",Maximum)


if __name__ == "__main__":
    main()