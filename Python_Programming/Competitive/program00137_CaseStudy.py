
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
#    2 : Average StudyHours for pass and fail students
#
#####################################################################################

print(border)
print("Average StudyHours Analysis")
print(border)

print(df.groupby("FinalResult")["StudyHours"].mean())

#####################################################################################
#
#    3 : Average Attendance for pass and fail students
#
#####################################################################################

print(border)
print("Average Attendance Analysis")
print(border)

print(df.groupby("FinalResult")["Attendance"].mean())
