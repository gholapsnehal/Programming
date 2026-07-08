############################################################################################################
#
# Function name:   EvenList
# Input:           list
# Output:          None
# Description:     Calculate and display the sum of all even elements from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   OddList
# Input:           list
# Output:          None
# Description:     Calculate and display the sum of all odd elements from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

def EvenList(data):

    print("TID of EvenList thread is : ",threading.get_ident())

    sum = 0

    for i in data:
        if(i % 2 == 0):
            sum = sum + i

    print("Sum of even elements is : ",sum)


def OddList(data):

    print("TID of the OddList is : ",threading.get_ident())

    sum = 0

    for i in data:
        if(i % 2 != 0):
            sum = sum + i

    print("Sum of odd elements is : ",sum)

         
def main():

    print("TID of main thread is : ",threading.get_ident())

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):
        value = int(input())
        List.append(value)

    start_time = time.perf_counter()  

    t1 = threading.Thread(target=EvenList, args=(List,))

    t2 = threading.Thread(target=OddList, args=(List,))

    t1.start()
    t1.join()

    t2.start()
    t2.join()

   
    end_time = time.perf_counter()

    #print("Exit from main")

    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()