"""
===============================================================================
Assignment : Deep Learning Assignment 79 - Question 4
             Develop a Tkinter application that accepts a person's name and age 
             Provide a Check Eligibility button to determine whether the person 
             is eligible to vote based on the minimum age of 18 years
Date       : 22/10/2026
Author     : Snehal Gholap
===============================================================================
"""

import tkinter as tk

class VotingEligibilityApp:
    """Class to handle Tkinter GUI and voting eligibility check logic"""
    
    def __init__(self, root):
        self.root = root
        self.root.title("Voting Eligibility Checker")
        self.root.geometry("400x320")

        # Title Label
        tk.Label(root, text="Voting Eligibility Checker", font=("Arial", 14, "bold")).pack(pady=10)

        # Name Input
        tk.Label(root, text="Enter Person's Name:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_name = tk.Entry(root, width=30)
        self.entry_name.pack(pady=5)

        # Age Input
        tk.Label(root, text="Enter Person's Age:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_age = tk.Entry(root, width=30)
        self.entry_age.pack(pady=5)

        # Check Eligibility Button
        self.btn_check = tk.Button(root, text="Check Eligibility", command=self.check_eligibility, bg="#9C27B0", fg="white", width=15)
        self.btn_check.pack(pady=15)

        # Result Display Label
        self.label_result = tk.Label(root, text="Result: ", font=("Arial", 11, "bold"))
        self.label_result.pack(pady=10)

    def check_eligibility(self):
        """Determines if the person is eligible to vote (min age 18)"""
        name = self.entry_name.get().strip()
        if not name:
            self.label_result.config(text="Error: Please enter a valid name!", fg="red")
            return

        try:
            age = int(self.entry_age.get())
            if age < 0:
                self.label_result.config(text="Error: Age cannot be negative!", fg="red")
            elif age >= 18:
                self.label_result.config(text=f"{name} is Eligible to Vote!", fg="green")
            else:
                self.label_result.config(text=f"{name} is NOT Eligible to Vote.", fg="orange")
        except ValueError:
            self.label_result.config(text="Error: Please enter a valid integer for age!", fg="red")

def main():
    root = tk.Tk()
    app = VotingEligibilityApp(root)
    root.mainloop()

if __name__ == "__main__":
    main()