############################################################################################################
#
# Function name:   Prime
# Input:           list
# Output:          None
# Description:     Display all prime numbers from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   NonPrime
# Input:           list
# Output:          None
# Description:     Display all non-prime numbers from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

def CheckPrime(No):

    if(No <= 1):
        return False
    
    for i in range(2,(No // 2), +1):
        if(No % i == 0):
            return False
        
    return True


def Prime(data):

    print("TID of prime thread is : ",threading.get_ident())

    print("Prime numbers are :")

    for i in data:
        if(CheckPrime(i)):
            print(i)

def NonPrime(data):

    print("TID of NonPrime thread is : ", threading.get_ident())

    print("Non Prime numbers are : ")

    for i in data:
        if(not CheckPrime(i)):
            print(i)


def main():

    print("TID of main thread is : ", threading.get_ident())

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter elements : ")

    for i in range(size):
        value = int(input())
        List.append(value)

    start_time = time.perf_counter()

    t1 = threading.Thread(target=Prime, args=(List,))
    t2 = threading.Thread(target=NonPrime, args=(List,))

    t1.start()
    t1.join()

    t2.start()
    t2.join()

    end_time = time.perf_counter()

    print("Exit from main")
    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()