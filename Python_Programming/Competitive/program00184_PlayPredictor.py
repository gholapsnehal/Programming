###################################################################################################
#
# Assignment : Weather Play Predictor
# Description : Predict whether to play or not using Logistic Regression
# Author : Snehal Gholap
# Date   : 24/08/2026
#
###################################################################################################

import pandas as pd

from sklearn.preprocessing import LabelEncoder
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score

###################################################################################################

def main():

    # Step 1 : Load Dataset

    df = pd.read_csv("MarvellousInfosystems_PlayPredictor.csv")

    print("Dataset loaded successfully...\n")

    #################################################################

    # Step 2 : Remove Serial Number Column

    df = df.drop(df.columns[0], axis = 1)

    #################################################################

    # Step 3 : Encode Categorical Data

    le_wether = LabelEncoder()
    le_temperature = LabelEncoder()
    le_play = LabelEncoder()

    df["Wether"] = le_wether.fit_transform(df["Wether"])
    df["Temperature"] = le_temperature.fit_transform(df["Temperature"])
    df["Play"] = le_play.fit_transform(df["Play"])

    #################################################################

    # Step 4 : Separate Features and Target

    X = df[["Wether","Temperature"]]
    Y = df["Play"]

    #################################################################

    # Step 5 : Split Dataset

    X_train, X_test, Y_train, Y_test = train_test_split(
        X,
        Y,
        test_size = 0.2,
        random_state = 42
    )

    #################################################################

    # Step 6 : Train Model

    model = LogisticRegression()

    model.fit(X_train, Y_train)

    #################################################################

    # Step 7 : Test Model

    Y_pred = model.predict(X_test)

    Accuracy = accuracy_score(Y_test, Y_pred)

    print("Accuracy of model :", Accuracy * 100)

    #################################################################

    # Step 8 : Accept User Input

    print("\nValid Weather Values : Sunny, Overcast, Rainy")
    print("Valid Temperature Values : Hot, Mild, Cool")

    Weather = input("\nEnter Weather : ")
    Temperature = input("Enter Temperature : ")

    #################################################################

    # Step 9 : Convert Input into Encoded Form

    Weather = le_wether.transform([Weather])[0]
    Temperature = le_temperature.transform([Temperature])[0]

    #################################################################

    # Step 10 : Prediction

    NewData = [[Weather, Temperature]]

    Result = model.predict(NewData)

    #################################################################

    # Step 11 : Display Result

    if(Result[0] == 1):
        print("\nPrediction : Yes")
    else:
        print("\nPrediction : No")

###################################################################################################

if __name__ == "__main__":
    main()

###################################################################################################