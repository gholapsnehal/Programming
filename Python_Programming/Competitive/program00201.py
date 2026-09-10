###################################################################################################
#
# Assignment 62 Q.1 : Deep Learning-based Employee Attrition Prediction System
#
# Description       : Build an intelligent system using MLPClassifier to predict employee attrition
#                     (0 -> Likely to stay, 1 -> Likely to leave) based on historical HR data.
#
# Date              : 08/09/2026
# Author            : Snehal Gholap
#
###################################################################################################

#-----------------------------------------
# Deep Learning PipeLine : Employee Attrition Prediction
#-----------------------------------------
# 1.  Load Dataset
# 2.  Display Shape, Columns & First 5 Records
# 3.  Check Missing Values
# 4.  Identify Numerical & Categorical Features
# 5.  Convert Categorical Features (OverTime)
# 6.  Convert Target (Attrition)
# 7.  Separate X and Y
# 8.  Train Test Split
# 9.  Feature Scaling
# 10. Design MLP Architecture
# 11. Train Network
# 12. Display Training Iterations
# 13. Calculate Training Accuracy
# 14. Calculate Testing Accuracy
# 15. Generate Confusion Matrix
# 16. Plot Loss Curve
# 17. Define PredictAttrition() Function
# 18. Test System on 5 New Employee Records
# 19. Explain Overfitting / Underfitting Status
#-----------------------------------------

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import warnings

from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.neural_network import MLPClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report

warnings.filterwarnings('ignore')

#-----------------------------------------
# 1. Load Dataset
#-----------------------------------------

print("#-----------------------------------------")
print("1. Load Dataset")
print("#-----------------------------------------")

df = pd.read_csv("Employee_Attrition.csv")
print("Dataset loaded successfully.")

#-----------------------------------------
# 2. Display Shape, Columns & First 5 Records
#-----------------------------------------

print("\n#-----------------------------------------")
print("2. Display Shape, Columns & First 5 Records")
print("#-----------------------------------------")

print(f"Shape of Dataset : {df.shape}")
print(f"\nColumns : {df.columns.tolist()}")
print("\nFirst 5 Records : ")
print(df.head())

#-----------------------------------------
# 3. Check Missing Values
#-----------------------------------------

print("\n#-----------------------------------------")
print("3. Check Missing Values")
print("#-----------------------------------------")

missing_values = df.isnull().sum()
print("Missing values per column : ")
print(missing_values)

#-----------------------------------------
# 4. Identify Numerical & Categorical Features
#-----------------------------------------

print("\n#-----------------------------------------")
print("4. Identify Numerical & Categorical Features")
print("#-----------------------------------------")

numerical_features = df.select_dtypes(include=['int64', 'float64']).columns.tolist()
categorical_features = df.select_dtypes(include=['object']).columns.tolist()

print(f"Numerical Features ({len(numerical_features)})   : {numerical_features}")
print(f"Categorical Features ({len(categorical_features)}) : {categorical_features}")

#-----------------------------------------
# 5. Convert Categorical Features (OverTime)
#-----------------------------------------

print("\n#-----------------------------------------")
print("5. Convert Categorical Features into Numerical")
print("#-----------------------------------------")

df['OverTime'] = df['OverTime'].map({'Yes': 1, 'No': 0})
print("OverTime feature mapped : Yes -> 1, No -> 0")

#-----------------------------------------
# 6. Convert Target (Attrition) into 0 and 1
#-----------------------------------------

print("\n#-----------------------------------------")
print("6. Convert Target (Attrition) into 0 and 1")
print("#-----------------------------------------")

df['Attrition'] = df['Attrition'].map({'Yes': 1, 'No': 0})
print("Attrition target mapped : Yes -> 1 (Leave), No -> 0 (Stay)")

#-----------------------------------------
# 7. Separate Independent (X) and Dependent (Y) Variables
#-----------------------------------------

