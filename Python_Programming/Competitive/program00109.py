##################################################################################################
#
# Function Name : Frequency
# Input         : String, String
# Output        : Integer
# Description   : Accept file name and a string from command line and return
#                 the frequency of the specified string from the file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

import sys

def Frequency(FileName, Str):

    try:

        fobj = open(FileName, "r")

        Data = fobj.read()

        fobj.close()

        iCount = Data.count(Str)

        return iCount

    except FileNotFoundError as obj:
        return -1

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept file name and string from command line and display
#                 its frequency from the file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    if len(sys.argv) != 3:
        print("Insufficient arguments")
        return

    Ret = Frequency(sys.argv[1], sys.argv[2])

    if Ret == -1:
        print("Unable to open file")

    else:
        print("Frequency is :", Ret)

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()