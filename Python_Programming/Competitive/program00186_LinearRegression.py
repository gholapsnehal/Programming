###################################################################################################
#
# Assignment 47 Q.9  : Multiple Linear Regression
# Description        : Predict marks using StudyHours and SleepHours
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
# program should 
#     1. Train the regression model using this dataset
#     2. print the coefficient for both features
#     3. print the intercept
#
###################################################################################################

import pandas as pd

from sklearn.linear_model import LinearRegression

###################################################################################################

def main():

    Data = {
        "StudyHours" : [1,2,3,4,5],
        "SleepHours" : [7,6,7,6,8],
        "Marks" : [50,55,60,65,70]
    }

    df = pd.DataFrame(Data)

    X = df[["StudyHours","SleepHours"]]
    Y = df["Marks"]

    model = LinearRegression()

    model.fit(X,Y)

    print("Coefficients :",model.coef_)
    print("Intercept :",model.intercept_)

###################################################################################################

if __name__ == "__main__":
    main()

###################################################################################################