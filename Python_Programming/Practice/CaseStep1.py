# TASK -> scripting code have to convert in procedural

# pandas - 1. series when want to fetch one row single record : 1D, 2. dataframe : 2D, 3. panel -> removed from pandas

import pandas as pd

border = "-"*80
#####################################################################################
#
#   Step1    : Load the dataset
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