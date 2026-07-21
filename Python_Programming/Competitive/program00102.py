##################################################################################################
#
# Function Name : DisplayFile
# Input         : String
# Output        : None
# Description   : Accept file name from user and display the contents of the
#                 file on the console
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def DisplayFile(FileName):

    try:
        fobj = open(FileName, "r")

        for Line in fobj:
            print(Line, end="")

        fobj.close()

    except FileNotFoundError:
        print("Unable to open file as file does not exist")
        return

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept file name from user and display the contents of the
#                 file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    FileName = input("Enter file name : ")

    DisplayFile(FileName)

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()