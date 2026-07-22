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
# Description   : Display current date and time on console
# Date          : 21/07/2026
#
##################################################################################################

def Display():

    print("Current Time : ", datetime.datetime.now())

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Call Display function immediately and then
#                 schedule it after every 1 minute
# Date          : 21/07/2026
#
##################################################################################################

def main():

    schedule.every(1).minutes.do(Display)

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