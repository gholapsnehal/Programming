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

    # Training Features
    # Format : [Diameter, Surface]

    Independent = [
        [35,1],[47,1],[90,0],[48,1],[90,0],
        [35,1],[92,0],[35,1],[35,1],[35,1],
        [96,0],[43,1],[110,0]
    ]

    # Training Labels

    Dependent = [
        1,1,2,1,2,
        1,2,1,1,1,
        2,1,2
    ]

    # Testing Features

    Testing = [
        [35,1],
        [95,0]
    ]

    # Create Decision Tree model

    model = tree.DecisionTreeClassifier()

    # Train the model

    model.fit(Independent, Dependent)

    # Predict the class for testing data

    Result = model.predict(Testing)

    print("Predicted Result is :", Result)


############################################################################################
#
# Application Starter
#
############################################################################################

if __name__ == "__main__":
    main()