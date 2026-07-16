############################################################################################################
#
# Class name:          BankAccount
# Instance Variable:   Name, Amount
# Class Variable:      ROI
# Methods:             __init__(), Dsiplay(), Deposit(), Withdraw(), CalculateInterest()
# Description:         Performs banking operations such as deposit
# Date:                16/07/2026
# Author:              Snehal Gholap
# 
############################################################################################################

class BankAccount:

    ROI = 10.5

    def __init__(self, Name, Amount):
        self.Name = Name
        self.Amount = Amount

    def Display(self):
        print(f"Account Holder: {self.Name}")
        print(f"Account Balance: {self.Amount}")

    def Deposit(self):
        value = float(input("Enter amount to deposit : "))
        self.Amount = self.Amount + value

    def Withdraw(self):
        value = float(input("Enter amount to withdraw :"))

        if value <= self.Amount:
            self.Amount = self.Amount - value
        else:
            print("Insufficient Balance")

    def CalculateInterest(self):
        Interest = ((self.Amount * BankAccount.ROI) / 100)

        return Interest
    

bobj1 = BankAccount("Snehal",10000)

bobj1.Display()
bobj1.Deposit()
bobj1.Withdraw()

print(f"Interest : {bobj1.CalculateInterest()}")

bobj1.Display()


bobj2 = BankAccount("Ankitha",20000)

bobj2.Display()
bobj2.Deposit()
bobj2.Withdraw()

print(f"Interest : {bobj2.CalculateInterest()}")

bobj2.Display()



        