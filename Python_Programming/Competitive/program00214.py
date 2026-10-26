"""
===============================================================================
Assignment 78 Q.4 : Student Result Calculator
                    Develop a Streamlit application that accepts a student's 
                    name and marks in three subjects. Calculate total marks, 
                    percentage and display whether the student has passed or failed
                    Consider 40 marks out of 100 as the minimum passing marks 
                    in each subject
Date              : 21/10/2026
Author            : Snehal Gholap
===============================================================================
"""

import streamlit as st

class StudentEvaluator:
    """Class for handling student performance evaluations"""
    PASS_MARK = 40.0

    @classmethod
    def evaluate(cls, m1: float, m2: float, m3: float):
        """Calculates total, percentage, and pass/fail status"""
        total = m1 + m2 + m3
        percentage = (total / 300.0) * 100.0
        
        # Student passes only if all subjects >= PASS_MARK
        has_passed = (m1 >= cls.PASS_MARK) and (m2 >= cls.PASS_MARK) and (m3 >= cls.PASS_MARK)
        return total, percentage, has_passed

def main():
    st.title("Student Result Calculator")
    st.write("Enter student details and marks to generate the result summary")

    # Student Details
    student_name = st.text_input("Student Name:", value="Snehal Gholap")

    st.subheader("Subject Marks (Out of 100)")
    m1 = st.number_input("Subject 1 Marks:", min_value=0.0, max_value=100.0, value=50.0)
    m2 = st.number_input("Subject 2 Marks:", min_value=0.0, max_value=100.0, value=60.0)
    m3 = st.number_input("Subject 3 Marks:", min_value=0.0, max_value=100.0, value=70.0)

    if st.button("Calculate Result"):
        if not student_name.strip():
            st.warning("Please enter a valid student name")
        else:
            total, percentage, passed = StudentEvaluator.evaluate(m1, m2, m3)
            
            st.markdown("---")
            st.subheader(f"Result Summary for {student_name}")
            st.write(f"**Total Marks:** {total:.2f} / 300")
            st.write(f"**Percentage:** {percentage:.2f}%")
            
            if passed:
                st.success("Overall Result: **PASSED**")
            else:
                st.error("Overall Result: **FAILED** (Minimum 40 marks required in each subject)")

if __name__ == "__main__":
    main()