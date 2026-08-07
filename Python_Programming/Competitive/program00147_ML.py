#####################################################################################
#
#   Question 5 :
#   Calculate Training Accuracy and Testing Accuracy.
#   Compare the results and identify whether the model is
#   overfitting or underfitting
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

print(border)
print("Select Features and Label")
print(border)

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
#   Step 4 : Create and Train Model
#
#####################################################################################

print(border)
print("Create and train Model")
print(border)

model = DecisionTreeClassifier(max_depth = 5)

model.fit(X_train, Y_train)

print("Model created successfully")

#####################################################################################
#
#   Step 5 : Calculate Training Accuracy
#
#####################################################################################

print(border)
print("Training Accuracy")
print(border)

TrainPrediction = model.predict(X_train)

TrainingAccuracy = accuracy_score(Y_train, TrainPrediction)

print("Training Accuracy : ", TrainingAccuracy * 100)

#####################################################################################
#
#   Step 6 : Calculate Testing Accuracy
#
#####################################################################################

print(border)
print("Testing Accuracy")
print(border)

TestPrediction = model.predict(X_test)

TestingAccuracy = accuracy_score(Y_test, TestPrediction)

print("Testing Accuracy : ", TestingAccuracy * 100)

#####################################################################################
#
#   Step 7 : Model Analysis
#
#####################################################################################

print(border)
print("Model Analysis")
print(border)

if TrainingAccuracy > TestingAccuracy:
    print("Model may be Overfitting")
elif TrainingAccuracy < TestingAccuracy:
    print("Model may be Underfitting")
else:
    print("Model is Well Balanced")

