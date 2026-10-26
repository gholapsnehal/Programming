"""
===============================================================================
Assignment : Deep Learning Assignment 79 - Question 1
             Develop a Tkinter application that accepts two numbers using Entry 
             widgets. Provide an Add button to calculate and display their 
             addition using a Label widget
Date       : 22/10/2026
Author     : Snehal Gholap
===============================================================================
"""

import tkinter as tk

class AdditionApp:
    """Class to handle Tkinter GUI and addition logic"""
    
    def __init__(self, root):
        self.root = root
        self.root.title("Addition of Two Numbers")
        self.root.geometry("400x300")

        # Title Label
        tk.Label(root, text="Addition of Two Numbers", font=("Arial", 14, "bold")).pack(pady=10)

        # First Number
        tk.Label(root, text="Enter First Number:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_num1 = tk.Entry(root, width=30)
        self.entry_num1.pack(pady=5)

        # Second Number
        tk.Label(root, text="Enter Second Number:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_num2 = tk.Entry(root, width=30)
        self.entry_num2.pack(pady=5)

        # Add Button
        self.btn_add = tk.Button(root, text="Add", command=self.calculate_addition, bg="#4CAF50", fg="white", width=15)
        self.btn_add.pack(pady=15)

        # Result Display Label
        self.label_result = tk.Label(root, text="Result: ", font=("Arial", 11, "bold"))
        self.label_result.pack(pady=10)

    def calculate_addition(self):
        """Calculates the sum of two numbers and displays it via Label widget"""
        try:
            val1 = float(self.entry_num1.get())
            val2 = float(self.entry_num2.get())
            result = val1 + val2
            self.label_result.config(text=f"Result: {val1} + {val2} = {result}", fg="green")
        except ValueError:
            self.label_result.config(text="Error: Please enter valid numbers!", fg="red")

def main():
    root = tk.Tk()
    app = AdditionApp(root)
    root.mainloop()

if __name__ == "__main__":
    main()