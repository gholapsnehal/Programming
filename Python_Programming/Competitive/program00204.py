###################################################################################################
#
# Assignment 66 Q.3   : Calculate Loss Manually (MSE and BCE)
#                       Using Python (math module)
# Date               : 03/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Implement Mean Squared Error (MSE)
#    2. Implement Binary Cross Entropy (BCE)
#    3. Take actual and predicted values
#    4. Display the calculated loss
#    5. Explain which loss function is used for regression and classification
###################################################################################################

import math


# Task 1: Mean Squared Error Function
def mean_squared_error(actual, predicted):
    n = len(actual)
    mse = sum((y - y_hat) ** 2 for y, y_hat in zip(actual, predicted)) / n
    return mse


# Task 2: Binary Cross Entropy Function
def binary_cross_entropy(actual, predicted):
    n = len(actual)
    # Epsilon is used to avoid log(0) undefined errors
    epsilon = 1e-15
    bce = 0
    for y, y_hat in zip(actual, predicted):
        # Clip predicted probability to avoid math domain error
        y_hat = max(epsilon, min(1 - epsilon, y_hat))
        bce += -(y * math.log(y_hat) + (1 - y) * math.log(1 - y_hat))
    return bce / n


# Task 3: Take actual and predicted values
# Regression sample data for MSE
y_actual_reg = [2.5, 0.0, 2.1, 7.8]
y_pred_reg = [3.0, -0.5, 2.0, 7.5]

# Classification sample data (probabilities) for BCE
y_actual_cls = [1, 0, 1, 0]
y_pred_cls = [0.9, 0.1, 0.8, 0.2]

# Task 4: Display the calculated loss
mse_loss = mean_squared_error(y_actual_reg, y_pred_reg)
bce_loss = binary_cross_entropy(y_actual_cls, y_pred_cls)

print("=" * 60)
print("                    CALCULATED LOSS VALUES                  ")
print("=" * 60)
print(f"Mean Squared Error (MSE) Loss       : {mse_loss:.4f}")
print(f"Binary Cross Entropy (BCE) Loss    : {bce_loss:.4f}")

# Task 5: Explanation
print("\n" + "=" * 60)
print("             EXPLANATION OF LOSS FUNCTIONS                  ")
print("=" * 60)
print("1. Mean Squared Error (MSE):")
print("   - Type: Used for REGRESSION tasks.")
print(
    "   - Purpose: Measures the average squared difference between actual values"
)
print("              and predicted continuous targets.")
print(
    "   - Example Applications: Predicting house prices, stock values, or age.\n"
)

print("2. Binary Cross Entropy (BCE):")
print("   - Type: Used for CLASSIFICATION tasks (specifically Binary Classification).")
print(
    "   - Purpose: Quantifies the difference between target binary labels (0 or 1)"
)
print("              and predicted output probabilities.")
print(
    "   - Example Applications: Spam detection, disease diagnosis (Yes/No)."
)
print("=" * 60)

###################################################################################################