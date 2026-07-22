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
# Input         : String
# Output        : None
# Description   : Display the user specified message on console
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def Display(Message):

    print(Message)

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept message and time interval from user and schedule
#                 the message to be displayed repeatedly after the specified
#                 interval
# Date          : 22/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    Message = input("Enter Message : ")

    try:

        Interval = int(input("Enter Interval : "))

    except ValueError as obj:

        print("Please enter a valid integer")
        return

    # Input Filter

    if(Interval <= 0):

        print("Invalid interval")
        return

    schedule.every(Interval).seconds.do(Display, Message)

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