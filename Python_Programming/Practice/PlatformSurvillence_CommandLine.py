# python process_servillence.py 2 MarvellousLog
# python process_servillence.py time_interval foldername
#                0                  1            2
#len(sys.argv) -> 3

#python process_servillence.py --h
#python process_servillence.py --u
#              0                1
#len(sys.argv) -> 2


import psutil
import sys
import os
import schedule

def main():

    Border = "-"*80

    print(Border)
    print("Marvellous Platform Survillence System")
    print(Border)

    # --h and --u handling
    if(len(sys.argv) == 2):

        if(sys.argv[1] == "--h" or sys.argv[1] == "--H"):

            print("This automation script is used to perform")
            print("1 : Its fetch inoformation of running proccesses")
            print("2 : It fetches the information about the primary storage as RAM")
            print("3 : It fetches information about the secondary storage as HDD")
            print("4 : It fecthes information about microprocessor")
            print("5 : It gets autoscheduled periodically")
            print("6 : It maintains record into the file")
            print("7 : It sends log files through mail periodically")

        elif(sys.argv[1] == "--u" or sys.argv[1] == "--u"):

            print("Use the automation script as :")
            print(f"python {sys.argv[0]} Time_Interval Folder_Name")
            print("Time_Interval : Time in minutes for periodic execution")
            print("Foler_Name : Name of the folder for the log file creation")
           

        else:
            print("Unable to proceed as there is no matching argument")
            print("Please use --h or --u flag for getting more details")

    # actual project code
    elif(len(sys.argv) == 3):
        pass

    else:
        print("Invalid number of arguments")
        print("Unable to proceed as arguments are not matching")
        print("Please use --h or --u flag for getting more details")


    print(Border)
    print("Thank You for using Marvellous Platform Survillence System")
    print(Border)

if __name__ == "__main__":
    main()