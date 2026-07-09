############################################################################################################
#
# Function name:   Display
# Input:           string
# Output:          int
# Description:     Accept a name from the user and return the length of the name
# Date :           08/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def Display(Name):

    Result = len(Name)

    return Result


def main():
    
    Value = (input("Enter your name : "))
    
    Answer = Display(Value)

    print("Lenght of name is : ",Answer)


  
if __name__ == "__main__":
    main()