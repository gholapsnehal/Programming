import psutil
import sys
import os
import schedule
import time


def PlatformSurvillence(FolderName):

    Border = "-"*80

    Ret = False

    Ret = os.path.exists(FolderName)

    if(Ret == True):

        Ret = os.path.isdir(FolderName)

        if(Ret == False):
            print("Unable to proceed as foldername is existing but its not directory")
            return
        
    else:
        os.mkdir(FolderName)
        print("Directory for the logfile gets created successfully")

    timestamp = time.strftime("%Y-%m-%d_%H-%M-%S")

    FileName = os.path.join(FolderName,"Marvellous_%s.log" %timestamp)

    fobj = open(FileName,"w")

    print(f"Logfile gets successfully created with name {FileName}")

    fobj.write(Border+"\n")
    fobj.write("Marvellous Platform Survillence System")
    fobj.write("Log file gets created at : "+timestamp+"\n")
    fobj.write(Border+"\n\n")

    fobj.write("-----------------------System Report------------------------\n")
    fobj.write("\n\n\n\n\n\n\n\n\n\n")

    fobj.write(Border+"\n\n")
    fobj.write("-----------End of Log file-------------")
    fobj.write(Border+"\n\n")

    fobj.close()


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

        print("Scheduler started successfully...")
        print("Suggestion : Press CTRL+C to abort the automation script")
        
        schedule.every(int(sys.argv[1])).minutes.do(PlatformSurvillence, sys.argv[2])

        while True:
            schedule.run_pending()
            time.sleep(1)

    else:
        print("Invalid number of arguments")
        print("Unable to proceed as arguments are not matching")
        print("Please use --h or --u flag for getting more details")


    print(Border)
    print("Thank You for using Marvellous Platform Survillence System")
    print(Border)

if __name__ == "__main__":
    main()






# Q . to check how to schedule to abort script :
# counter in if function made to check and specific timevrti exit