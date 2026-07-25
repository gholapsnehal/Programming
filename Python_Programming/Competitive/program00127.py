##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import os
import sys
import datetime

##################################################################################################
#
# Function Name : DeleteEmptyFiles
# Input         : String
# Output        : None
# Description   : Delete all empty files recursively from the specified
#                 directory and store deleted file paths in a log file
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def DeleteEmptyFiles(DirectoryName):

    border = "_"*50

    timestamp = datetime.datetime.now()

    fobj = open("DeleteLog.txt","a")

    fobj.write(f"{border}\n")
    fobj.write(f"Date : {timestamp.strftime('%d/%m/%Y')}\n")
    fobj.write(f"Time : {timestamp.strftime('%H:%M:%S')}\n\n")

    if(os.path.isdir(DirectoryName) == False):

        print("Directory does not exist")

        fobj.write("Directory does not exist\n")
        fobj.write(f"{border}\n\n")

        fobj.close()

        return

    for FolderName, SubFolders, FileName in os.walk(DirectoryName):

        for File in FileName:

            FilePath = os.path.join(FolderName, File)

            try:

                if(os.path.getsize(FilePath) == 0):

                    os.remove(FilePath)

                    print(FilePath,"Deleted Successfully")

                    fobj.write(f"{FilePath} Deleted Successfully\n")

            except PermissionError as obj:

                print("Permission Denied",obj)

                fobj.write(f"{FilePath} Permission Denied\n")

            except Exception as eobj:

                print("Cannot Delete",eobj)

                fobj.write(f"{FilePath} Cannot Delete\n")

    fobj.write(f"{border}\n\n")

    fobj.close()

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Delete empty files after every one hour
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    border = "_"*50

    if(len(sys.argv) != 2):

        print("Usage : python program.py DirectoryName")

        return

    DirectoryName = sys.argv[1]

    print(border)
    print("Automation Started...")
    print(border)

    schedule.every(1).hours.do(DeleteEmptyFiles, DirectoryName)

    # For Testing
    # schedule.every(20).seconds.do(DeleteEmptyFiles, DirectoryName)

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