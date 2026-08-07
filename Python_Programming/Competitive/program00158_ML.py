
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
#   Question 8 :
#   Visualize the trained Decision Tree
#
#####################################################################################

import pandas as pd
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.tree import plot_tree

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
#   Step 5 : Visualize Decision Tree
#
#####################################################################################

print(border)
print("Decision Tree Visualization")
print(border)

plt.figure(figsize = (12,8))

plot_tree(
            model,
            feature_names = FeatureColumns,
            class_names = ["Fail", "Pass"],
            filled = True
         )

plt.show()