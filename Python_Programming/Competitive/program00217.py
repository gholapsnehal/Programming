"""
===============================================================================
Assignment : Deep Learning Assignment 79 - Question 2
             Develop a Tkinter application that accepts three numbers from the 
             user. Provide a Find Maximum button to determine and display the 
             largest number
Date       : 22/10/2026
Author     : Snehal Gholap
===============================================================================
"""

import tkinter as tk

class LargestNumberApp:
    """Class to handle Tkinter GUI and maximum finding logic"""
    
    def __init__(self, root):
        self.root = root
        self.root.title("Find the Largest Number")
        self.root.geometry("400x350")

        # Title Label
        tk.Label(root, text="Find the Largest Number", font=("Arial", 14, "bold")).pack(pady=10)

        # First Number
        tk.Label(root, text="Enter First Number:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_num1 = tk.Entry(root, width=30)
        self.entry_num1.pack(pady=5)

        # Second Number
        tk.Label(root, text="Enter Second Number:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_num2 = tk.Entry(root, width=30)
        self.entry_num2.pack(pady=5)

        # Third Number
        tk.Label(root, text="Enter Third Number:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_num3 = tk.Entry(root, width=30)
        self.entry_num3.pack(pady=5)

        # Find Maximum Button
        self.btn_max = tk.Button(root, text="Find Maximum", command=self.find_largest, bg="#2196F3", fg="white", width=15)
        self.btn_max.pack(pady=15)

        # Result Display Label
        self.label_result = tk.Label(root, text="Result: ", font=("Arial", 11, "bold"))
        self.label_result.pack(pady=10)

    def find_largest(self):
        """Determines the largest among three numbers and displays it"""
        try:
            val1 = float(self.entry_num1.get())
            val2 = float(self.entry_num2.get())
            val3 = float(self.entry_num3.get())
            
            largest = max(val1, val2, val3)
            self.label_result.config(text=f"The largest number is: {largest}", fg="green")
        except ValueError:
            self.label_result.config(text="Error: Please enter valid numbers!", fg="red")

def main():
    root = tk.Tk()
    app = LargestNumberApp(root)
    root.mainloop()

if __name__ == "__main__":
    main()