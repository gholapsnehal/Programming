#####################################################################################
#
#   Question 3 :
#   Calculate the accuracy of the model using accuracy_score().
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
#   Step 5 : Predict results
#
#####################################################################################

print(border)
print("Predict results")
print(border)

Y_pred = model.predict(X_test)

print("Prediction completed successfully")

#####################################################################################
#
#   Step 6 : Calculate Accuracy
#
#####################################################################################

print(border)
print("Calculate Accuracy")
print(border)

Accuracy = accuracy_score(Y_test, Y_pred)

print("Accuracy : ", Accuracy * 100)