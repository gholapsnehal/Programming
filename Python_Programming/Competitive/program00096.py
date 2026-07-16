############################################################################################################
#
# Class name:          Arithmetic
# Instance Variable:   Value1, Value2
# Methods:             __init__(), Accept(), Addition(), Substraction(), Multiplication(), Division()
# Description:         Performs arithmetic operations on two numbers
# Date:                16/07/2026
# Author:              Snehal Gholap
# 
############################################################################################################

class Arithmetic:

    def __init__(self):
        self.value1 = 0
        self.value2 = 0

    def Accept(self):
        self.value1 = int(input("Enter first number : "))
        self.value2 = int(input("Enter second number : "))

    def Addition(self):
        return self.value1 + self.value2
    
    def Substraction(self):
        return self.value1 - self.value2
    
    def Multiplication(self):
        return self.value1 * self.value2
    
    def Division(self):
        if self.value2 == 0:
            return "Division by zero is not possible"
        else:
            return self.value1 / self.value2
        

aobj1 = Arithmetic()
aobj1.Accept()

print("Addition : ", aobj1.Addition())
print("Substraction : ", aobj1.Substraction())
print("Multiplication : ", aobj1.Multiplication())
print("Division : ", aobj1.Division())

aobj2 = Arithmetic()
aobj2.Accept()

print("Addition : ", aobj2.Addition())
print("Substraction : ", aobj2.Substraction())
print("Multiplication : ", aobj2.Multiplication())
print("Division : ", aobj2.Division())


