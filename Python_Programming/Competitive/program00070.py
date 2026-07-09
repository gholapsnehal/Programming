############################################################################################################
#
# Function name:   main
# Input:           int,int
# Output:          None
# Description:     Accept two numbers from user and call Arithmetic module functions
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

import Arithmetic

def main():
    
    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))
    
    Answer = Arithmetic.Add(Value1,Value2)
    print("Addition is : ",Answer)

    Answer = Arithmetic.Sub(Value1,Value2)
    print("Substraction is : ",Answer)

    Answer = Arithmetic.Mult(Value1,Value2)
    print("Multiplication is : ",Answer)

    Answer = Arithmetic.Div(Value1,Value2)
    print("Division is : ",Answer)


  
if __name__ == "__main__":
    main()