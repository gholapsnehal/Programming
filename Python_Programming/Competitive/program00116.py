##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import shutil
import os

##################################################################################################
#
# Function Name : FileBackup
# Input         : SourceFile, DestinationDirectory
# Output        : None
# Description   : Create backup of source file in destination directory
#                 and generate log file for backup operation
# Date          : 21/07/2026
#
##################################################################################################

def FileBackup(SourceFile, DestinationDirectory):

    Ret = False

    Ret = os.path.exists(SourceFile)

    if(Ret == False):
        print("Unable to locate source file")
        return
    
    Ret = os.path.isdir(DestinationDirectory)

    if(Ret == False):
        print("Invalid destination directory")
        return
    
    timestamp = time.ctime()

    timestamp = timestamp.replace(" ","_")
    timestamp = timestamp.replace(":","_")

    filename = os.path.basename(SourceFile)

    BackupFileName = "%s_%s"%(timestamp,filename)

    BackupFilePath = os.path.join(DestinationDirectory,BackupFileName)

    shutil.copy(SourceFile, BackupFilePath)

    LogFileName = "Backup%s.log"%(timestamp)

    LogFileName = LogFileName.replace(" ","_")
    LogFileName = LogFileName.replace(":","_")

    fobj = open(LogFileName,"w")

    Border = "_" * 50

    fobj.write(Border + "\n")

    fobj.write("Backup Automation Script\n")

    fobj.write(Border + "\n\n")

    fobj.write("Source File : " + SourceFile + "\n")
    fobj.write("Destination Directory : " + DestinationDirectory + "\n")
    fobj.write("Backup File Name : " + BackupFileName + "\n\n")

    fobj.write("Backup completed successfully at : ")
    fobj.write(time.ctime())
    fobj.write("\n")

    fobj.write("\n" + Border + "\n")

    fobj.close()

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept source file and destination directory from user
#                 and schedule backup operation after every 1 hour
# Date          : 21/07/2026
#
##################################################################################################

def main():
    
    Border = "_" * 50

    print(Border)
    print("File Backup Automation Started")
    print(Border)

    SourceFile = input("Enter source file path : ")
    DestinationDirectory = input("Enter destination directory path : ")

    print("Script running : ")
    schedule.every(1).hours.do(FileBackup, SourceFile, DestinationDirectory)

    while True:

        schedule.run_pending()
        time.sleep(1)

##################################################################################################
#
#   Starter of Application
#
##################################################################################################

if __name__ == "__main__":
    main()