"""
===============================================================================
Assignment 78 Q.2 : Even or Odd Number
                    Develop a Streamlit application that accepts an integer
                    from the user. Provide a Check button to determine whether
                    the entered number is even or odd and display the result
Date              : 21/10/2026
Author            : Snehal Gholap
===============================================================================
"""

import streamlit as st

class ParityChecker:
    """Class containing logic to check number parity"""
    
    @staticmethod
    def is_even(number: int) -> bool:
        """Returns True if the number is even, False otherwise"""
        return number % 2 == 0

def main():
    st.title("Even or Odd Number")
    st.write("Enter an integer to check if it is Even or Odd")

    # Input field restricted to integers
    number = st.number_input("Enter an integer:", value=0, step=1)

    # Action button
    if st.button("Check"):
        if ParityChecker.is_even(int(number)):
            st.info(f"The number **{int(number)}** is **Even**")
        else:
            st.info(f"The number **{int(number)}** is **Odd**")

if __name__ == "__main__":
    main()