############################################################################################################
#
# Function name:   FilterMapReduce
# Input:           list
# Output:          int
# Description:     Accept a list of numbers. Filter numbers between 70 and 90,
#                  increase each filtered number by 10 using map(), and return
#                  the product of all numbers using reduce()
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from functools import reduce

def FilterMapReduce(data):

    FilterData = list(filter(lambda no: (no >= 70 and no <= 90),data))

    MapData = list(map(lambda no: no + 10, FilterData))

    ReduceData = reduce(lambda num1, num2: num1 * num2,MapData)

    return FilterData,MapData,ReduceData

    
def main():

    List = []

    size = int(input("Enter number of elements: "))

    print("Enter elements: ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    FilterList, MapList, Product = FilterMapReduce(List)

    print("Input List : ",List)
    print("List after filter : ",FilterList)
    print("List after map : ",MapList)
    print("result of reduce : ",Product)



if __name__ == "__main__":
    main()