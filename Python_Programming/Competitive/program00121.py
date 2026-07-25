##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import os

##################################################################################################
#
# Function Name : CountFiles
# Input         : String
# Output        : None
# Description   : Count the number of files present in the specified directory
#                 and store the result in DirectoryCountLog.txt file
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CountFiles(DirectoryPath):

    Ret = False

    Ret = os.path.isdir(DirectoryPath)

    if(Ret == False):
        print("Invalid Directory :", DirectoryPath)
        return

    Ans = os.listdir(DirectoryPath)

    FileCount = 0

    for Name in Ans:

        FullPath = os.path.join(DirectoryPath, Name)

        FileCheck = False
        FileCheck = os.path.isfile(FullPath)

        if(FileCheck == True):
            FileCount = FileCount + 1

    LogFile = "DirectoryCountLog.txt"

    Border = "_" * 60

    fobj = open(LogFile, "a")

    fobj.write(Border + "\n")
    fobj.write(f"Directory Path : {DirectoryPath}\n")
    fobj.write(f"Number of Files : {FileCount}\n")
    fobj.write(f"Date and Time : {time.ctime()}\n")
    fobj.write(Border + "\n\n")

    fobj.close()

    print("Log entry added successfully")

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept directory name from user and schedule file counting
#                 operation after every 5 minutes
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    DirectoryName = input("Enter Directory Name : ")

    # Input Filter

    if(os.path.isdir(DirectoryName) == False):
        print("Invalid Directory")
        return

    schedule.every(5).minutes.do(CountFiles, DirectoryName)

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