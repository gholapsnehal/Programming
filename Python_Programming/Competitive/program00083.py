############################################################################################################
#
# Function name:   Frequency
# Input:           int,int
# Output:          int
# Description:     Accept a list of numbers and return the frequency of the given number
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Frequency(data,no):

    Count = 0

    for value in data:

        if(value == no):
            Count = Count + 1

    return Count

    
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    Search = int(input("Enter element to search : "))

    Answer = Frequency(List,Search)

    print("Frequency of  elements is : ",Answer)

        
if __name__ == "__main__":
    main()