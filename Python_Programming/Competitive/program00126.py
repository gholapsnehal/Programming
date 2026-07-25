##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import os
import sys
import shutil
import datetime

##################################################################################################
#
# Function Name : CopyFiles
# Input         : String, String
# Output        : None
# Description   : Copy all .txt files from source directory to destination
#                 directory and maintain log of copied files
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CopyFiles(SourceDir, DestinationDir):

    border = "_"*50

    timestamp = datetime.datetime.now()

    LogFile = open("CopyLog.txt","a")

    LogFile.write(f"{border}\n")
    LogFile.write(f"Date : {timestamp.strftime('%d/%m/%Y')}\n")
    LogFile.write(f"Time : {timestamp.strftime('%H:%M:%S')}\n\n")

    if(os.path.isdir(SourceDir) == False):
        print("Source directory does not exist")
        LogFile.write("Source directory does not exist\n")
        LogFile.close()
        return

    if(os.path.isdir(DestinationDir) == False):
        print("Destination directory does not exist")
        LogFile.write("Destination directory does not exist\n")
        LogFile.close()
        return

    for File in os.listdir(SourceDir):

        if(File.endswith(".txt")):

            SourceFile = os.path.join(SourceDir, File)
            DestinationFile = os.path.join(DestinationDir, File)

            try:

                shutil.copy2(SourceFile, DestinationFile)

                print(File,"Copied Successfully")

                LogFile.write(f"{File} Copied Successfully\n")

            except Exception:

                print(File,"Cannot be copied")

                LogFile.write(f"{File} Cannot be copied\n")

    LogFile.write(f"{border}\n\n")

    LogFile.close()

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Copy .txt files after every 10 minutes
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    border = "_"*50

    if(len(sys.argv) != 3):
        print("Usage : python program.py SourceDirectory DestinationDirectory")
        return

    SourceDir = sys.argv[1]
    DestinationDir = sys.argv[2]

    print(border)
    print("Automation Started...")
    print(border)

    schedule.every(10).minutes.do(CopyFiles, SourceDir, DestinationDir)

    # For Testing
    # schedule.every(10).seconds.do(CopyFiles, SourceDir, DestinationDir)

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