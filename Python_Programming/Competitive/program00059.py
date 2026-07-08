############################################################################################################
#
# Function name:   Sum
# Input:           list
# Output:          None
# Description:     Calculate the sum of all elements from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   Product
# Input:           list
# Output:          None
# Description:     Calculate the product of all elements from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time


def Sum(data):

    print("TID of Sum thread is : ",threading.get_ident())

    Result = 0

    for i in data:
        Result = Result + i

    print("Sum of elements is : ",Result)

def Product(data):

    print("TID of product thread is : ", threading.get_ident())

    Result = 1

    for i in data:
        Result = Result * i

    print("Product of elements is : ",Result)


def main():

    print("TID of main thread is : ", threading.get_ident())

    List = []

    size = int(input("Enter number of elements :"))

    print("Enter elements : ")

    for i in range(size):
        value = int(input())
        List.append(value)

    start_time = time.perf_counter()

    t1 = threading.Thread(target=Sum, args=(List,))
    t2 = threading.Thread(target=Product, args=(List,))

    t1.start()
    t1.join()

    t2.start()
    t2.join()

    end_time = time.perf_counter()

    print("Exit from main")
    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()