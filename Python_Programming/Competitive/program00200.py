###################################################################################################
#
# Assignment 63 Q.1 : Loan Default Prediction using Multi-Layer Perceptron (FNN)
#
# Description       : Build and evaluate a Deep Learning (FNN/MLP) system to predict whether a
#                     loan applicant has a high probability of defaulting on a loan, along with
#                     hyperparameter experiment comparisons
#
# Date              : 08/09/2026
# Author            : Snehal Gholap
#
###################################################################################################

#-----------------------------------------
# Deep Learning PipeLine : Loan Default Prediction
#-----------------------------------------
# 1.  Load and Understand Dataset
# 2.  Data Analysis (EDA)
# 3.  Check Missing Values
# 4.  Check Class Balance
# 5.  Encode Categorical Variables
# 6.  Separate X and Y
# 7.  Train Test Split & Stratification Explanation
# 8.  Feature Scaling
# 9.  FNN Model Training (MLPClassifier)
# 10. Model Evaluation
# 11. Plot Training Loss
# 12. Model Preserve & Loading
# 13. Test Unseen Data
# 14. Hyperparameter Experiments
#-----------------------------------------

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import joblib
import warnings

from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.neural_network import MLPClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report, precision_score, recall_score, f1_score

warnings.filterwarnings('ignore')

#-----------------------------------------
# 1. Load and Understand Dataset
#-----------------------------------------

print("#-----------------------------------------")
print("1. Load and Understand Dataset")
print("#-----------------------------------------")

data = pd.read_csv("Loan_Default.csv")

print("Complete Dataset Preview : ")
print(data.head())

print("\nDataset Info : ")
print(data.info())

#-----------------------------------------
# 2. Data Analysis (EDA)
#-----------------------------------------

print("\n#-----------------------------------------")
print("2. Data Analysis (EDA)")
print("#-----------------------------------------")

print("First 5 rows : ")
print(data.head())

print("\nColumn names : ")
print(data.columns.tolist())

print("\nShape of dataset : ")
print(data.shape)

print("\nStatistical Summary : ")
print(data.describe())

#-----------------------------------------
# 3. Find Missing Values
#-----------------------------------------

print("\n#-----------------------------------------")
print("3. Find Missing Values")
print("#-----------------------------------------")

missing_values = data.isnull().sum()
print("Missing values in each column : ")
print(missing_values)

#-----------------------------------------
# 4. Check Class Balance
#-----------------------------------------

print("\n#-----------------------------------------")
print("4. Check Class Balance")
print("#-----------------------------------------")

class_counts = data['Default'].value_counts()
class_percentages = data['Default'].value_counts(normalize=True) * 100

print("Target Class Counts : ")
print(class_counts)

print("\nTarget Class Distribution (%) : ")
print(class_percentages)

#-----------------------------------------
# 5. Encode Categorical Variables
#-----------------------------------------

print("\n#-----------------------------------------")
print("5. Encode Categorical Variables")
print("#-----------------------------------------")

data_encoded = pd.get_dummies(data, columns=['HomeOwnership'], drop_first=True)
data_encoded['PreviousDefault'] = data_encoded['PreviousDefault'].map({'Yes': 1, 'No': 0})

print("Encoded Data Sample : ")
print(data_encoded.head())

#-----------------------------------------
# 6. Separate X and Y
#-----------------------------------------

print("\n#-----------------------------------------")
print("6. Separate X and Y")
print("#-----------------------------------------")

X = data_encoded.drop(columns=['Default'])
Y = data_encoded['Default']

print("Input features (X) sample : ")
print(X.head())

print("\nTarget (Y) sample : ")
print(Y.head())

#-----------------------------------------
# 7. Split Dataset & Stratified Splitting Explanation
#-----------------------------------------

print("\n#-----------------------------------------")
print("7. Split Dataset into Training and Testing Data")
print("#-----------------------------------------")

# Stratified splitting is used because target class 'Default' is imbalanced (~73% vs ~27%).
# Stratification ensures both train and test sets keep the same class ratio.

X_train, X_test, Y_train, Y_test = train_test_split(
    X, Y, test_size=0.30, random_state=42, stratify=Y
)

print("Training Input Shape  : ", X_train.shape)
print("Testing Input Shape   : ", X_test.shape)
print("Training Output Shape : ", Y_train.shape)
print("Testing Output Shape  : ", Y_test.shape)

#-----------------------------------------
# 8. Feature Scaling
#-----------------------------------------

print("\n#-----------------------------------------")
print("8. Feature Scaling")
print("#-----------------------------------------")

scalar = StandardScaler()

X_train_scaled = scalar.fit_transform(X_train)
X_test_scaled = scalar.transform(X_test)

print("Scaled training data (First 5 rows) : ")
print(X_train_scaled[:5])

#-----------------------------------------
# 9. FNN Model Training
#-----------------------------------------

print("\n#-----------------------------------------")
print("9. FNN Model Training")
print("#-----------------------------------------")

model = MLPClassifier(
    hidden_layer_sizes=(32, 16),
    activation='relu',
    solver='adam',
    max_iter=1000,
    random_state=42
)

print("Model Configuration : ")
print(model)

print("\nTraining the model...")
model.fit(X_train_scaled, Y_train)
print("Model training completed successfully.")

#-----------------------------------------
# 10. Model Evaluation
#-----------------------------------------

