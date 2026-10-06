###################################################################################################
#
# Assignment 68 Q.2   : Demonstrate ReLU and Max Pooling
#                       Using NumPy
# Date               : 04/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#
#    1. Create a feature map with positive and negative values
#    2. Apply ReLU
#    3. Apply 2x2 max pooling
#    4. Display output after each step
#    5. Explain why pooling reduces size
###################################################################################################

import numpy as np

# Task 1: Create a feature map with positive and negative values

feature_map = np.array([[3, 3, 3], [0, 0, 0], [-3, -3, -3]])


# Task 2: Apply ReLU (Rectified Linear Unit) activation
# ReLU Rule: max(0, value) -> converts negative values to 0

def apply_relu(matrix):
    return np.maximum(0, matrix)


relu_output = apply_relu(feature_map)


# Task 3: Apply 2x2 Max Pooling (Stride = 1 for 3x3 input matrix)

def apply_max_pooling_2x2(matrix, stride=1):
    h, w = matrix.shape
    pool_h, pool_w = 2, 2

    out_h = (h - pool_h) // stride + 1
    out_w = (w - pool_w) // stride + 1

    pooled_matrix = np.zeros((out_h, out_w), dtype=int)

    for i in range(out_h):
        for j in range(out_w):
            region = matrix[
                i * stride : i * stride + pool_h,
                j * stride : j * stride + pool_w,
            ]
            pooled_matrix[i, j] = np.max(region)

    return pooled_matrix


pooled_output = apply_max_pooling_2x2(relu_output, stride=1)

# Task 4: Display output after each step

print("=" * 65)
print("                   STEP-BY-STEP OUTPUTS                          ")
print("=" * 65)

print("\n1. Input Feature Map:")
print(feature_map)

print("\n2. Output after ReLU Activation (relu_output):")
print(relu_output)

print("\n3. Output after 2x2 Max Pooling (pooled_output):")
print(pooled_output)

# Task 5: Explanation of why pooling reduces size

print("\n" + "=" * 65)
print("             EXPLANATION: WHY POOLING REDUCES SIZE                ")
print("=" * 65)
print("1. Mechanism:")
print(
    "   - Max Pooling divides the feature map into smaller regions (e.g., 2x2 blocks)"
)
print(
    "     and extracts only the maximum value from each region, summarizing"
)
print("     multiple pixels into a single dominant feature point.\n")

print("2. Mathematical Size Reduction:")
print("   - Using a stride > 1 or non-overlapping windows directly compresses spatial")
print(
    "     dimensions according to the formula: Output_Size = (N - Pool_Size)/Stride + 1.\n"
)

print("3. Computational Efficiency & Overfitting Control:")
print(
    "   - By reducing width and height, pooling cuts down the overall parameter count,"
)
print(
    "     lowers memory consumption, accelerates training, and grants translation invariance."
)
print("=" * 65)

###################################################################################################
