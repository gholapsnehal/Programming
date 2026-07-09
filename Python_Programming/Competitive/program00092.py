############################################################################################################
#
# Function name:   CountOdd
# Input:           int
# Output:          int
# Description:     Count the odd numbers between 1 and the given number
# Date :           09/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from multiprocessing import Pool
import os

def CountOdd(No):

    Count = 0

    for i in range(1, No + 1, 2):

        Count = Count + 1

    print("Process ID : ",os.getpid())
    print("Given number : ",No)
    print("Count of Even number : ",Count)
    print()

    return Count
   
   
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    p1 = Pool()

    Answer = p1.map(CountOdd, List)

    p1.close()
    p1.join()
    
        
if __name__ == "__main__":
    main()