############################################################################
#
#   Case Study : Student Performance Prediction using Decision Tree
#
#   Objective :
#   Predict whether a student will Pass (1) or Fail (0) based on
#   StudyHours, Attendance, PreviousScore, AssignmentsCompleted
#   and SleepHours.
#
#   Author    :  Snehal Gholap
############################################################################

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

#####################################################################################
#
#   Step 5 : Display Feature Importance
#
#####################################################################################

print(border)
print("Feature Importance")
print(border)

for iCnt in range(len(FeatureColumns)):
    print(FeatureColumns[iCnt], ":", model.feature_importances_[iCnt])

#####################################################################################
#
#   Step 6 : Most and Least Important Feature
#
#####################################################################################

print(border)
print("Most and Least Important Feature")
print(border)

Importance = pd.Series(
                        model.feature_importances_,
                        index = FeatureColumns
                       )

print("Most Important Feature  :", Importance.idxmax())

print("Least Important Feature :", Importance.idxmin())