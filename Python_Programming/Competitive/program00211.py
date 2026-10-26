#######################################################################################
#===============================================================================
# Assignment 78 Q.1 : Addition of Two Numbers
#                     Develop a Streamlit application that accepts two numbers
#                     from the user using input fields. Provide an Add button to
#                     calculate and display the addition of the entered numbers
# Date              : 21/10/2026
# Author            : Snehal Gholap
#===============================================================================
#######################################################################################

import streamlit as st

class AdditionCalculator:
    """Class to handle the core addition logic"""
    
    @staticmethod
    def calculate_sum(num1: float, num2: float) -> float:
        """Calculates and returns the sum of two numbers"""
        return num1 + num2

def main():
    st.title("Addition of Two Numbers")
    st.write("Enter two numbers below and click 'Add' to calculate their sum")

    # Input fields
    num1 = st.number_input("Enter first number:", value=0.0, step=1.0)
    num2 = st.number_input("Enter second number:", value=0.0, step=1.0)

    # Action button
    if st.button("Add"):
        result = AdditionCalculator.calculate_sum(num1, num2)
        st.success(f"Result: {num1} + {num2} = **{result}**")

if __name__ == "__main__":
    main()

#############################################################################################
#
#  Install streamlit over venv : python -m pip install streamlit 
#  To run this code : Below command can be used 
#  python -m streamlit run addition_app.py 
#  
#############################################################################################