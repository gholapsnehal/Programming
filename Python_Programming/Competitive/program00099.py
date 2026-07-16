############################################################################################################
#
# Class name:          Numbers
# Instance Variable:   value
# Class Variable:      None
# Methods:             __init__(), chkPrime(), chkPerfect(), Factors(), SumFactors()
# Description:         Performs operations on a number suc as prime, perfect and factor operations
# Date:                16/07/2026
# Author:              Snehal Gholap
# 
############################################################################################################

class Numbers:

    def __init__(self, value):
        self.value = value

    def chkPrime(self):

        for i in range(2, self.value):
            if self.value % i == 0:
                return False
        
        return True
    
    def chkPerfect(self):

        sum = 0

        for i in range(1, self.value):
            if self.value % i == 0:
                sum = sum + i
        
        return sum == self.value
    
    def Factors(self):

        print("Factors are : ")

        for i in range(1, self.value + 1):
            if self.value % i == 0:
                print(i, end=" ")

        print()

    def SumFactors(self):

        sum = 0

        for i in range(1, self.value + 1):
            if self.value % i == 0:
                sum = sum + i

        return sum
    
nobj1 = Numbers(6)

print(f"Prime : {nobj1.chkPrime()}")
print(f"Perfect : {nobj1.chkPerfect()}")

nobj1.Factors()
print(f"Sum of factors : {nobj1.SumFactors()}")

nobj2 = Numbers(11)

print(f"Prime : {nobj2.chkPrime()}")
print(f"Perfect : {nobj2.chkPerfect()}")

nobj2.Factors()
print(f"Sum of factors : {nobj2.SumFactors()}")

