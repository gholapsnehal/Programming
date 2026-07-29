###########################################################################################
#
# File Name    : ProcInfo.py
# Description  : Display information of specified running process
# Author       : Snehal Gholap
# Date         : 29/07/2026
#
###########################################################################################

import psutil
import sys

###########################################################################################

def DisplayProcInfo(ProcessName):

    Border = "-" * 80

    Flag = False

    process = psutil.process_iter()

    for proc in process:

        try:

            if(proc.name().lower() == ProcessName.lower()):

                print(Border)
                print("Process Found")
                print(Border)

                print(f"Process Name : {proc.name()}")
                print(f"PID          : {proc.pid}")
                print(f"Username     : {proc.username()}")

                print(Border)

                Flag = True
                break

        except(psutil.NoSuchProcess,
               psutil.AccessDenied,
               psutil.ZombieProcess):
            pass

    if(Flag == False):
        print("Unable to find process")

###########################################################################################

def main():

    Border = "-" * 80

    if(len(sys.argv) != 2):
        print("Invalid number of arguments")
        print("Usage : python ProcInfo.py ProcessName")
        return

    ProcessName = sys.argv[1]

    print(Border)
    print("Process Information")
    print(Border)

    DisplayProcInfo(ProcessName)

###########################################################################################

if __name__ == "__main__":
    main()