print("\n#-----------------------------------------")
print("10. Model Evaluation")
print("#-----------------------------------------")

Y_pred = model.predict(X_test_scaled)

accuracy = accuracy_score(Y_test, Y_pred)
precision = precision_score(Y_test, Y_pred)
recall = recall_score(Y_test, Y_pred)
f1 = f1_score(Y_test, Y_pred)
cm = confusion_matrix(Y_test, Y_pred)

print(f"Accuracy Score  : {accuracy:.4f}")
print(f"Precision Score : {precision:.4f}")
print(f"Recall Score    : {recall:.4f}")
print(f"F1-Score        : {f1:.4f}")

print("\nConfusion Matrix : ")
print(cm)

print("\nClassification Report : ")
print(classification_report(Y_test, Y_pred))

print("Predicted Probabilities (First 5 test samples) : ")
Y_prob = model.predict_proba(X_test_scaled)
print(Y_prob[:5])

#-----------------------------------------
# 11. Graphical Representation (Plot Training Loss)
#-----------------------------------------

print("\n#-----------------------------------------")
print("11. Graphical Representation (Plot Training Loss)")
print("#-----------------------------------------")

plt.figure(figsize=(8, 5))
plt.plot(model.loss_curve_, color='blue', linewidth=2)
plt.title('MLP Training Loss Curve')
plt.xlabel('Iterations')
plt.ylabel('Loss')
plt.grid(True)
plt.show()

#-----------------------------------------
# 12. Model Preserve & Loading
#-----------------------------------------

print("\n#-----------------------------------------")
print("12. Model Preserve & Loading")
print("#-----------------------------------------")

joblib.dump(model, "loan_default_fnn_model.pkl")
joblib.dump(scalar, "loan_default_scalar.pkl")
print("Model and Scaler dumped successfully.")

loaded_model = joblib.load("loan_default_fnn_model.pkl")
loaded_scalar = joblib.load("loan_default_scalar.pkl")
print("Model and Scaler loaded successfully.")

#-----------------------------------------
# 13. Test Unseen Data
#-----------------------------------------

print("\n#-----------------------------------------")
print("13. Test Unseen Data")
print("#-----------------------------------------")

new_applicants = pd.DataFrame([
    {
        'Age': 35, 'Income': 650000, 'LoanAmount': 200000, 'CreditScore': 750,
        'EmploymentYears': 8, 'ExistingLoans': 1, 'MonthlyDebt': 15000, 
        'LoanTerm': 36, 'PreviousDefault': 0, 'HomeOwnership_Own': 1, 'HomeOwnership_Rent': 0
    },
    {
        'Age': 24, 'Income': 250000, 'LoanAmount': 800000, 'CreditScore': 520,
        'EmploymentYears': 1, 'ExistingLoans': 4, 'MonthlyDebt': 35000, 
        'LoanTerm': 60, 'PreviousDefault': 1, 'HomeOwnership_Own': 0, 'HomeOwnership_Rent': 1
    }
])

new_applicants = new_applicants[X.columns]

new_applicants_scaled = loaded_scalar.transform(new_applicants)
new_predictions = loaded_model.predict(new_applicants_scaled)
new_probabilities = loaded_model.predict_proba(new_applicants_scaled)

print("New Applicants Data : ")
print(new_applicants)

print("\nPrediction Results : ")
for idx, (pred, prob) in enumerate(zip(new_predictions, new_probabilities)):
    status = "1 -> High default risk" if pred == 1 else "0 -> Low default risk"
    print(f"Applicant {idx + 1}: Prediction: {status} | Default Probability: {prob[1]:.2%}")

#-----------------------------------------
# 14. Hyperparameter Experiments
#-----------------------------------------

print("\n#-----------------------------------------")
print("14. Hyperparameter Experiments")
print("#-----------------------------------------")

# Experiment 1: Activation Functions
print("--- Experiment 1: Activation Functions ---")
for act in ['identity', 'logistic', 'tanh', 'relu']:
    exp_model = MLPClassifier(hidden_layer_sizes=(32, 16), activation=act, solver='adam', max_iter=1000, random_state=42)
    exp_model.fit(X_train_scaled, Y_train)
    acc = exp_model.score(X_test_scaled, Y_test)
    print(f"Activation: {act:<10} | Accuracy: {acc:.4f}")

# Experiment 2: Hidden Layer Architectures
print("\n--- Experiment 2: Hidden Layer Architectures ---")
for layers in [(10,), (20, 10), (50, 25), (100, 50, 25)]:
    exp_model = MLPClassifier(hidden_layer_sizes=layers, activation='relu', solver='adam', max_iter=1000, random_state=42)
    exp_model.fit(X_train_scaled, Y_train)
    acc = exp_model.score(X_test_scaled, Y_test)
    print(f"Layers: {str(layers):<15} | Accuracy: {acc:.4f}")

# Experiment 3: Learning Rate Initialization
print("\n--- Experiment 3: Initial Learning Rate ---")
for lr in [0.0001, 0.001, 0.01, 0.1]:
    exp_model = MLPClassifier(hidden_layer_sizes=(32, 16), activation='relu', solver='adam', learning_rate_init=lr, max_iter=1000, random_state=42)
    exp_model.fit(X_train_scaled, Y_train)
    acc = exp_model.score(X_test_scaled, Y_test)
    print(f"Learning Rate: {lr:<8} | Accuracy: {acc:.4f}")