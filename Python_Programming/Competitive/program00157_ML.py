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
#   Question 7 :
#   Compare testing accuracy using different random_state values
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
#   Step 3 : Compare Different Random States
#
#####################################################################################

print(border)
print("Compare Different Random States")
print(border)

RandomStateList = [0, 10, 42]

for iCnt in range(len(RandomStateList)):

    X_train, X_test, Y_train, Y_test = train_test_split(
                                                            X,
                                                            Y,
                                                            test_size = 0.3,
                                                            random_state = RandomStateList[iCnt]
                                                         )

    model = DecisionTreeClassifier(max_depth = 5)

    model.fit(X_train, Y_train)

    Y_pred = model.predict(X_test)

    Accuracy = accuracy_score(Y_test, Y_pred)

    print("Random State :", RandomStateList[iCnt])
    print("Testing Accuracy :", Accuracy * 100)

    print(border)