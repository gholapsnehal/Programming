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

# Step 4: Statistical summary
    
    print(border)
    print("Step 4: Statistical summary")
    print(border)

    print(df.describe())

#################################################################################

# Step 5: Correlation
    
    print(border)
    print("Step 5: Correlation")
    print(border)

    print(df.corr())

#################################################################################

# Step 6: Separate Independent and dependent variables
    
    print(border)
    print("Step 6: Split Independent and dependent variables")
    print(border)

    X = df[["TV","radio","newspaper"]]

    Y = df["sales"]

    print("Independent variables :")
    print(X.head())

    print("Dependent variables :")
    print(Y.head())


#################################################################################

# Step 7: Split the dataset
    
    print(border)
    print("Step 7: Split the dataset")
    print(border)

    X_train, X_test, Y_train, Y_test = train_test_split(
        X,
        Y,
        test_size=0.2,
        random_state=42
    )

    print("Training data :", X_train.shape)  # (160, 3)
    print("Testing data : ",X_test.shape)    #  (40, 3)

#################################################################################

# Step 8: Create and train the model
    
    print(border)
    print("Step 8: Create and train the model")
    print(border)

    model = LinearRegression()

    model = model.fit(X_train,Y_train)

    print("Model Trained Successfully")

#################################################################################

# Step 9: Test the model
    
    print(border)
    print("Step 9: Test the model")
    print(border)

    Y_pred = model.predict(X_test)   # to predict :X_test


    print("Expected Answers : ")
    print(Y_test[:3])

    print("Predicted Answers : ")
    print(Y_pred[:3])

#################################################################################

# Step 10: Evaluate the model
    
    print(border)
    print("Step 10: Evaluate the model")
    print(border)

    MSE = mean_squared_error(Y_test,Y_pred)

    RMSE = np.sqrt(MSE)

    R2 = r2_score(Y_test,Y_pred)

    print("MSE    : ",MSE)
    print("RMSE   : ",RMSE)
    print("R2     : ",R2)


#################################################################################

# Step 11: Display Coefficient
    
    print(border)
    print("Step 11: Display Coefficient")
    print(border)

    print("TV Coefficient        : ",model.coef_[0])
    print("radio Coefficient     : ",model.coef_[1])
    print("newspaper Coefficient : ",model.coef_[2])


    print("Intercept             : ",model.intercept_)


#################################################################################

def main():

    AdvRegression("Advertising.csv")



#################################################################################


if __name__ == "__main__":
    main()


#################################################################################