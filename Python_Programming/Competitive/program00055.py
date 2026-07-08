############################################################################################################
#
# Function name:   Thread1
# Input:           None
# Output:          None
# Description:     Display numbers from 1 to 50
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   Thread2
# Input:           None
# Output:          None
# Description:     Display numbers from 50 to 1
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

def Thread1():

    print("TID of Thread1 is : ",threading.get_ident())

    print("Numbers from 1 to 50 are : ")

    for i in range(1,51):
        print(i)


def Thread2():

    print("TID of Thread2 is : ",threading.get_ident())
    print("Numbers from 50 to 1 are : ")

    for i in range(50,0,-1):
        print(i)


def main():

    print("TID of main thread is : ",threading.get_ident())

    start_time = time.perf_counter()

    t1 = threading.Thread(target=Thread1)
    t2 = threading.Thread(target=Thread2)

    t1.start()
    t1.join()

    t2.start()
    t2.join()
   
    end_time = time.perf_counter()

    print("Exit from main")

    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()