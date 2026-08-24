###################################################################################################
#
# Assignment 47 Q.7  : Linear Regression
# Description        : Predict marks based on study hours
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
# program should 
#     1. Train the regression model
#     2. print the coefficient
#     3. print the intercept
#
###################################################################################################

import pandas as pd

from sklearn.linear_model import LinearRegression

###################################################################################################

def main():

    Data = {
        "StudyHours" : [1,2,3,4,5],
        "Marks" : [50,55,60,65,70]
    }

    df = pd.DataFrame(Data)

    X = df[["StudyHours"]]
    Y = df["Marks"]

    model = LinearRegression()

    model.fit(X,Y)

    print("Coefficient :",model.coef_[0])
    print("Intercept :",model.intercept_)

###################################################################################################

if __name__ == "__main__":
    main()

###################################################################################################