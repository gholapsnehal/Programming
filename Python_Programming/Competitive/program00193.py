###################################################################################################
#
# Assignment 49 Q.4  : Euclidean Distance Before and After Feature Scaling
#                      Using StandardScaler for feature scaling
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Calculate Euclidean distance before scaling
#    2. Apply feature scaling
#    3. Calculate Euclidean distance after scaling
#    4. Display and compare both results
###################################################################################################

import numpy as np
from sklearn.preprocessing import StandardScaler

point1 = np.array([25, 20000])
point2 = np.array([35, 80000])

# Distance before scaling
distance_before = np.sqrt(np.sum((point1 - point2) ** 2))

# Dataset for finding scaling values
data = np.array([
    [25, 20000],
    [30, 40000],
    [35, 80000]
])

scaler = StandardScaler()
scaled_data = scaler.fit_transform(data)

# Get the scaled versions of the two points
scaled_point1 = scaled_data[0]
scaled_point2 = scaled_data[2]

# Distance after scaling
distance_after = np.sqrt(
    np.sum((scaled_point1 - scaled_point2) ** 2)
)

print("Distance before scaling =", distance_before)
print("Distance after scaling =", distance_after)