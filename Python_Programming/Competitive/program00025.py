############################################################################################################
#
# Function name:   DisplayGrade
# Input:           int
# Output:          str
# Description:     write a program which accepts marks and returns the grade
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def DisplayGrade(Marks):

    if(Marks >= 75):
        return "Distinction"
    
    elif(Marks >= 60):
        return "First Class"
    
    elif(Marks >= 50):
        return "Second Class"
    
    else:
        return "Fail"

 
def main():

    Value1 = int(input("Enter marks : "))
    
    Result = DisplayGrade(Value1)

    print("Grade : ",Result)
    
if __name__ == "__main__":
    main()