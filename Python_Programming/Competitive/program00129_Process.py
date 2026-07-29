###########################################################################################
#
# File Name    : ProcInfo.py
# Description  : Display information of all running processes
# Author       : Snehal Gholap
# Date         : 29/07/2026
#
###########################################################################################

import psutil

###########################################################################################

def DisplayProcInfo():

    Border = "-" * 80

    print(Border)
    print("Information of Running Processes")
    print(Border)

    process = psutil.process_iter()

    for proc in process:

        try:

            print(Border)
            print(f"Process Name : {proc.name()}")
            print(f"PID          : {proc.pid}")
            print(f"Username     : {proc.username()}")
            print(Border)

        except(psutil.NoSuchProcess,
               psutil.AccessDenied,
               psutil.ZombieProcess):
            pass

###########################################################################################

def main():

    Border = "-" * 80

    print(Border)
    print("Process Information")
    print(Border)

    DisplayProcInfo()

###########################################################################################

if __name__ == "__main__":
    main()