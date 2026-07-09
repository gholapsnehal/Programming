############################################################################################################
#
# Function name:   SumSquare
# Input:           int
# Output:          int
# Description:     Return the sum of squares from 1 to the given number
# Date :           09/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from multiprocessing import Pool

def SumSquare(No):

    Sum = 0

    for i in range(1, No + 1):

        Sum = Sum + (i * i)

    return Sum
   
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    p1 = Pool()

    Answer = p1.map(SumSquare, List)

    p1.close()
    p1.join()

    print("Sum of squares : ",Answer)

        
if __name__ == "__main__":
    main()