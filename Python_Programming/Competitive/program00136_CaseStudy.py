
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

DataPath = ("student_performance_ml.csv")

df = pd.read_csv(DataPath)

print("Dataset loaded successfully")

#####################################################################################
#
#    2 : Distribution of FinalResult
#
#####################################################################################

print(border)
print("Distribution of FinalResult")
print(border)

ResultCount = df["FinalResult"].value_counts()

print(ResultCount)

#####################################################################################
#
#    3 : Calculate pass percentage
#
#####################################################################################

print(border)
print("Pass percentage")
print(border)

TotalStudents = len(df)

PassedStudents = ResultCount[1]

PassPercentange = (PassedStudents / TotalStudents) * 100

print("Pass Percentage : ",PassPercentange)

#####################################################################################
#
#    4 : Calculate fail percentage
#
#####################################################################################

print(border)
print("Fail percentage")
print(border)

FailedStudents = ResultCount[0]

FailPercentage = (FailedStudents / TotalStudents) * 100

print("Fail Percentage : ",FailPercentage)

#####################################################################################
#
#    5 : Check Dataset Balance
#
#####################################################################################

print(border)
print("Dataset Analysis")
print(border)

if abs(PassPercentange - FailPercentage) <= 10:
    print("Dataset is Balanced")
else:
    print("Dataset is Not Balanced")
