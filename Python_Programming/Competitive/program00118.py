##################################################################################################
#
#    Imported modules
#
##################################################################################################

import schedule
import time

##################################################################################################
#
# Function Name : DisplayMessage
# Input         : String
# Output        : None
# Description   : Display the user specified message on console
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def DisplayMessage(Message):

    print(Message)

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept message from user and schedule it to be displayed
#                 after every 5 seconds
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    Message = input("Enter your message : ")

    schedule.every(5).seconds.do(DisplayMessage, Message)

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