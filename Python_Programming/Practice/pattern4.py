
####################################################################################################
#
# Function name: Display
# Input:         int
# Output:        None
# Description:   Display increasing and decreasing star pattern
#
# Pattern:
# *
# * *
# * * *
# * * * *
# * * * * *
# * * * *
# * * *
# * *
# *
#
# Date :         31/07/2026
# Author:        Snehal Gholap
#
####################################################################################################

def Display(rows):

    for i in range(1, rows + 1):
        for j in range(1, i + 1):
            print("*", end="   ")

        print()

    for i in range(rows - 1, 0, -1):
        for j in range(i):
            print("*", end="   ")

        print()


def main():

    value = int(input("Enter number of rows : "))

    Display(value)


if __name__ == "__main__":
    main()