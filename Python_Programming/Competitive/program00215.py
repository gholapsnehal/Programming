"""
===============================================================================
Assignment 78 Q.5 : Celsius to Fahrenheit Converter
                    Develop a Streamlit application that accepts temperature 
                    in Celsius. Provide a Convert button to convert the 
                    entered temperature into Fahrenheit and display the result
Date              : 21/10/2026
Author            : Snehal Gholap
===============================================================================
"""

import streamlit as st

class TemperatureConverter:
    """Class containing conversion logic for temperature scales"""
    
    @staticmethod
    def celsius_to_fahrenheit(celsius: float) -> float:
        """Converts Celsius to Fahrenheit: (C * 9/5) + 32"""
        return (celsius * 9.0 / 5.0) + 32.0

def main():
    st.title("Celsius to Fahrenheit Converter")
    st.write("Enter temperature in Celsius to convert it into Fahrenheit")

    # Input field
    celsius = st.number_input("Temperature in Celsius (°C):", value=0.0, step=0.5)

    # Action button
    if st.button("Convert"):
        fahrenheit = TemperatureConverter.celsius_to_fahrenheit(celsius)
        st.success(f"{celsius}°C is equal to **{fahrenheit:.2f}°F**")

if __name__ == "__main__":
    main()