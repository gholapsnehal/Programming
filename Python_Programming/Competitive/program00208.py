###################################################################################################
#
# Assignment 68 Q.1   : Write a Python program to manually perform convolution
#                       Using NumPy
# Date               : 04/10/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#
#    1. Move kernel over image.
#    2. Perform multiplication and addition.
#    3. Generate feature map.
#    4. Print each region calculation.
###################################################################################################

import numpy as np

# Input 5x5 matrix representing grayscale image

image = np.array(
    [
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0],
        [1, 1, 1, 1, 1],
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0],
    ]
)

# Kernel 3x3 edge detection filter

kernel = np.array([[-1, -1, -1], [0, 0, 0], [1, 1, 1]])

# Get dimensions
image_h, image_w = image.shape
kernel_h, kernel_w = kernel.shape

# Calculate feature map dimensions (5 - 3 + 1 = 3x3)
output_h = image_h - kernel_h + 1
output_w = image_w - kernel_w + 1

# Initialize feature map list

feature_map = []

print("=" * 65)
print("              MANUAL CONVOLUTION CALCULATION                     ")
print("=" * 65)

# Task 1 & 2: Move kernel over image, calculate and print step by step

step = 1
for i in range(output_h):
    row_result = []
    for j in range(output_w):
        # Extract 3x3 region

        region = image[i : i + kernel_h, j : j + kernel_w]

        # Calculate element-wise multiplication and sum

        calc_val = int(np.sum(region * kernel))
        row_result.append(calc_val)

        # Task 4: Print region calculation steps

        print(f"\nRegion Calculation {step}:")
        print("Region:\n", region)
        print("Kernel:\n", kernel)

        # Build detailed calculation string

        terms = [
            f"{region[r, c]}*{kernel[r, c]}"
            for r in range(kernel_h)
            for c in range(kernel_w)
        ]
        calc_str = " + ".join(terms)

        print(f"Calculation: {calc_str}")
        print(f"Output = {calc_val}")

        step += 1

    feature_map.append(row_result)

# Task 3: Display exact expected feature map format

print("\n" + "=" * 65)
print("Expected Feature Map")
print("=" * 65)
print("feature_map = [")
for r_idx, row in enumerate(feature_map):
    comma = "," if r_idx < len(feature_map) - 1 else ""
    print(f"    {row}{comma}")
print("]")
print("=" * 65)

###################################################################################################
