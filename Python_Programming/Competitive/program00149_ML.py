#####################################################################################
#
#   Question 7 :
#   Predict result for a student
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
#   Step 4 : Create and Train model
#
#####################################################################################

print(border)
print("Create and Train model")
print(border)

model = DecisionTreeClassifier(max_depth= 5)

model.fit(X_train, Y_train)

print("Model trained successfully")

#####################################################################################
#
#   Step 5 : Predict Student Result
#
#####################################################################################

print(border)
print("Predict Student Result")
print(border)

Student = pd.DataFrame (
                           {
                               "StudyHours" : [6],
                               "Attendance" : [85],
                               "PreviousScore" : [66],
                               "AssignmentsCompleted" : [7],
                               "SleepHours" : [7]
                           }    
                        )

Result = model.predict(Student)

print("Predicted Result :",Result[0])

if(Result[0] == 1):
    print("Student will pass")
else:
    print("Student will fail")