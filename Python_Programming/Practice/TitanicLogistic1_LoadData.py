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


#----------------------------------------------------------------------------------------
#      Function Name : main
#      Description   : Entry Point function
#      Input         : None
#      Output        : None
#      Author        : Snehal Gholap
#      Date          : 16/08/2026
#----------------------------------------------------------------------------------------

   
def main():

    LoadData("MarvellousTitanicDataset.csv")



if __name__ == "__main__":
    main()