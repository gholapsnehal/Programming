###################################################################################################
#
# Assignment 68 Q.3   : Write a Python program to show flattening
#                       Using Basic Python
# Date               : 05/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Take a 2D matrix
#    2. Convert it into a 1D vector
#    3. Pass it to a fully connected layer
#    4. Calculate final output manually
#    5. Explain the role of flatten layer in CNN
###################################################################################################

# Task 1: Take a 2D matrix

matrix = [[6, 4], [8, 6]]

# Task 2: Convert 2D matrix into a 1D vector (Flattening)

flatten_output = []
for row in matrix:
    for item in row:
        flatten_output.append(item)

print("=" * 60)
print("                   FLATTENING DEMONSTRATION                       ")
print("=" * 60)
print("Input 2D Matrix     :", matrix)
print("Expected Flatten Output:", flatten_output)
print("-" * 60)

# Task 3 & 4: Pass to Fully Connected Layer and calculate output manually
# simple weights for each input element and a bias

weights = [0.5, 0.2, 0.1, 0.4]
bias = 1.0

# Manual Calculation: Output = (x1*w1 + x2*w2 + x3*w3 + x4*w4) + bias
# = (6*0.5) + (4*0.2) + (8*0.1) + (6*0.4) + 1.0
# = 3.0 + 0.8 + 0.8 + 2.4 + 1.0 = 8.0

final_output = (
    sum(x * w for x, w in zip(flatten_output, weights)) + bias
)

print("Weights             :", weights)
print("Bias                :", bias)
print("Final Output Value  :", final_output)
print("=" * 60)

# Task 5: Simple explanation of flatten layer

print("\n" + "=" * 60)
print("             ROLE OF FLATTEN LAYER IN CNN                         ")
print("=" * 60)
print("1. Converts 2D/3D Data to 1D:")
print("   - Convolution and Pooling layers give outputs as 2D or 3D matrices.")
print("   - Flatten layer converts them into a simple single 1D array (list).\n")

print("2. Connects CNN to Neural Network:")
print("   - Fully Connected (Dense) layers only accept 1D array as input.")
print(
    "   - So, Flatten acts as a bridge between Convolution layers and Output layer."
)
print("=" * 60)

###################################################################################################
