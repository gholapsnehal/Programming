##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import datetime
import os
import sys

##################################################################################################
#
# Function Name : MonitorFile
# Input         : String
# Output        : None
# Description   : Monitor the size of a specified file every 30 seconds
#                 and store the details into FileSizeLog.txt
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def MonitorFile(FileName):

    border = "_" * 50

    CurrentDateTime = datetime.datetime.now()

    fobj = open("FileSizeLog.txt","a")

    fobj.write(f"{border}\n")

    if(os.path.exists(FileName) == True):

        filesize = os.path.getsize(FileName)

        fobj.write(f"File Path      : {os.path.abspath(FileName)}\n")
        fobj.write(f"File Size      : {filesize} Bytes\n")
        fobj.write(f"Date           : {CurrentDateTime.strftime('%d/%m/%Y')}\n")
        fobj.write(f"Time           : {CurrentDateTime.strftime('%H:%M:%S')}\n")

        print("File monitored successfully")

    else:

        fobj.write(f"File Path      : {FileName}\n")
        fobj.write("Status         : File does not exist\n")
        fobj.write(f"Date           : {CurrentDateTime.strftime('%d/%m/%Y')}\n")
        fobj.write(f"Time           : {CurrentDateTime.strftime('%H:%M:%S')}\n")

        print("File does not exist")

    fobj.write(f"{border}\n\n")

    fobj.close()

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Monitor the specified file after every 30 seconds
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    border = "_" * 50

    if(len(sys.argv) != 2):
        print("Usage : python programfile.py FileName")
        return

    FileName = sys.argv[1]

    print(border)
    print("File Monitoring Automation Started...")
    print(border)

    schedule.every(30).seconds.do(MonitorFile, FileName)

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