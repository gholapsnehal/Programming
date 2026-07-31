####################################################################################################
#
# Function name: Display
# Input:         int
# Output:        None
# Description:   Display increasing star pattern
#
# Pattern:
# *
# *        *
# *        *       *
# *        *       *       *
# *        *       *       *       *
#
# Date :         31/07/2026
# Author:        Snehal Gholap
#
####################################################################################################

def Display(No):

    for i in range(No):
        for j in range(i + 1):
            print("*\t", end=" ")

        print()


def main():

    value = int(input("Enter number : "))

    Display(value)


if __name__ == "__main__":
    main()