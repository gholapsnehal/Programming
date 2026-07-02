############################################################################################################
#
# Function name:   CheckVowel
# Input:           char
# Output:          bool
# Description:     write a program which accepts one character and checks whether it is a vowel or consonant
# Date :           02/07/2026
# Author:          Snehal Gholap
# 
############################################################################################################

def CheckVowel(ch):

    if((ch == 'a') or (ch == 'e') or (ch == 'i') or (ch == 'o') or (ch == 'u') or 
       (ch == 'A') or (ch == 'E') or (ch == 'I') or (ch == 'O') or (ch == 'U')):
        
        return True
    else:
        return False


def main():

    Value = input("Enter a character : ")
    
    Result = CheckVowel(Value)

    if(Result):
        print("Vowel")
    else:
        print("Consonant")


if __name__ == "__main__":
    main()