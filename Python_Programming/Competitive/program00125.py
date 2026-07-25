##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import os
import sys

##################################################################################################
#
# Function Name : DisplayContents
# Input         : String
# Output        : None
# Description   : Read and display the contents of the specified file
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def DisplayContents(FileName):

    border = "_" * 50

    print(border)

    try:

        if(os.path.exists(FileName) == False):
            print("Error : File does not exist")
            return

        if(os.path.getsize(FileName) == 0):
            print("Error : File is empty")
            return

        fobj = open(FileName,"r")

        Data = fobj.read()

        print(Data)

        fobj.close()

    except PermissionError as obj:
        print("Error : Permission denied",obj)

    except OSError as eobj:
        print("Error : File cannot be opened",eobj)

    print(border)

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Read and display file contents after every one minute
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    border = "_" * 50

    if(len(sys.argv) != 2):
        print("Usage : python program.py FileName")
        return

    FileName = sys.argv[1]

    print(border)
    print("File Automation Started...")
    print(border)

    schedule.every(1).minutes.do(DisplayContents, FileName)

    # For Testing
    # schedule.every(10).seconds.do(DisplayContents, FileName)

    while True:

        schedule.run_pending()
        time.sleep(1)

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()