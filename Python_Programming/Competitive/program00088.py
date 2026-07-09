############################################################################################################
#
# Function name:   SumPower
# Input:           int
# Output:          int
# Description:     Return the addition of fifth powers from 1 to the given number
# Date :           09/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

from multiprocessing import Pool
import time

def SumPower(No):

    Sum = 0

    for i in range(1, No + 1):

        Sum = Sum + (i ** 5)

    return Sum
   
   
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    start_time = time.perf_counter()

    p1 = Pool()

    Answer = p1.map(SumPower, List)

    p1.close()
    p1.join()

    end_time = time.perf_counter()
    
    print("Sum of power is : ",Answer)

    print(f"Time required is : {end_time - start_time:4f}")
        
if __name__ == "__main__":
    main()