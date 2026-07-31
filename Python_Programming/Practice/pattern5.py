
####################################################################################################
#
# Function name: Display
# Input:         int
# Output:        None
# Description:   Display increasing and decreasing number pattern
#
# Pattern:
# 1
# 2   2
# 3   3   3
# 4   4   4   4
# 5   5   5   5   5
# 4   4   4   4
# 3   3   3
# 2   2
# 1
#
# Date :         31/07/2026
# Author:        Snehal Gholap
#
####################################################################################################

def Display(rows):

    for i in range(1, rows + 1):
        for j in range(1, i + 1):
            print(i, end="   ")

        print()

    for i in range(rows - 1, 0, -1):
        for j in range(i):
            print(i, end="   ")

        print()


def main():

    value = int(input("Enter number of rows : "))

    Display(value)


if __name__ == "__main__":
    main()