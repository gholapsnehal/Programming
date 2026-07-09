############################################################################################################
#
# Function name:   Display
# Input:           int
# Output:          None
# Description:     Display '*' on the screen as many times as the given number
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Display(No):

    for i in range(No):

        print("*",end="\t")


def main():
    
    Value = int(input("Enter Number : "))
    
    Display(Value)


  
if __name__ == "__main__":
    main()