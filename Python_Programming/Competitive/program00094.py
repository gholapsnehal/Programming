############################################################################################################
#
# Class name:      Demo
# Input:           None
# Output:          None
# Description:     Demonstrates instance variables, class variables and constructor, instance methods
# Date:            16/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

class Demo:

    # class variable
    Value = 100

    def __init__(self, no1, no2):
        #Instance variable
        self.no1 = no1
        self.no2 = no2

    # Instance method
    def fun(self):
        print("Value of no1 is : ",self.no1)
        print("Value of no2 is : ",self.no2)

    # Instance method
    def gun(self):
        print("Value of no1 is : ",self.no1)
        print("Value of no2 is : ",self.no2)

obj1 = Demo(11,21)
obj2 = Demo(51,101)

obj1.fun()
obj2.fun()
obj1.gun()
obj2.gun()
        