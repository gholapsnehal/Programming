###################################################################################################
#
# Assignment 48 Q.1  : Simple Linear Regression without using any ML library
#
# Description        : Dataset :
#                      X = [1, 2, 3, 4, 5]
#                      Y = [3, 4, 2, 4, 5]
#
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################


X = [1, 2, 3, 4, 5]
Y = [3, 4, 2, 4, 5]

# Find the average of X and Y
mean_x = sum(X) / len(X)
mean_y = sum(Y) / len(Y)

# Calculate slope
numerator = 0
denominator = 0

for i in range(len(X)):
    numerator += (X[i] - mean_x) * (Y[i] - mean_y)
    denominator += (X[i] - mean_x) ** 2

m = numerator / denominator

# Calculate intercept
c = mean_y - (m * mean_x)

print("Mean of X =", mean_x)
print("Mean of Y =", mean_y)
print("Slope (m) =", m)
print("Intercept (c) =", c)

# Regression equation
print("\nRegression Equation:")
print("Y =", round(m, 2), "X +", round(c, 2))

# Predict Y when X = 6
x_value = 6
predicted_y = m * x_value + c

print("\nPredicted Y for X =", x_value, ":", round(predicted_y, 2))