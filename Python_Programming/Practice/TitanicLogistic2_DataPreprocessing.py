import pandas as pd
import numpy as np
import joblib as jb

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score, confusion_matrix


# pipeline

# Step 1: Load data

#----------------------------------------------------------------------------------------
#      Function Name : LoadData
#      Description   : Load the data from csv
#      Input         : Name of csv file
#      Output        : Data Frame
#      Author        : Snehal Gholap
#      Date          : 16/08/2026
#----------------------------------------------------------------------------------------

def LoadData(filename):

    df = pd.read_csv(filename)

    print("dataset loaded successfully")
    print(df.head())

    return df


# Step 2: Data Preprocessing

#----------------------------------------------------------------------------------------
#      Function Name : PreprocessData
#      Description   : It performs data analysis
#      Input         : dataframe
#      Output        : updated dataframe
#      Author        : Snehal Gholap
#      Date          : 16/08/2026
#----------------------------------------------------------------------------------------

def PreprocessData(df):

    df = df.drop([
        "Passengerid",
        "zero",
        "name"
    ],
    errors = "ignore"
    )

    # handle misisng values

    df["Age"] = df["Age"].fillna(df["Age"].median())

    df["Fare"] = df["Fare"].fillna(df["Fare"].median())

    df["Embarked"] = df["Embarked"].fillna(df["Embarked"].mode()[0])


# convert categorical to numeric data

    df = pd.get_dummies(
        df,
        columns=["Embarked"],
        drop_first= True,
        dtype=int
    )


    print(df.head())

    print("Data preprocessing completed")


    return df

   


#----------------------------------------------------------------------------------------
#      Function Name : main
#      Description   : Entry Point function
#      Input         : None
#      Output        : None
#      Author        : Snehal Gholap
#      Date          : 16/08/2026
#----------------------------------------------------------------------------------------

   
def main():

    # setp 1:

    df = LoadData("MarvellousTitanicDataset.csv")

    # setp 2:

    df = PreprocessData(df)






if __name__ == "__main__":
    main()