print("\n#-----------------------------------------")
print("7. Separate Independent and Dependent Variables")
print("#-----------------------------------------")

X = df.drop(columns=['Attrition'])
Y = df['Attrition']

print(f"Independent Features (X) Shape : {X.shape}")
print(f"Dependent Target (Y) Shape    : {Y.shape}")

#-----------------------------------------
# 8. Divide Dataset into Training and Testing Data
#-----------------------------------------

print("\n#-----------------------------------------")
print("8. Divide Dataset into Training and Testing Data")
print("#-----------------------------------------")

X_train, X_test, Y_train, Y_test = train_test_split(
    X, Y, test_size=0.20, random_state=42, stratify=Y
)

print(f"X_train Shape : {X_train.shape} | Y_train Shape : {Y_train.shape}")
print(f"X_test Shape  : {X_test.shape}  | Y_test Shape  : {Y_test.shape}")

#-----------------------------------------
# 9. Apply Feature Scaling
#-----------------------------------------

print("\n#-----------------------------------------")
print("9. Apply Feature Scaling")
print("#-----------------------------------------")

scaler = StandardScaler()
X_train_scaled = scaler.fit_transform(X_train)
X_test_scaled = scaler.transform(X_test)

print("StandardScaler applied to training and testing features.")

#-----------------------------------------
# 10. Design MLP Architecture & 11. Train Network
#-----------------------------------------

print("\n#-----------------------------------------")
print("10 & 11. Design & Train MLPClassifier")
print("#-----------------------------------------")

mlp = MLPClassifier(
    hidden_layer_sizes=(32, 16),
    activation='relu',
    solver='adam',
    max_iter=2000,
    random_state=42
)

print("MLP Architecture Designed : 2 Hidden Layers -> Layer 1 (32 neurons), Layer 2 (16 neurons)")
print("Training Network...")
mlp.fit(X_train_scaled, Y_train)
print("Network Training Completed.")

#-----------------------------------------
# 12. Display Iterations Required
#-----------------------------------------

print("\n#-----------------------------------------")
print("12. Display Training Iterations")
print("#-----------------------------------------")

print(f"Number of iterations required for convergence : {mlp.n_iter_}")

#-----------------------------------------
# 13. Calculate Training Accuracy
#-----------------------------------------

print("\n#-----------------------------------------")
print("13. Calculate Training Accuracy")
print("#-----------------------------------------")

Y_train_pred = mlp.predict(X_train_scaled)
train_accuracy = accuracy_score(Y_train, Y_train_pred)
print(f"Training Accuracy : {train_accuracy * 100:.2f}% ({train_accuracy:.4f})")

#-----------------------------------------
# 14. Calculate Testing Accuracy
#-----------------------------------------

print("\n#-----------------------------------------")
print("14. Calculate Testing Accuracy")
print("#-----------------------------------------")

Y_test_pred = mlp.predict(X_test_scaled)
test_accuracy = accuracy_score(Y_test, Y_test_pred)
print(f"Testing Accuracy  : {test_accuracy * 100:.2f}% ({test_accuracy:.4f})")

#-----------------------------------------
# 15. Generate Confusion Matrix
#-----------------------------------------

print("\n#-----------------------------------------")
print("15. Generate Confusion Matrix")
print("#-----------------------------------------")

cm = confusion_matrix(Y_test, Y_test_pred)
print("Confusion Matrix : ")
print(cm)

print("\nClassification Report : ")
print(classification_report(Y_test, Y_test_pred))

#-----------------------------------------
# 16. Plot Loss Curve
#-----------------------------------------

print("\n#-----------------------------------------")
print("16. Plot Loss Curve")
print("#-----------------------------------------")

plt.figure(figsize=(8, 5))
plt.plot(mlp.loss_curve_, color='red', linewidth=2)
plt.title('MLP Training Loss Curve (Employee Attrition)')
plt.xlabel('Iterations')
plt.ylabel('Loss Value')
plt.grid(True)
plt.show()

