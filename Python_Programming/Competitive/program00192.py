###################################################################################################
#
# Assignment 49 Q.3  : Feature Scaling using StandardScaler
#                      Using StandardScaler for feature scaling
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Create the given dataset
#    2. Apply StandardScaler
#    3. Display the scaled dataset
###################################################################################################

import numpy as np
from sklearn.preprocessing import StandardScaler

data = np.array([
    [25, 20000],
    [30, 40000],
    [35, 80000]
])

scaler = StandardScaler()

scaled_data = scaler.fit_transform(data)

print("Scaled Dataset:")
print(scaled_data)