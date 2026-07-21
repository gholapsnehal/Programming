##################################################################################################
#
# Function Name : CompareFile
# Input         : String, String
# Output        : None
# Description   : Accept two file names from command line and compare their
#                 contents. Display success if both files contain the same
#                 data, otherwise display failure
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

import sys

def CompareFile(FileName1, FileName2):

    try:

        fobj1 = open(FileName1, "r")
        fobj2 = open(FileName2, "r")

        Data1 = fobj1.read()
        Data2 = fobj2.read()

        fobj1.close()
        fobj2.close()

        if(Data1 == Data2):
            print("Success")
        else:
            print("Failure")

    except FileNotFoundError:
        print("Not able to open file")
        return

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept two file names from command line and compare their
#                 contents
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    if len(sys.argv) != 3:
        print("Insufficient arguments")
        return

    CompareFile(sys.argv[1], sys.argv[2])

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()