import pandas as pd

border = "-"*80

#####################################################################################
#
#    1 : Load the Dataset
#
#####################################################################################

print(border)
print("Load the dataset")
print(border)

DataPath = "student_performance_ml.csv"

df = pd.read_csv(DataPath)

print("Dataset loaded successfully")

#####################################################################################
#
#    2 : Display first 5 records
#
#####################################################################################

print(border)
print("Display first 5 records")
print(border)

print(df.head())

#####################################################################################
#
#    3 : Display last 5 records
#
#####################################################################################

print(border)
print("Display last 5 records")
print(border)

print(df.tail())

#####################################################################################
#
#    4 : Display total rows and columns
#
#####################################################################################

print(border)
print("Display total rows and columns")
print(border)


print("Shape of dataset : ",df.shape)

print("Total rows : ",df.shape[0])
print("Total columns : ",df.shape[1])

#####################################################################################
#
#    5 : Display column names
#
#####################################################################################

print(border)
print("Display column names")
print(border)

print(list(df.columns))

#####################################################################################
#
#    6 : Display data types
#
#####################################################################################

print(border)
print("Display data types")
print(border)

print(df.dtypes)

