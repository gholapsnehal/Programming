###################################################################################################
#
# Assignment 49 Q.1  : Calculate Mean of Dataset using NumPy
#                      Using NumPy for mean calculation
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Create the given dataset
#    2. Calculate the mean using NumPy
#    3. Display the result
###################################################################################################

import numpy as np

data = np.array([6, 7, 8, 9, 10, 11, 12])

mean_value = np.mean(data)

print("Mean =", mean_value)