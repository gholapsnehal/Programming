############################################################################################################
#
# Function name:   SumEven
# Input:           int
# Output:          int
# Description:     Return the addition of all even numbers from 1 to the given number
# Date :           09/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from multiprocessing import Pool
import os

def SumEven(No):

    Sum = 0

    for i in range(2, No + 1, 2):

        Sum = Sum + i

    print("Process ID : ",os.getpid())
    print("Given number : ",No)
    print("Sum of Even numbers : ",Sum)
    print()

    return Sum
   
   
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    p1 = Pool()

    Answer = p1.map(SumEven, List)

    p1.close()
    p1.join()
    
        
if __name__ == "__main__":
    main()