############################################################################################################
#
# Function name:   Maximum
# Input:           list
# Output:          None
# Description:     Display the maximum element from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   Minimum
# Input:           list
# Output:          None
# Description:     Display the minimum element from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

def Maximum(data):

    print("TID of Maximum thread is : ",threading.get_ident())

    Max = data[0]

    for i in data:
        if(i > Max):
            Max = i

    print("Maximum element is : ",Max)


def Minimum(data):

    print("TID of Minimum thread is : ", threading.get_ident())

    Min = data[0]

    for i in data:
        if(i < Min):
            Min = i

    print("Minimum element is : ", Min)


def main():

    print("TID of main thread is : ", threading.get_ident())

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter elements : ")

    for i in range(size):
        value = int(input())
        List.append(value)

    start_time = time.perf_counter()

    t1 = threading.Thread(target=Maximum, args=(List,))
    t2 = threading.Thread(target=Minimum, args=(List,))

    t1.start()
    t1.join()

    t2.start()
    t2.join()

    end_time = time.perf_counter()

    print("Exit from main")
    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()