############################################################################################################
#
# Function name:   Counter
# Input:           int
# Output:          None
# Description:     Increment the shared counter using Lock
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

Counter = 0

Lock = threading.Lock()

def Increment(No):

    global Counter

    print("TID of Increment is : ",threading.get_ident())

    for i in range(No):

        Lock.acquire()

        Counter = Counter + 1

        Lock.release()


def main():

    global Counter

    print("TID of main thread is : ", threading.get_ident())

    value = int(input("Enter number of iterations : "))

    start_time = time.perf_counter()

    t1 = threading.Thread(target=Increment, args=(value,))
    t2 = threading.Thread(target=Increment, args=(value,))

    t1.start()
    t1.join()

    t2.start()
    t2.join()

    end_time = time.perf_counter()

    print("Final value of counter is : ",Counter)
    print("Exit from main")
    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()