############################################################################################
#
# File Name    : BallClassification.py
# Description  : Ball Classification using Decision Tree Algorithm
# Author       : Snehal Gholap
# Date         : 01/08/2026
#
############################################################################################

from sklearn import tree

def main():

    print("------------------------------------------------")
    print("        Ball Classification Case Study")
    print("------------------------------------------------")

    # Encoding
    # Rough   = 1
    # Smooth  = 0
    # Tennis  = 1
    # Cricket = 2

    # Training Dataset
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
        [110, 0]
    ]

    # Training Labels

    Dependent = [
        1, 1, 2, 1, 2,
        1, 2, 1, 1, 1,
        2, 1, 2
    ]

    # Testing Dataset

    Testing_Features = [
        [35, 1],
        [95, 0]
    ]

    # Expected Labels

    Testing_Labels = [
        1,
        2
    ]

    print("Training Features are :")
    print(Independent)

    print()

    print("Training Labels are :")
    print(Dependent)

    print()

    print("Testing Features are :")
    print(Testing_Features)

    print()

    print("Expected Labels are :")
    print(Testing_Labels)


############################################################################################
#
# Application Starter
#
############################################################################################

if __name__ == "__main__":
    main()