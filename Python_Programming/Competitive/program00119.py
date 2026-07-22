##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import os
import time

##################################################################################################
#
# Function Name : DirectoryScan
# Input         : String
# Output        : None
# Description   : Scan the specified directory and display the total number
#                 of files, total number of subdirectories and scan time
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def DirectoryScan(DirectoryPath):

    Ret = False

    Ret = os.path.isdir(DirectoryPath)

    if(Ret == False):
        print("Script error : Directory path is invalid", DirectoryPath)
        return

    Ans = os.listdir(DirectoryPath)

    FileCount = 0
    DirCount = 0

    for Name in Ans:

        FullPath = os.path.join(DirectoryPath, Name)

        FileCheck = False
        FileCheck = os.path.isfile(FullPath)

        DirCheck = False
        DirCheck = os.path.isdir(FullPath)

        if(FileCheck):
            FileCount = FileCount + 1

        if(DirCheck):
            DirCount = DirCount + 1

    print("Directory Scanned :", DirectoryPath)
    print("Total Files :", FileCount)
    print("Total Subdirectories :", DirCount)
    print("Scan Time :", time.ctime())

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept directory name from user and schedule directory
#                 scanning after every 1 minute
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    DirectoryName = input("Enter Directory Name : ")
    

    schedule.every(1).minutes.do(DirectoryScan, DirectoryName)

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