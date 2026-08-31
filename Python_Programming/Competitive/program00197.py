###################################################################################################
#
# Assignment 51 Q.4  : Using population statistics (pvariance/pstdev) matching the steps as 
#                        written in pdf 
#                      
# Date               : 29/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

import statistics

data2 = [4, 6, 8, 10, 12]
data4 = [5, 7, 9, 11, 13]

# Using population statistics (pvariance/pstdev) matching the steps above
print("Dataset 2 Mean:", statistics.mean(data2))
print("Dataset 2 Variance:", statistics.pvariance(data2))

print("Dataset 4 Mean:", statistics.mean(data4))
print("Dataset 4 Variance:", statistics.pvariance(data4))
print("Dataset 4 Standard Deviation:", statistics.pstdev(data4))