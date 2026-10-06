###################################################################################################
#
# Assignment 66 Q.1   : Simulate a Single Artificial Neuron
#                       Using Python (math module)
# Date               : 02/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Calculate weighted sum
#    2. Apply sigmoid activation function
#    3. Display final output
#    4. Explain whether output is close to 0 or 1
###################################################################################################

import math

# Store inputs and weights
x1 = 2
x2 = 3
w1 = 0.4
w2 = 0.6
bias = 0.5

# Task 1: Calculate weighted sum
weighted_sum = (x1 * w1) + (x2 * w2) + bias


# Task 2: Apply sigmoid activation function
def sigmoid(z):
    return 1 / (1 + math.exp(-z))


output = sigmoid(weighted_sum)

# Task 3: Display final output
print("Weighted Sum:", weighted_sum)
print("Neuron Output (Sigmoid):", round(output, 4))

# Task 4: Explain whether output is close to 0 or 1
print("\nExplanation:")
if output > 0.5:
    print(
        f"The final output ({round(output, 4)}) is close to 1 because the weighted sum ({weighted_sum}) is positive."
    )
else:
    print(
        f"The final output ({round(output, 4)}) is close to 0 because the weighted sum ({weighted_sum}) is negative."
    )