##################################################################################################
#  
#    Imported modules
#
##################################################################################################

import schedule
import time

##################################################################################################
#
# Function Name : Display
# Input         : None
# Output        : None
# Description   : Display "Jay Ganesh..." on console after every 2 seconds
#                 using scheduler
# Date          : 21/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def Display():

    print("Jay Ganesh...")

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Schedule Display() function after every 2 seconds and
#                 execute it continuously
# Date          : 21/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    schedule.every(2).seconds.do(Display)

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