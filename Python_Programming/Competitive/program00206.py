###################################################################################################
#
# Assignment 67 Q.1   : Create Neural Network Model to Predict Customer Leaving Service
#                       Using Feedforward Neural Network (FNN)
# Date               : 04/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#
#    1. Load or create dataset
#    2. Clean the dataset
#    3. Apply StandardScaler
#    4. Train FNN model
#    5. Evaluate accuracy
#    6. Predict output for test input: new_customer = [[46, 1450, 5, 6, 9]]
###################################################################################################

import numpy as np
import pandas as pd
from sklearn.metrics import accuracy_score
from sklearn.neural_network import MLPClassifier
from sklearn.preprocessing import StandardScaler

# Task 1: Load or create dataset

features = ["Age", "Monthly Charges", "Tenure", "Complaints", "Support Calls"]

X = np.array(
    [
        [25, 500, 12, 1, 2],
        [30, 700, 24, 0, 1],
        [45, 1200, 6, 5, 8],
        [50, 1500, 5, 6, 10],
        [28, 600, 18, 1, 1],
        [35, 800, 30, 0, 0],
        [48, 1400, 4, 7, 9],
        [52, 1600, 3, 8, 12],
        [27, 550, 20, 0, 1],
        [42, 1300, 8, 4, 7],
    ]
)

y = np.array([0, 0, 1, 1, 0, 0, 1, 1, 0, 1])

# Task 2: Clean the dataset

df = pd.DataFrame(X, columns=features)
df["Customer Status"] = y

# Drop duplicate rows and missing values if present

df.drop_duplicates(inplace=True)
df.dropna(inplace=True)

X_clean = df[features].values
y_clean = df["Customer Status"].values

# Task 3: Apply StandardScaler

scaler = StandardScaler()
X_scaled = scaler.fit_transform(X_clean)

# Task 4: Train FNN (Feedforward Neural Network) model

model = MLPClassifier(
    hidden_layer_sizes=(8, 4), activation="relu", max_iter=1000, random_state=42
)
model.fit(X_scaled, y_clean)

# Task 5: Evaluate accuracy

y_pred = model.predict(X_scaled)
accuracy = accuracy_score(y_clean, y_pred)

print("=" * 65)
print("     CUSTOMER SERVICE RETENTION PREDICTION USING FNN             ")
print("=" * 65)
print(f"Model Training Accuracy : {accuracy * 100:.2f}%")
print("-" * 65)

# Test Input Prediction

new_customer = [[46, 1450, 5, 6, 9]]
new_customer_scaled = scaler.transform(new_customer)
prediction = model.predict(new_customer_scaled)[0]

print("Test Input Features     :", new_customer[0])
if prediction == 1:
    print("Prediction: Customer may leave")
else:
    print("Prediction: Customer will stay")
print("=" * 65)

###################################################################################################