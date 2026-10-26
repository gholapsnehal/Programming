"""
===============================================================================
Assignment : Deep Learning Assignment 79 - Question 3
             Develop a Tkinter application that accepts the radius of a circle 
             Provide a Calculate Area button to calculate and display the area 
             of the circle
Date       : 22/10/2026
Author     : Snehal Gholap
===============================================================================
"""

import tkinter as tk
import math

class CircleAreaApp:
    """Class to handle Tkinter GUI and circle area calculation logic"""
    
    def __init__(self, root):
        self.root = root
        self.root.title("Area of Circle")
        self.root.geometry("400x280")

        # Title Label
        tk.Label(root, text="Area of Circle Calculator", font=("Arial", 14, "bold")).pack(pady=10)

        # Radius Input
        tk.Label(root, text="Enter Radius of Circle:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_radius = tk.Entry(root, width=30)
        self.entry_radius.pack(pady=5)

        # Calculate Area Button
        self.btn_calc = tk.Button(root, text="Calculate Area", command=self.calculate_area, bg="#FF9800", fg="white", width=15)
        self.btn_calc.pack(pady=15)

        # Result Display Label
        self.label_result = tk.Label(root, text="Result: ", font=("Arial", 11, "bold"))
        self.label_result.pack(pady=10)

    def calculate_area(self):
        """Calculates the area of the circle using formula: Area = pi * r^2"""
        try:
            radius = float(self.entry_radius.get())
            if radius < 0:
                self.label_result.config(text="Error: Radius cannot be negative!", fg="red")
            else:
                area = math.pi * (radius ** 2)
                self.label_result.config(text=f"Area of Circle: {area:.2f}", fg="green")
        except ValueError:
            self.label_result.config(text="Error: Please enter a valid number!", fg="red")

def main():
    root = tk.Tk()
    app = CircleAreaApp(root)
    root.mainloop()

if __name__ == "__main__":
    main()