#-----------------------------------------
# 17. Create Function: PredictAttrition(employee_data)
#-----------------------------------------

print("\n#-----------------------------------------")
print("17. Create PredictAttrition Function")
print("#-----------------------------------------")

def PredictAttrition(employee_data):
    """
    Accepts employee data as DataFrame or Dict, converts categorical columns 
    to numeric, scales features, and returns predictions.
    """
    if isinstance(employee_data, dict):
        employee_df = pd.DataFrame([employee_data])
    else:
        employee_df = employee_data.copy()

    # Convert 'OverTime' string values ('Yes'/'No') to numeric (1/0)
    if 'OverTime' in employee_df.columns:
        if employee_df['OverTime'].dtype == object or isinstance(employee_df['OverTime'].iloc[0], str):
            employee_df['OverTime'] = employee_df['OverTime'].map({'Yes': 1, 'No': 0})

    # Ensure feature columns match training dataset exactly
    features_df = employee_df[X.columns]

    # Scale numeric features
    scaled_data = scaler.transform(features_df)
    
    # Predict status and probabilities
    predictions = mlp.predict(scaled_data)
    probabilities = mlp.predict_proba(scaled_data)
    
    results = []
    for pred, prob in zip(predictions, probabilities):
        label = "1 -> Employee is likely to leave" if pred == 1 else "0 -> Employee is likely to stay"
        results.append({
            'Prediction_Code': pred,
            'Status': label,
            'Leave_Probability': f"{prob[1]:.2%}"
        })
    return results

print("PredictAttrition() function created successfully.")

#-----------------------------------------
# 18. Test System Using 5 New Employee Records
#-----------------------------------------

print("\n#-----------------------------------------")
print("18. Test System Using 5 New Employee Records")
print("#-----------------------------------------")

new_employees = pd.DataFrame([
    {
        'Age': 25, 'MonthlyIncome': 32000, 'YearsAtCompany': 1, 'TotalWorkingYears': 2,
        'DistanceFromHome': 45, 'JobSatisfaction': 1, 'WorkLifeBalance': 1,
        'OverTime': 'Yes', 'NumCompaniesWorked': 4, 'TrainingTimesLastYear': 0
    },
    {
        'Age': 48, 'MonthlyIncome': 160000, 'YearsAtCompany': 12, 'TotalWorkingYears': 22,
        'DistanceFromHome': 5, 'JobSatisfaction': 4, 'WorkLifeBalance': 4,
        'OverTime': 'No', 'NumCompaniesWorked': 1, 'TrainingTimesLastYear': 3
    },
    {
        'Age': 29, 'MonthlyIncome': 48000, 'YearsAtCompany': 3, 'TotalWorkingYears': 5,
        'DistanceFromHome': 25, 'JobSatisfaction': 2, 'WorkLifeBalance': 2,
        'OverTime': 'Yes', 'NumCompaniesWorked': 3, 'TrainingTimesLastYear': 1
    },
    {
        'Age': 40, 'MonthlyIncome': 120000, 'YearsAtCompany': 8, 'TotalWorkingYears': 15,
        'DistanceFromHome': 8, 'JobSatisfaction': 3, 'WorkLifeBalance': 3,
        'OverTime': 'No', 'NumCompaniesWorked': 2, 'TrainingTimesLastYear': 2
    },
    {
        'Age': 22, 'MonthlyIncome': 28000, 'YearsAtCompany': 1, 'TotalWorkingYears': 1,
        'DistanceFromHome': 38, 'JobSatisfaction': 1, 'WorkLifeBalance': 1,
        'OverTime': 'Yes', 'NumCompaniesWorked': 1, 'TrainingTimesLastYear': 0
    }
])

results = PredictAttrition(new_employees)

print("Predictions for 5 New Employee Records:\n")
for idx, res in enumerate(results, 1):
    print(f"Employee {idx}: {res['Status']} | Leave Risk: {res['Leave_Probability']}")