##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time
import datetime

##################################################################################################
#
# Function Name : CreateFile
# Input         : None
# Output        : None
# Description   : Create a text file with current timestamp and write
#                 filename, creation date and creation time into it.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CreateFile():

    border = "_" * 50

    CurrentDateTime = datetime.datetime.now()

    TimeStamp = CurrentDateTime.strftime("%d_%m_%Y_%H_%M_%S")

    FileName = "File_%s.txt" % (TimeStamp)

    fobj = open(FileName, "w")

    fobj.write(f"{border}\n\n")
    fobj.write("File Created :\n")
    fobj.write(f"{border}\n\n")

    fobj.write(f"Filename       : {FileName}\n")
    fobj.write(f"Creation Date  : {CurrentDateTime.strftime('%d/%m/%Y')}\n")
    fobj.write(f"Creation Time  : {CurrentDateTime.strftime('%H:%M:%S')}\n")

    fobj.write(f"\n{border}\n")

    fobj.close()

    print(f"{FileName} created successfully")

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Create a new text file after every one minute.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    border = "_" * 50

    print(border)
    print("Automation script is running...")
    print(border)

    schedule.every(1).minutes.do(CreateFile)

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