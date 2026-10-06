###################################################################################################
#
# Assignment 66 Q.2   : Demonstrate Different Activation Functions
#                       Using NumPy and Matplotlib
# Date               : 02/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Accept input values from -10 to 10
#    2. Plot all activation functions using Matplotlib
#    3. Explain the use of each activation function
###################################################################################################

import matplotlib.pyplot as plt
import numpy as np


# Define Activation Functions
def sigmoid(x):
    return 1 / (1 + np.exp(-x))


def relu(x):
    return np.maximum(0, x)


def tanh(x):
    return np.tanh(x)


# Task 1: Accept input values from -10 to 10
x = np.linspace(-10, 10, 100)

# Calculate outputs
y_sigmoid = sigmoid(x)
y_relu = relu(x)
y_tanh = tanh(x)

# Task 2: Plot all activation functions using Matplotlib
plt.figure(figsize=(10, 6))

plt.plot(x, y_sigmoid, label="Sigmoid", color="blue", linewidth=2)
plt.plot(x, y_relu, label="ReLU", color="green", linewidth=2)
plt.plot(x, y_tanh, label="Tanh", color="red", linewidth=2)

plt.title("Activation Functions (Sigmoid, ReLU, Tanh)", fontsize=14)
plt.xlabel("Input Value (x)", fontsize=12)
plt.ylabel("Output Value", fontsize=12)
plt.axhline(0, color="black", linestyle="--", alpha=0.7)
plt.axvline(0, color="black", linestyle="--", alpha=0.7)
plt.grid(True, linestyle=":", alpha=0.6)
plt.legend(fontsize=11)

plt.show()

# Task 3: Explain the use of each activation function
print("==========================================================")
print("             EXPLANATION OF ACTIVATION FUNCTIONS          ")
print("==========================================================")
print("1. Sigmoid Function:")
print("   - Formula: 1 / (1 + e^-x)")
print("   - Output Range: (0, 1)")
print(
    "   - Use Case: Primarily used in binary classification problems and final layer predictions."
)
print(
    "   - Drawback: Prone to vanishing gradient problem for very high or low values.\n"
)

print("2. ReLU (Rectified Linear Unit):")
print("   - Formula: max(0, x)")
print("   - Output Range: [0, inf)")
print(
    "   - Use Case: Default choice for hidden layers in deep neural networks due to fast computation."
)
print("   - Drawback: Can cause 'Dying ReLU' problem when inputs are negative.\n")

print("3. Tanh (Hyperbolic Tangent):")
print("   - Formula: tanh(x) = (e^x - e^-x) / (e^x + e^-x)")
print("   - Output Range: (-1, 1)")
print(
    "   - Use Case: Commonly used in hidden layers when zero-centered output is preferred."
)
print(
    "   - Advantage: Zero-centered output makes optimization easier compared to Sigmoid."
)
print("==========================================================")