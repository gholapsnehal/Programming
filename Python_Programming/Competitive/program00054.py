############################################################################################################
#
# Function name:   Small
# Input:           string
# Output:          None
# Description:     Count and display the number of lowercase characters
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   Capital
# Input:           string
# Output:          None
# Description:     Count and display the number of uppercase characters
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

############################################################################################################
#
# Function name:   Digits
# Input:           string
# Output:          None
# Description:     Count and display the number of numeric digits
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import threading
import time

def Small(data):

    print("TID of Small thread is : ",threading.get_ident())
    print("Thread name : ",threading.current_thread().name)

    count = 0

    for ch in data:
        if(ch >= 'a' and ch <= 'z'):
            count = count + 1

    print("Number of lowercase characters is : ",count)


def Capital(data):

    print("TID of the OddList is : ",threading.get_ident())
    print("Thread name : ",threading.current_thread().name)

    count = 0

    for ch in data:
        if(ch >= 'A' and ch <= 'Z'):
            count = count + 1

    print("Number of uppercase characters : ",count)

def Digits(data):

    print("TID of the Digit thread is : ",threading.get_ident())
    print("Thread name : ",threading.current_thread().name)

    count = 0

    for ch in data:
        if(ch >= '0' and ch <= '9'):
            count = count + 1

    print("Number of digits : ",count)

        
def main():

    print("TID of main thread is : ",threading.get_ident())

    value = input("Enter string :")

    start_time = time.perf_counter()

    t1 = threading.Thread(target=Small, args=(value,), name="Small")

    t2 = threading.Thread(target=Capital, args=(value,), name="Capital")

    t3 = threading.Thread(target=Digits, args=(value,), name="Digits")

    t1.start()
    t1.join()

    t2.start()
    t2.join()

    t3.start()
    t3.join()
   
    end_time = time.perf_counter()

    print("Exit from main")

    print(f"Time required is : {end_time - start_time:4f}")


if __name__ == "__main__":
    main()