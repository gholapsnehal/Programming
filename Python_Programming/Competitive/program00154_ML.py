############################################################################
#
#   Case Study : Student Performance Prediction using Decision Tree
#
#   Objective :
#   Predict whether a student will Pass (1) or Fail (0) based on
#   StudyHours, Attendance, PreviousScore, AssignmentsCompleted
#   and SleepHours
#
#   Author : Snehal Gholap
#
############################################################################

#####################################################################################
#
#   Question 4 :
#   Predict Pass or Fail for 5 new students
#
#####################################################################################

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier

border = "-" * 80

#####################################################################################
#
#   Step 1 : Load the Dataset
#
#####################################################################################

print(border)
print("Load the Dataset")
print(border)

DataPath = "student_performance_ml.csv"

df = pd.read_csv(DataPath)

print("Dataset loaded successfully")

#####################################################################################
#
#   Step 2 : Select Features and Label
#
#####################################################################################

FeatureColumns = [
                    "StudyHours",
                    "Attendance",
                    "PreviousScore",
                    "AssignmentsCompleted",
                    "SleepHours"
                 ]

X = df[FeatureColumns]

Y = df["FinalResult"]

#####################################################################################
#
#   Step 3 : Split the Dataset
#
#####################################################################################

X_train, X_test, Y_train, Y_test = train_test_split(
                                                        X,
                                                        Y,
                                                        test_size = 0.3,
                                                        random_state = 42
                                                     )

#####################################################################################
#
#   Step 4 : Create and Train Model
#
#####################################################################################

model = DecisionTreeClassifier(max_depth = 5)

model.fit(X_train, Y_train)

print("Model trained successfully")

#####################################################################################
#
#   Step 5 : Create New Student Data
#
#####################################################################################

print(border)
print("New Student Data")
print(border)

StudentData = pd.DataFrame(
                            {
                                "StudyHours" : [2, 4, 6, 8, 5],
                                "Attendance" : [60, 75, 85, 95, 80],
                                "PreviousScore" : [40, 55, 68, 85, 62],
                                "AssignmentsCompleted" : [2, 5, 7, 10, 6],
                                "SleepHours" : [5, 6, 7, 8, 7]
                            }
                          )

print(StudentData)

#####################################################################################
#
#   Step 6 : Predict Results
#
#####################################################################################

print(border)
print("Prediction Results")
print(border)

Result = model.predict(StudentData)

for iCnt in range(len(Result)):

    print("Student", iCnt + 1)

    if(Result[iCnt] == 1):
        print("Result : Pass")
    else:
        print("Result : Fail")

    print(border)