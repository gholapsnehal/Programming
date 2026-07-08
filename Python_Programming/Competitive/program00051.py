############################################################################################################
#
# Function name:   DisplayEven
# Input:           int
# Output:          None
# Description:     Display first 10 even numbers using a separate thread
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   DisplayOdd
# Input:           int
# Output:          None
# Description:     Display first 10 odd numbers using a separate thread
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

def DisplayEven(No):

    print("TID of Even thread is : ",threading.get_ident())

    print(f"first {No} even numbers are : ")

    for i in range(1, No + 1,):
        print(i * 2)


def DisplayOdd(No):

    print("TID of the Odd thread is : ",threading.get_ident())

    print(f"First {No} odd numbers are : ")

    for i in range(No):
        print((i * 2) + 1)

       
def main():

    print("TID of main thread is : ",threading.get_ident())

    Value = int(input("Enter number : "))

    start_time = time.perf_counter()

    t1 = threading.Thread(target=DisplayEven, args=(Value,))

    t2 = threading.Thread(target=DisplayOdd, args=(Value,))

    t1.start()
    t1.join()

    t2.start()
    t2.join()

   
    end_time = time.perf_counter()

    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()