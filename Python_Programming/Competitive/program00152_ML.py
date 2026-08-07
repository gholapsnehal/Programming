############################################################################
#
#   Case Study : Student Performance Prediction using Decision Tree
#
#   Objective :
#   Predict whether a student will Pass (1) or Fail (0) based on
#   StudyHours, Attendance, PreviousScore, AssignmentsCompleted
#   and SleepHours.
#
#   Author : Snehal Gholap
#   Date   : 06/08/2026
#
############################################################################

#####################################################################################
#
#   Question 2 :
#   Remove SleepHours feature and compare model accuracy.
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
#   Step 2 : Remove SleepHours Column
#
#####################################################################################

print(border)
print("Remove SleepHours Column")
print(border)

df = df.drop("SleepHours", axis = 1)

print("SleepHours column removed successfully")

#####################################################################################
#
#   Step 3 : Select Features and Label
#
#####################################################################################

print(border)
print("Select Features and Label")
print(border)

FeatureColumns = [
                    "StudyHours",
                    "Attendance",
                    "PreviousScore",
                    "AssignmentsCompleted"
                 ]

X = df[FeatureColumns]

Y = df["FinalResult"]

#####################################################################################
#
#   Step 4 : Split the Dataset
#
#####################################################################################

print(border)
print("Split the Dataset")
print(border)

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

print(border)
print("Predict Results")
print(border)

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

print("New Accuracy :", Accuracy * 100)