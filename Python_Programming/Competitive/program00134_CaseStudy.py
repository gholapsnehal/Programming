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
#    2 : Display total number of students
#
#####################################################################################

print(border)
print("Display total number of students")
print(border)

print("Total students : ", len(df))

#####################################################################################
#
#    3 : Count passed students
#
#####################################################################################

print(border)
print("Count passed students")
print(border)

PassedStudents = len(df[df["FinalResult"] == 1])

print("Total passed students : ",PassedStudents)

#####################################################################################
#
#    4 : Count failed students
#
#####################################################################################

print(border)
print("Count failed students")
print(border)

FailedStudents = len(df[df["FinalResult"] == 0])

print("Total failed students : ",FailedStudents)