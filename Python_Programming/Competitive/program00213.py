"""
===============================================================================
Assignment 78 Q.3 : Simple Interest Calculator
                    Develop a Streamlit application that accepts Principal 
                    Amount, Rate of Interest and Time Period. Provide a 
                    Calculate button to calculate and display the Simple Interest
Date              : 21/10/2026
Author            : Snehal Gholap
===============================================================================
"""

import streamlit as st

class SimpleInterestCalculator:
    """Class to process Simple Interest computation."""
    
    @staticmethod
    def calculate_interest(principal: float, rate: float, time: float) -> float:
        """Computes Simple Interest using formula: (P * R * T) / 100"""
        return (principal * rate * time) / 100.0

def main():
    st.title("Simple Interest Calculator")
    st.write("Provide the financial parameters below to calculate Simple Interest")

    # Input fields
    principal = st.number_input("Principal Amount (P):", min_value=0.0, value=1000.0, step=100.0)
    rate = st.number_input("Rate of Interest per annum (%) (R):", min_value=0.0, value=5.0, step=0.5)
    time = st.number_input("Time Period in years (T):", min_value=0.0, value=1.0, step=0.5)

    # Action button
    if st.button("Calculate"):
        if principal < 0 or rate < 0 or time < 0:
            st.error("Inputs must be non-negative values.")
        else:
            interest = SimpleInterestCalculator.calculate_interest(principal, rate, time)
            total_amount = principal + interest
            
            st.success(f"Simple Interest: **Rs{interest:.2f}**")
            st.write(f"Total Maturity Amount: **Rs{total_amount:.2f}**")

if __name__ == "__main__":
    main()