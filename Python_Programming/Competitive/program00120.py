##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time

##################################################################################################
#
# Function Name : CreateLog
# Input         : None
# Output        : None
# Description   : Create a new log file with current date and time in the
#                 file name and store log creation information in it
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CreateLog():

    TimeStamp = time.ctime()

    TimeStamp = TimeStamp.replace(" ", "_")
    TimeStamp = TimeStamp.replace(":", "_")

    LogFile = "MarvellousLog_%s.txt"%(TimeStamp)

    print("Log file created with name :", LogFile)

    fobj = open(LogFile, "w")

    fobj.write("Log file created successfully.\n")
    fobj.write(f"Creation Time : {TimeStamp}\n")

    fobj.close()

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Schedule log file creation after every 10 minutes
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    schedule.every(10).minutes.do(CreateLog)

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