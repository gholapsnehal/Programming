import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, r2_score

def AdvRegression(DataPath):

    border = "-"*80
    # Step 1: Load the data

    print(border)
    print("Step 1: Load the data")
    print(border)

    df = pd.read_csv(DataPath)

    print(df.head())

#################################################################################

    # Step 2: Remove unwanted columns (EDA)
    
    print(border)
    print("Step 2: Remove unwanted columns")
    print(border)

    if "Unnamed: 0" in df.columns:

        df = df.drop(columns=["Unnamed: 0"])

    print(df.head())



# Step 3: Check missing values
    
    print(border)
    print("Step 3: Check missing values")
    print(border)

    print("Total missing values : ")
    print(border)
    print(df.isnull().sum())


#################################################################################



def main():

    AdvRegression("Advertising.csv")


if __name__ == "__main__":
    main()