############################################################################################################
#
# Function name:   PrimeCount
# Input:           int
# Output:          int
# Description:     Count the number of prime numbers between 1 and the given number
# Date :           09/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from multiprocessing import Pool

def PrimeCount(No):

    Count = 0

    for i in range(2, No + 1):

        Flag = True

        for j in range(2, i):

            if(i % j == 0):

                Flag = False
                break

        if(Flag == True):

            Count = Count + 1

    return Count
   
   
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    p1 = Pool()

    Answer = p1.map(PrimeCount, List)

    p1.close()
    p1.join()

    print("Prime Count : ",Answer)
        
if __name__ == "__main__":
    main()