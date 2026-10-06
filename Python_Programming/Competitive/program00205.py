###################################################################################################
#
# Assignment 66 Q.4   : Show How Weights are Updated in ANN
#                       Using Gradient Descent
# Date               : 03/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#
#    1. Take input, weight, bias, target output, and learning rate
#    2. Calculate prediction
#    3. Calculate error
#    4. Update weight using gradient descent logic
#    5. Display old weight and updated weight
###################################################################################################

# Task 1: Take input, weight, bias, target output, and learning rate

x = 2.0  # Input
w_old = 0.8  # Initial weight
bias = 0.3  # Bias
target = 1.0  # Target output
learning_rate = 0.1  # Learning rate (alpha)

# Task 2: Calculate prediction (Linear Activation: y_pred = x * w + bias)

prediction = (x * w_old) + bias

# Task 3: Calculate error (Error = Prediction - Target)

error = prediction - target

# Task 4: Update weight using gradient descent logic
# Gradient of MSE Loss with respect to weight: dL/dw = error * x
# Weight Update Rule: w_new = w_old - (learning_rate * dL/dw)

gradient = error * x
w_new = w_old - (learning_rate * gradient)

# Task 5: Display old weight and updated weight

print("=" * 60)
print("             WEIGHT UPDATE IN ARTIFICIAL NEURAL NETWORK           ")
print("=" * 60)
print(f"Input (x)            : {x}")
print(f"Initial Weight (w)   : {w_old}")
print(f"Bias                 : {bias}")
print(f"Target Output        : {target}")
print(f"Learning Rate        : {learning_rate}")
print("-" * 60)
print(f"Calculated Prediction: {prediction:.4f}")
print(f"Calculated Error     : {error:.4f}")
print(f"Calculated Gradient  : {gradient:.4f}")
print("-" * 60)
print(f"Old Weight           : {w_old}")
print(f"Updated Weight       : {w_new:.4f}")
print("=" * 60)

###################################################################################################
