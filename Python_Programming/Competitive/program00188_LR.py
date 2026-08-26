###################################################################################################
#
# Assignment 48 Q.2  : Model Performance
#
# Description        : Dataset :
#                      X = [1, 2, 3, 4, 5]
#                      Y = [3, 4, 2, 4, 5]
#
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Predict all Y values using regression equation
#    2. Calculate :
#       Mean Squared Error(MSE)
#       R2 Score
#
###################################################################################################


X = [1, 2, 3, 4, 5]
Y = [3, 4, 2, 4, 5]

# Regression equation from Question 1
m = 0.4
c = 2.4

# Predict Y values
predicted_y = []

for x in X:
    y_pred = m * x + c
    predicted_y.append(y_pred)

print("Predicted Y values:", predicted_y)

# Calculate squared errors
squared_errors = []

for i in range(len(Y)):
    error = Y[i] - predicted_y[i]
    squared_errors.append(error ** 2)

# Calculate MSE
mse = sum(squared_errors) / len(Y)

print("MSE =", mse)

# Calculate mean of actual Y
mean_y = sum(Y) / len(Y)

# Calculate total sum of squares
total = 0

for y in Y:
    total += (y - mean_y) ** 2

# Calculate R2 score
r2 = 1 - (sum(squared_errors) / total)

print("R² Score =", round(r2, 4))