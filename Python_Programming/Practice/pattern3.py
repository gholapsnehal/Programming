
####################################################################################################
#
# Function name: Display
# Input:         int
# Output:        None
# Description:   Display increasing number pattern
#
# Pattern:
# 1
# 1 2
# 1 2 3
# 1 2 3 4
# 1 2 3 4 5
#
# Date :         31/07/2026
# Author:        Snehal Gholap
#
####################################################################################################

def Display(rows):

    for i in range(1, rows + 1):
        for j in range(1, i + 1):
            print(j, end=" ")

        print()


def main():

    value = int(input("Enter number of rows : "))

    Display(value)


if __name__ == "__main__":
    main()