#####################################################################################
#
#   Question 6 :
#   Train three Decision Tree models with different max_depth values.
#   Compare their accuracies and determine the best model
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
#   Step 4 : Train models with different depths
#
#####################################################################################

print(border)
print("Compare different depths")
print(border)

DepthList = [1, 3, None]

for Depth in DepthList:

    model = DecisionTreeClassifier(max_depth= Depth)

    model.fit(X_train, Y_train)

    Y_pred = model.predict(X_test)

    Accuracy = accuracy_score(Y_test, Y_pred)

    print("Max Depth :", Depth)
    print("Testing Accuracy :", Accuracy * 100)
    print(border)
