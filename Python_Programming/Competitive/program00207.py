###################################################################################################
#
# Assignment 67 Q.2   : Create Neural Network Model to Predict Loan Approval
#                       Using Feedforward Neural Network (FNN)
# Date               : 04/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#
#    1. Preprocess categorical values
#    2. Apply scaling
#    3. Train FNN model
#    4. Evaluate model
#    5. Predict approval for new applicant: new_applicant = [[55000, 720, 400000, 10000, 1]]
###################################################################################################

import numpy as np
import pandas as pd
from sklearn.metrics import accuracy_score
from sklearn.neural_network import MLPClassifier
from sklearn.preprocessing import StandardScaler

# Features: [Applicant income, Credit score, Loan amount, Existing EMI, Employment status]

features = [
    "Applicant Income",
    "Credit Score",
    "Loan Amount",
    "Existing EMI",
    "Employment Status",
]

# Task 1: Dataset & Preprocessing Categorical Values
# Note: Employment Status is already encoded (0 = Not Stable, 1 = Stable)

X = np.array(
    [
        [25000, 600, 200000, 10000, 0],
        [40000, 700, 300000, 8000, 1],
        [60000, 750, 500000, 12000, 1],
        [20000, 550, 150000, 15000, 0],
        [80000, 800, 700000, 10000, 1],
        [35000, 650, 250000, 9000, 1],
        [18000, 500, 100000, 12000, 0],
        [90000, 850, 800000, 15000, 1],
        [30000, 580, 200000, 14000, 0],
        [70000, 780, 600000, 10000, 1],
    ]
)

y = np.array([0, 1, 1, 0, 1, 1, 0, 1, 0, 1])

df = pd.DataFrame(X, columns=features)
df["Loan Status"] = y

# Drop duplicate rows and missing values if present

df.drop_duplicates(inplace=True)
df.dropna(inplace=True)

X_clean = df[features].values
y_clean = df["Loan Status"].values

# Task 2: Apply Scaling

scaler = StandardScaler()
X_scaled = scaler.fit_transform(X_clean)

# Task 3: Train FNN (Feedforward Neural Network) model

model = MLPClassifier(
    hidden_layer_sizes=(8, 4), activation="relu", max_iter=1000, random_state=42
)
model.fit(X_scaled, y_clean)

# Task 4: Evaluate model

y_pred = model.predict(X_scaled)
accuracy = accuracy_score(y_clean, y_pred)

print("=" * 65)
print("             LOAN APPROVAL PREDICTION USING FNN                   ")
print("=" * 65)
print(f"Model Training Accuracy : {accuracy * 100:.2f}%")
print("-" * 65)

# Task 5: Predict approval for new applicant

new_applicant = [[55000, 720, 400000, 10000, 1]]
new_applicant_scaled = scaler.transform(new_applicant)
prediction = model.predict(new_applicant_scaled)[0]

print("Test Input Features     :", new_applicant[0])
if prediction == 1:
    print("Prediction: Loan Approved")
else:
    print("Prediction: Loan Rejected")
print("=" * 65)

###################################################################################################
