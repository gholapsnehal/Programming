############################################################################################################
#
# Function name:   Display
# Input:           int
# Output:          None
# Description:     Display the given star pattern
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Display(No):

    for i in range(No):

        for j in range(No - i):

            print("*", end="\t")

        print()

    
def main():

    Value = int(input("Enter number : "))

    Display(Value)

      
if __name__ == "__main__":
    main()