############################################################################################################
#
# Function name:   Maximum
# Input:           list
# Output:          int
# Description:     Accept a list of numbers and return the maximum element
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Maximum(data):

    Max = data[0]

    for No in data:

        if(No > Max):

            Max = No

    return Max

    
def main():

    List = []

    size = int(input("Enter number of elements : "))

    print("Enter the elements : ")

    for i in range(size):

        Value = int(input())

        List.append(Value)

    Answer = Maximum(List)

    print("Maximum elements is : ",Answer)

        
if __name__ == "__main__":
    main()