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
#   Question 10 :
#   Train model with max_depth = None
#   Calculate   : Training Accuracy , Testing Accuracy
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
#   Step 4 : Create Model
#
#####################################################################################

print(border)
print("Create Model")
print(border)

model = DecisionTreeClassifier(max_depth = None)

print("Model created successfully")

#####################################################################################
#
#   Step 5 : Train Model
#
#####################################################################################

print(border)
print("Train Model")
print(border)

model.fit(X_train, Y_train)

print("Model trained successfully")

#####################################################################################
#
#   Step 6 : Training Accuracy
#
#####################################################################################

print(border)
print("Training Accuracy")
print(border)

Y_train_pred = model.predict(X_train)

TrainingAccuracy = accuracy_score(Y_train, Y_train_pred)

print("Training Accuracy :", TrainingAccuracy * 100)

#####################################################################################
#
#   Step 7 : Testing Accuracy
#
#####################################################################################

print(border)
print("Testing Accuracy")
print(border)

Y_test_pred = model.predict(X_test)

TestingAccuracy = accuracy_score(Y_test, Y_test_pred)

print("Testing Accuracy :", TestingAccuracy * 100)

#####################################################################################
#
#   Step 8 : Model Analysis
#
#####################################################################################

print(border)
print("Model Analysis")
print(border)

if(TrainingAccuracy == 1.0 and TestingAccuracy < TrainingAccuracy):
    print("Model may be Overfitting")
else:
    print("Model performance is acceptable")