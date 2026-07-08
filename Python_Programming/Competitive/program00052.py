############################################################################################################
#
# Function name:   EvenFactor
# Input:           int
# Output:          None
# Description:     Display the sum of all even factors of the given number
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   OddFactor
# Input:           int
# Output:          None
# Description:     Display the sum of all odd factors of the given number
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

def EvenFactor(No):

    print("TID of EvenFactor thread is : ",threading.get_ident())

    sum = 0

    for i in range(1, No + 1,):
        if((No % i == 0) and (i % 2 == 0)):
            sum = sum + i

    print("Sum of even factors is : ",sum)


def OddFactor(No):

    print("TID of the OddFactor is : ",threading.get_ident())

    sum = 0

    for i in range(1, No + 1):
        if((No % i == 0) and (i % 2 != 0)):
            sum = sum + i

    print("Sum of odd factors is : ",sum)

         
def main():

    print("TID of main thread is : ",threading.get_ident())

    Value = int(input("Enter number : "))

    start_time = time.perf_counter()

    t1 = threading.Thread(target=EvenFactor, args=(Value,))

    t2 = threading.Thread(target=OddFactor, args=(Value,))

    t1.start()
    t1.join()

    t2.start()
    t2.join()

   
    end_time = time.perf_counter()

    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()