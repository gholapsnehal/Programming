############################################################################################################
#
# Function name:   ListPrime
# Input:           int
# Output:          int
# Description:     Return the addition of all prime numbers from the list
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import MarvelNum

def ListPrime(data):

    Sum = 0

    for no in data:

        if(MarvelNum.ChkPrime(no) == True):
            Sum = Sum + no

    return Sum

    
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)


    Answer = ListPrime(List)

    print("Addition of prime elements is : ",Answer)

        
if __name__ == "__main__":
    main()