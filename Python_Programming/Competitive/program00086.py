############################################################################################################
#
# Function name:   Factorial
# Input:           int
# Output:          int
# Description:     Return the factorial of the given number
# Date :           09/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from multiprocessing import Pool
import os

def Factorial(No):

    Result = 1

    for i in range(1, No + 1):

        Result = Result * i

    print("Process ID : ",os.getpid())
    print("Given number : ",No)
    print("Factorial : ",Result)
    print()

    return Result
   
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    p1 = Pool()

    Answer = p1.map(Factorial, List)

    p1.close()
    p1.join()

        
if __name__ == "__main__":
    main()