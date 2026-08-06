
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
#    2 : Calculate average study hours
#
#####################################################################################

print(border)
print("Calculate average study hours")
print(border)

AvgStudyHours = df["StudyHours"].mean()

print("Average StudyHours : ",AvgStudyHours)

#####################################################################################
#
#    3 : Calculate average attendance
#
#####################################################################################

print(border)
print("Calculate average attendance")
print(border)

AvgAttendance = df["Attendance"].mean()

print("Average Attendance : ",AvgAttendance)

#####################################################################################
#
#    4 : Calculate maximum previousScore
#
#####################################################################################

print(border)
print("Calculate maximum previousScore")
print(border)

MaxScore = df["PreviousScore"].max()

print("Maximum PreviousScore : ",MaxScore)

#####################################################################################
#
#    5 : Calculate minimum SleepHours
#
#####################################################################################

print(border)
print("Calculate minimum SleepHours")
print(border)

MinSleep = df["SleepHours"].min()

print("Minimum SleepHours : ",MinSleep)

