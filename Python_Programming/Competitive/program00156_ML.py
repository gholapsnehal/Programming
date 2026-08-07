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
#
############################################################################

#####################################################################################
#
#   Question 6 :
#   Identify students where: Y_test != Y_pred
#    Display those rows
#    How many students were misclassified?
#    What common pattern do you observe?
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
#   Step 5 : Predict Results
#
#####################################################################################

Y_pred = model.predict(X_test)

#####################################################################################
#
#   Step 6 : Display Misclassified Students
#
#####################################################################################

print(border)
print("Misclassified Students")
print(border)

MisclassifiedCount = 0

for iCnt in range(len(Y_test)):

    if(Y_test.iloc[iCnt] != Y_pred[iCnt]):

        MisclassifiedCount = MisclassifiedCount + 1

        print(X_test.iloc[iCnt])

        print("Actual Value    :", Y_test.iloc[iCnt])
        print("Predicted Value :", Y_pred[iCnt])

        print(border)

print("Total Misclassified Students :", MisclassifiedCount)