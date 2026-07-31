####################################################################################################
#
# Function name: Display
# Input:         int
# Output:        None
# Description:   Display star pattern in a single line
#
# Pattern:       * * * * *
#
# Date :         31/07/2026
# Author:        Snehal Gholap
#
####################################################################################################

def Display(No):

    for i in range(No):
        print("*", end=" ")


def main():

    Value = int(input("Enter Number : "))

    Display(Value)


if __name__ == "__main__":
    main()