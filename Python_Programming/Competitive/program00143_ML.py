#####################################################################################
#
#   Question 1 :
#   Import DecisionTreeClassifier from sklearn.
#   Create a model object and train it using fit().
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

print("X Shape :", X.shape)
print("Y Shape :", Y.shape)

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

print("Dataset splitting done")

print("X_train :", X_train.shape)
print("X_test  :", X_test.shape)

print("Y_train :", Y_train.shape)
print("Y_test  :", Y_test.shape)

#####################################################################################
#
#   Step 4 : Create Model
#
#####################################################################################

print(border)
print("Create Model")
print(border)

model = DecisionTreeClassifier(max_depth = 5)

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