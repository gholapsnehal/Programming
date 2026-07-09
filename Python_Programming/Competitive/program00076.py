############################################################################################################
#
# Function name:   Display
# Input:           int
# Output:          None
# Description:     Display the given number pattern
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Display(No):

    for i in range(No):

        for j in range(1, No + 1):

            print(j, end="\t")

        print()

    
def main():

    Value = int(input("Enter number : "))

    Display(Value)

      
if __name__ == "__main__":
    main()