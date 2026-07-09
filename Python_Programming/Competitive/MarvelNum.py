############################################################################################################
#
# Function name:   ChkPrime
# Input:           int
# Output:          bool
# Description:     Check whether the given number is prime or not.
# Date:            09/07/2026
# Author:          Snehal Gholap
#
############################################################################################################

def ChkPrime(No):

    if(No <= 1):
        return False
    
    for i in range(2,No):

        if(No % i == 0):
            return False
    
    return True