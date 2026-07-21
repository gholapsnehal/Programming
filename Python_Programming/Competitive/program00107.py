##################################################################################################
#
# Function Name : CopyFile
# Input         : String
# Output        : None
# Description   : Accept source file name from command line and copy its
#                 contents into a file named test.txt
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

import sys

def CopyFile(FileName):

    try:

        fobj1 = open(FileName, "r")
        fobj2 = open("test2.txt", "w")

        Data = fobj1.read()

        fobj2.write(Data)

        fobj1.close()
        fobj2.close()

        print("Content copied successfully")

    except FileNotFoundError:
        print("Not able to open file")
        return

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept source file name from command line and copy its
#                 contents into a file named test.txt
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    if len(sys.argv) != 2:
        print("Insufficient arguments")
        return

    CopyFile(sys.argv[1])

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()