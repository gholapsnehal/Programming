##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time

##################################################################################################
#
# Function Name : MondayTask
# Input         : None
# Output        : None
# Description   : Display weekly goal reminder on Monday at 9:00 AM
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def MondayTask():

    print("Start your weekly goals")

##################################################################################################
#
# Function Name : WednesdayTask
# Input         : None
# Output        : None
# Description   : Display weekly progress reminder on Wednesday at 5:00 PM
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def WednesdayTask():

    print("Review your weekly progress")

##################################################################################################
#
# Function Name : FridayTask
# Input         : None
# Output        : None
# Description   : Display work completion reminder on Friday at 6:00 PM
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def FridayTask():

    print("Weekly work completed")

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Schedule weekly reminder messages on Monday, Wednesday
#                 and Friday at specified times
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    schedule.every().monday.at("09:00").do(MondayTask)

    schedule.every().wednesday.at("17:00").do(WednesdayTask)

    schedule.every().friday.at("18:00").do(FridayTask)

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