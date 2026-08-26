###################################################################################################
#
# Assignment 49 Q.2  : Calculate Variance and Standard Deviation using NumPy
#                      Using NumPy for statistical calculations
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Create the given dataset
#    2. Calculate variance
#    3. Calculate standard deviation
#    4. Display both results
###################################################################################################

import numpy as np

data = np.array([6, 7, 8, 9, 10, 11, 12])

variance = np.var(data)
standard_deviation = np.std(data)

print("Variance =", variance)
print("Standard Deviation =", standard_deviation)