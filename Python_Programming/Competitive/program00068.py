############################################################################################################
#
# Function name:   Display
# Input:           int
# Output:          None
# Description:     Display first 10 even numbers on the screen
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Display(No):

    for i in range(1, No + 1):

        print(i * 2, end="\t")


def main():
    
    Value = int(input("Enter Number : "))
    
    Display(Value)


  
if __name__ == "__main__":
    main()