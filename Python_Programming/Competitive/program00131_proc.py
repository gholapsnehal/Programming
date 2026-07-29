###########################################################################################
#
# File Name    : ProcInfoLog.py
# Description  : Create a log file containing information of running processes
# Author       : Snehal Gholap
# Date         : 29/07/2026
#
###########################################################################################

import psutil
import sys
import os
import time

###########################################################################################

def CreateLog(DirectoryName):

    try:
        # Validation

        Ret = os.path.exists(DirectoryName)

        if(Ret == False):
            print("Directory does not exist")
            return

        Ret = os.path.isdir(DirectoryName)

        if(Ret == False):
            print("Invalid directory")
            return

        Border = "-" * 80

        Filename = "ProcessInfo_%s.log"%(time.strftime("%d-%m-%Y-%H-%M-%S"))

        LogFilePath = os.path.join(DirectoryName, Filename)

        fobj = open(LogFilePath, "w")

        fobj.write(Border + "\n")
        fobj.write("Information of Running Processes\n")
        fobj.write(Border + "\n")

        process = psutil.process_iter()

        for proc in process:

            try:
                fobj.write(Border + "\n")
                fobj.write("Process Name : %s\n"%proc.name())
                fobj.write("PID          : %s\n"%proc.pid)
                fobj.write("Username     : %s\n"%proc.username())

            except(psutil.NoSuchProcess,
                   psutil.AccessDenied,
                   psutil.ZombieProcess):
                pass

        fobj.close()

        print("Log file created successfully")

    except Exception as eobj:
        print("Exception occurred :", eobj)

###########################################################################################

def main():

    if(len(sys.argv) != 2):
        print("Invalid number of arguments")
        print("Usage : ProcInfoLog.py Directory")
        return

    CreateLog(sys.argv[1])

###########################################################################################

if __name__ == "__main__":
    main()