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
# Function Name : Display
# Input         : None
# Output        : None
# Description   : Write current date and time into file
# Date          : 21/07/2026
#
##################################################################################################

def Display():

    CurrentTime = datetime.datetime.now()

    fobj = open("Marvellous.txt","a")

    print("Task Executed at :", CurrentTime)

    fobj.write(f"Task Executed at : {CurrentTime}\n\n")

    fobj.close()

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Schedule Display function after every 10 seconds
# Date          : 21/07/2026
#
##################################################################################################

def main():

    Border = "-" * 50

    print(Border)
    print("Automation script started")
    print(Border)

    fobj = open("Marvellous.txt","a")

    fobj.write(f"{Border}\n")
    fobj.write("Time entries below :\n")
    fobj.write(f"{Border}\n\n")

    fobj.close()

    schedule.every(5).minutes.do(Display)

    while True:

        schedule.run_pending()
        time.sleep(2)

##################################################################################################
#
#   Starter of Application
#
##################################################################################################

if __name__ == "__main__":
    main()