##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import os
import shutil

##################################################################################################
#
# Function Name : Backup
# Input         : String, String
# Output        : None
# Description   : Accept source file and destination directory, create a backup
#                 of the source file in the destination directory and generate
#                 a log file containing backup information
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def Backup(SourceFile, DestinationDirectory):

    Border = "_" * 60

    Ret = False

    Ret = os.path.exists(SourceFile)

    if(Ret == False):
        print("Unable to locate source file")
        return

    Ret = os.path.isdir(DestinationDirectory)

    if(Ret == False):
        print("Invalid destination directory")
        return

    TimeStamp = time.ctime()

    TimeStamp = TimeStamp.replace(" ", "_")
    TimeStamp = TimeStamp.replace(":", "_")

    FileName = os.path.basename(SourceFile)

    BackupFileName = "%s_%s" % (TimeStamp, FileName)

    BackupFilePath = os.path.join(DestinationDirectory, BackupFileName)

    shutil.copy(SourceFile, BackupFilePath)

    LogFile = "Backup_%s.log" % (TimeStamp)

    LogFile = LogFile.replace(" ", "_")
    LogFile = LogFile.replace(":", "_")

    fobj = open(LogFile, "w")

    fobj.write(Border + "\n\n")
    fobj.write("File Backup\n")
    fobj.write(Border + "\n\n")

    fobj.write(f"Source File : {SourceFile}\n")
    fobj.write(f"Destination Directory : {DestinationDirectory}\n")
    fobj.write(f"Backup File Name : {BackupFileName}\n\n")

    fobj.write("Backup completed at : ")
    fobj.write(time.ctime())
    fobj.write("\n")

    fobj.write("\n" + Border + "\n")

    fobj.close()

    print(f"Log file created : {LogFile}")

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept source file path and destination directory from user
#                 and schedule automatic backup after every 10 minutes
# Date          : 21/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    Border = "_" * 60

    print(Border)
    print("File Backup")
    print(Border)

    SourceFile = input("Enter source file path : ")
    DestinationDirectory = input("Enter destination path : ")

    print("Script running...")

    schedule.every(10).minutes.do(Backup, SourceFile, DestinationDirectory)

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