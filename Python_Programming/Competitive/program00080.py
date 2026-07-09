############################################################################################################
#
# Function name:   ListSum
# Input:           list
# Output:          int
# Description:     Accept a list of numbers and return the addition of all elements
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def ListSum(data):

    Sum = 0

    for No in data:

        Sum = Sum + No

    return Sum

    
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    Answer = ListSum(List)

    print("Addition of all elements is : ",Answer)

        
if __name__ == "__main__":
    main()