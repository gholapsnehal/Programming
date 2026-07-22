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
# Function Name : Lunch
# Input         : None
# Output        : None
# Description   : Display lunch reminder at 01:00 PM
# Date          : 21/07/2026
#
##################################################################################################

def Lunch():

    Border = "_" * 50

    timestamp = datetime.datetime.now()

    print(Border)
    print("Lunch Time !!!")
    print("Current Time :", timestamp)
    print(Border)

##################################################################################################
#
# Function Name : WrapUp
# Input         : None
# Output        : None
# Description   : Display work wrap-up reminder at 06:00 PM
# Date          : 21/07/2026
#
##################################################################################################

def WrapUp():

    Border = "_" * 50

    timestamp = datetime.datetime.now()

    print(Border)
    print("Wrap Up Work !!!")
    print("Current Time :", timestamp)
    print(Border)

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Schedule reminders for lunch and wrap-up time
# Date          : 21/07/2026
#
##################################################################################################

def main():

    Border = "_" * 50

    print(Border)
    print("Script running...")
    print(Border)

    schedule.every().day.at("13:00").do(Lunch)
    schedule.every().day.at("18:00").do(WrapUp)

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