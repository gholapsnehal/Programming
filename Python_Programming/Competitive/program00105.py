##################################################################################################
#
# Function Name : CheckFile
# Input         : String
# Output        : Boolean
# Description   : Accept file name from user and check whether the file exists
#                 or not
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

import os

def CheckFile(FileName):

    Ans = os.path.exists(FileName)

    if Ans == True:
        return True
    else:
        return False

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept file name from user and display whether the file
#                 exists or not
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    FileName = input("Enter file name : ")

    Ret = CheckFile(FileName)

    if Ret == True:
        print("File exists")
    else:
        print("File does not exist")

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()