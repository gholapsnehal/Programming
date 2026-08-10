############################################################################
#
#   Case Study  : Wine predictor
#                 Machine Learning application which classifies wine samples
#                 into three different classes based on their chemical
#                 properties using Decision Tree Classification algorithm.
#                 The application loads the Wine dataset, performs data
#                 analysis, trains the model, tests the model and
#                 calculates prediction accuracy
#   Date        : 10/08/2026
#   Author      : Snehal Gholap
#
############################################################################

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score


def LoadData(FileName):

    border = "-"*80

    df = pd.read_csv(FileName)

    print(border)
    print("Dataset loaded successfully")
    print(border)

    return df

def DataAnalysis(DataFrame):

    border = "-"*80

    print(border)
    print("Dataset Information")
    print(border)

    print("Shape of dataset : ",DataFrame.shape)

    print("\nFirst 5 records")
    print(DataFrame.head())

############################################################3

def TrainModel(X_train,Y_train):
    border = "-"*80

    model = DecisionTreeClassifier()

    model.fit(X_train,Y_train)

    print(border)
    print("Model trained successfully")
    print(border)

    return model


def main():

    border = "-"*80

    df = LoadData("WinePredictor.csv")

    DataAnalysis(df)

    X = df.drop("Class", axis=1)
    Y = df["Class"]

    X_train,X_test,Y_train,Y_test = train_test_split(
        X,
        Y,
        test_size=0.2,
        random_state=42
    )

    print(border)
    print("Training data size : ",X_train.shape)
    print("Testing data size : ",X_test.shape)
    print(border)

    model = TrainModel(X_train,Y_train)

    Y_pred = model.predict(X_test)

    Accuracy = accuracy_score(Y_test,Y_pred)

    print("Accuracy of model : ",Accuracy * 100)

    

if __name__ == "__main__":
    main()
