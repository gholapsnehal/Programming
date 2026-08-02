
#data missing asel tr ky krtat?


import pandas as pd

border = "-"*80
#####################################################################################
#
#   Step 1    : Load the dataset
#
#####################################################################################

print(border)
print("Step1  :  Load the dataset")
print(border)

DataPath = "iris.csv"

# dataframe
df = pd.read_csv(DataPath)

print("Dataset loaded successfully")

#sample entried first 5 or last 5 records

print("Initial entries from dataset are :")
print(df.head())

#####################################################################################
#
#   Step 2   : Data Analysis (EDA)
#
#####################################################################################

print(border)
print("Step 2   : Data Analysis (EDA)")
print(border)

print("Shape of dataset : ",df.shape)    # shape is property of df 

print("Column names : ",list(df.columns))

print("Column names : ",list(df.columns))

print("Missing values per column : ")
print(df.isnull().sum())

print("Class Distribution (species count")
print(df["species"].value_counts())

print("Statistical report of dataset : ")
print(df.describe())

#####################################################################################
#
#   Step 3   : Decide independent and dependent variables
#
#####################################################################################

print(border)
print("Step 3   : Decide Independent and Dependent variables")
print(border)

# X : Independent Variables (features)
# Y : Dependent Variables (Labels)

feature_cols = [
                    "sepal length (cm)",
                    "sepal width (cm)",
                    "petal length (cm)",
                    "petal width (cm)"
               ]

X = df[feature_cols]

Y = df["species"]

print("X Shape : ",X.shape)
print("Y Shape : ",Y.shape)


