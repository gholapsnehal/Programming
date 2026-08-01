############################################################################################
#
# File Name    : BallClassification.py
# Description  : Ball Classification Case Study
# Author       : Snehal Gholap
# Date         : 01/08/2026
#
############################################################################################

def main():

    print("------------------------------------------------")
    print("        Ball Classification Case Study")
    print("------------------------------------------------")

    # Independent Variables (Features)
    # Format : [Diameter, Surface]

    Independent = [
        [35, 1],
        [47, 1],
        [90, 0],
        [48, 1],
        [90, 0],
        [35, 1],
        [92, 0],
        [35, 1],
        [35, 1],
        [35, 1],
        [96, 0],
        [43, 1],
        [110, 0],
        [35, 1],
        [95, 0]
    ]

    # Dependent Variable (Labels)

    Dependent = [
        1, 1, 2, 1, 2,
        1, 2, 1, 1, 1,
        2, 1, 2, 1, 2
    ]

    print("Independent Variables are : ")
    print(Independent)

    print()

    print("Dependent Variables are : ")
    print(Dependent)


############################################################################################
#
# Starter
#
############################################################################################

if __name__ == "__main__":
    main()