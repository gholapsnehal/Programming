############################################################################################################
#
# Function name:   ChkPerfect
# Input:           int
# Output:          bool
# Description:     write a program which accepts one number and checks whether it is perfect number or not
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def ChkPerfect(Number):

   Sum = 0

   for i in range(1,Number):
       
       if(Number % i == 0):
           Sum = Sum + i

   if(Sum == Number):
       
       return True
   else:
       return False
       

def main():

    Value1 = int(input("Enter number : "))
    
    Result = ChkPerfect(Value1)

    if(Result):
        print("Perfect number")
    else:
        print("not a perfect number")
    
if __name__ == "__main__":
    main()