"""
===============================================================================
Assignment : Deep Learning Assignment 79 - Question 5
             Develop a Tkinter application that accepts a username and password 
             using Entry widgets. Provide a Login button to validate the entered 
             credentials against predefined values and display an appropriate 
             success or failure message
Date       : 22/10/2026
Author     : Snehal Gholap
===============================================================================
"""

import tkinter as tk

class LoginFormApp:
    """Class to handle Tkinter GUI and authentication logic"""
    
    # Predefined credentials for validation
    CORRECT_USER = "admin"
    CORRECT_PASS = "password123"

    def __init__(self, root):
        self.root = root
        self.root.title("Basic Login Form")
        self.root.geometry("400x320")

        # Title Label
        tk.Label(root, text="Basic Login Form", font=("Arial", 14, "bold")).pack(pady=10)

        # Username Input
        tk.Label(root, text="Username:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_user = tk.Entry(root, width=30)
        self.entry_user.pack(pady=5)

        # Password Input (masked with asterisks)
        tk.Label(root, text="Password:", font=("Arial", 10)).pack(anchor="w", padx=30)
        self.entry_pass = tk.Entry(root, width=30, show="*")
        self.entry_pass.pack(pady=5)

        # Login Button
        self.btn_login = tk.Button(root, text="Login", command=self.validate_login, bg="#4CAF50", fg="white", width=15)
        self.btn_login.pack(pady=15)

        # Result Display Label
        self.label_result = tk.Label(root, text="", font=("Arial", 11, "bold"))
        self.label_result.pack(pady=10)

    def validate_login(self):
        """Validates entered credentials against predefined values"""
        username = self.entry_user.get().strip()
        password = self.entry_pass.get().strip()

        if not username or not password:
            self.label_result.config(text="Error: All fields are required!", fg="red")
        elif username == self.CORRECT_USER and password == self.CORRECT_PASS:
            self.label_result.config(text="Login Successful! Welcome, Admin.", fg="green")
        else:
            self.label_result.config(text="Login Failed! Invalid Username or Password.", fg="red")

def main():
    root = tk.Tk()
    app = LoginFormApp(root)
    root.mainloop()

if __name__ == "__main__":
    main()