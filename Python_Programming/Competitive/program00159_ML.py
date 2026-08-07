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
#   Question 9 :
#   Create PerformanceIndex feature and train the model
#
#####################################################################################

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

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
#   Step 2 : Create New Feature
#
#####################################################################################

print(border)
print("Create PerformanceIndex Feature")
print(border)

df["PerformanceIndex"] = (df["StudyHours"] * 2) + df["Attendance"]

print("PerformanceIndex column added successfully")

print(df.head())

#####################################################################################
#
#   Step 3 : Select Features and Label
#
#####################################################################################

FeatureColumns = [
                    "StudyHours",
                    "Attendance",
                    "PreviousScore",
                    "AssignmentsCompleted",
                    "SleepHours",
                    "PerformanceIndex"
                 ]

X = df[FeatureColumns]

Y = df["FinalResult"]

#####################################################################################
#
#   Step 4 : Split the Dataset
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
#   Step 5 : Create and Train Model
#
#####################################################################################

print(border)
print("Create and Train Model")
print(border)

model = DecisionTreeClassifier(max_depth = 5)

model.fit(X_train, Y_train)

print("Model trained successfully")

#####################################################################################
#
#   Step 6 : Predict Results
#
#####################################################################################

Y_pred = model.predict(X_test)

#####################################################################################
#
#   Step 7 : Calculate Accuracy
#
#####################################################################################

print(border)
print("Calculate Accuracy")
print(border)

Accuracy = accuracy_score(Y_test, Y_pred)

print("Accuracy :", Accuracy * 100)