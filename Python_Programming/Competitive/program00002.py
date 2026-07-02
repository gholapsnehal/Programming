##################################################################################################
#
# Function name:   ChkGreater
# Input:           int,int
# Output:          None
# Description:     write a program which contains one function named as ChkGreater() that accepts 
#                  two numbers and prints the gretaer number
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
##################################################################################################

def ChkGreater(num1,num2):

    if(num1 > num2):
        print(num1,"is greater")
    else:
        print(num2,"is gretaer")

    
def main():

    No1 = 0
    No2 = 0

    print("Enter first number : ")
    No1 = int(input())

    print("Enter second number : ")
    No2 = int(input())

    ChkGreater(No1,No2)

if __name__ == "__main__":
    main()