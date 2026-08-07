#####################################################################################
#
#   Question 8 :
#   Case Study : Student Performance Prediction using Decision Tree Classifier
#   Owner      :  Snehal Gholap
#   Date       :  06/08/2026
#####################################################################################


import pandas as pd
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier

from sklearn.metrics import (
                                accuracy_score,
                                confusion_matrix,
                                classification_report
                            )

border = "-" * 80

#####################################################################################
#
#   Step 1 : Load the Dataset
#
#####################################################################################

print(border)
print("Step 1 : Load the Dataset")
print(border)

DataPath = "student_performance_ml.csv"

df = pd.read_csv(DataPath)

print("Dataset loaded successfully")

print(df.head())

#####################################################################################
#
#   Step 2 : Data Analysis
#
#####################################################################################

print(border)
print("Step 2 : Data Analysis")
print(border)

print("Shape of Dataset :", df.shape)

print("Column Names :")
print(list(df.columns))

print("Missing Values :")
print(df.isnull().sum())

print("Statistical Information :")
print(df.describe())

#####################################################################################
#
#   Step 3 : Visualization
#
#####################################################################################

print(border)
print("Step 3 : Visualization")
print(border)

plt.figure(figsize = (7,5))

plt.scatter(df["StudyHours"],
            df["PreviousScore"])

plt.title("StudyHours vs PreviousScore")

plt.xlabel("StudyHours")
plt.ylabel("PreviousScore")

plt.grid()

plt.show()

#####################################################################################
#
#   Step 4 : Select Features and Label
#
#####################################################################################

print(border)
print("Step 4 : Select Features and Label")
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
#   Step 5 : Train-Test Split
#
#####################################################################################

print(border)
print("Step 5 : Train-Test Split")
print(border)

X_train, X_test, Y_train, Y_test = train_test_split(
                                                        X,
                                                        Y,
                                                        test_size = 0.3,
                                                        random_state = 42
                                                     )

#####################################################################################
#
#   Step 6 : Model Training
#
#####################################################################################

print(border)
print("Step 6 : Model Training")
print(border)

model = DecisionTreeClassifier(max_depth = 5)

model.fit(X_train, Y_train)

print("Model trained successfully")

#####################################################################################
#
#   Step 7 : Prediction
#
#####################################################################################

print(border)
print("Step 7 : Prediction")
print(border)

Y_pred = model.predict(X_test)

print("Prediction completed successfully")

#####################################################################################
#
#   Step 8 : Accuracy Calculation
#
#####################################################################################

print(border)
print("Step 8 : Accuracy Calculation")
print(border)

Accuracy = accuracy_score(Y_test, Y_pred)

print("Accuracy :", Accuracy * 100)

#####################################################################################
#
#   Step 9 : Confusion Matrix Generation
#
#####################################################################################

print(border)
print("Step 9 : Confusion Matrix Generation")
print(border)

cm = confusion_matrix(Y_test, Y_pred)

print(cm)

#####################################################################################
#
#   Step 10 : Classification Report
#
#####################################################################################

print(border)
print("Step 10 : Classification Report")
print(border)

print(classification_report(Y_test, Y_pred))

#####################################################################################
#
#   Step 11 : Final Conclusion
#
#####################################################################################

print(border)
print("Step 11 : Final Conclusion")
print(border)

print("Decision Tree model was trained successfully")

print("Model Accuracy :", Accuracy * 100)

if Accuracy >= 0.80:
    print("Model performance is good")
else:
    print("Model performance needs improvement")