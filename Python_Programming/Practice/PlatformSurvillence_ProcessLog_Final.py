
import psutil
import sys
import os
import schedule
import time
import smtplib
from email.message import EmailMessage


def ProcessScan():

    listprocess = []

    for proc in psutil.process_iter():
        try:

            info = proc.as_dict(attrs=["pid","name","username","status"])
            info["cpu_percent"] = proc.cpu_percent(None)
            info["memory_percent"] = proc.memory_percent()

            listprocess.append(info)

        except (psutil.NoSuchProcess,
                psutil.AccessDenied,
                psutil.ZombieProcess):
            pass

    return listprocess

        

def PlatformSurvillence(FolderName,ReceiverEmail,SenderEmail,Password):

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

    # CPU INFORMATION
    CPUUsage = psutil.cpu_percent()

    fobj.write("Number of active CPU Cores : %s\n" %psutil.cpu_count())
    fobj.write("CPU Usage : %s %%\n" %CPUUsage)
    fobj.write(Border+"\n")

    # RAM INFORMATION

    memory = psutil.virtual_memory()   
    RAMUsage = memory.percent

    fobj.write("RAM Usage : %s %%\n" %RAMUsage)
    fobj.write("Total RAM available : %s\n" %memory.total)
    fobj.write(Border+"\n")

    #NETWORK USAGE
    # object

    netobj = psutil.net_io_counters()

    fobj.write("Network Usage Report\n")
    fobj.write("Sent : %.2f MB\n" %(netobj.bytes_sent / (1024 * 1024)))
    fobj.write("Receive : %.2f MB\n" %(netobj.bytes_recv / (1024 * 1024)))
    fobj.write(Border+"\n")

    # Process Log

    Data = ProcessScan()

    for info in Data:
        #fobj.write(f"{info}\n")
        fobj.write("PID : %s\n" %info.get("pid"))
        fobj.write("Name : %s\n" %info.get("name"))
        fobj.write("USER NAME : %s\n" %info.get("username"))
        fobj.write("STATUS : %s\n" %info.get("status"))
        fobj.write("CPU USAGE : %.4f\n" %info.get("cpu_percent"))
        fobj.write("RAM USAGE : %.2f\n" %info.get("memory_percent"))

        fobj.write(Border+"\n")


    fobj.write("\n\n\n\n\n\n\n\n\n\n")

    fobj.write(Border+"\n\n")
    fobj.write("-----------End of Log file-------------\n")
    fobj.write(Border+"\n\n")

    fobj.close()



    SendEmail(FileName,ReceiverEmail,SenderEmail,Password,timestamp,CPUUsage,RAMUsage,len(Data))
    


def SendEmail(LogFileName, ReceiverEMail,SenderEMail, Password,ScanTime,CPUUsage,RAMUsage,TotalProcesses):


    try:

        msg = EmailMessage()

        msg["From"] = SenderEMail
        msg["To"] = ReceiverEMail
        msg["Subject"] = "Platform Surveillance Log Report"

        body = f"""
        Jay Ganesh,

        The Platform Surveillance operation has been completed successfully.

        System Report

        Log Creation Time : {ScanTime}
        CPU Usage : {CPUUsage} %
        RAM Usage : {RAMUsage} %
        Total Running Processes : {TotalProcesses}

        Please find the attached log file.

        Regards,
        Automation System
        """
        
        msg.set_content(body)

        fobj = open(LogFileName,"rb")

        FileData = fobj.read()

        fobj.close()

        FileName = os.path.basename(LogFileName)

        msg.add_attachment(FileData,
                           maintype = "application",
                           subtype = "octet-stream",
                           filename = FileName)

        print("Connecting to Gmail server...")
        smtp = smtplib.SMTP_SSL("smtp.gmail.com",465)
        print("Connected success")

        smtp.login(SenderEMail,Password)

        smtp.send_message(msg)

        smtp.quit()

        print("Mail sent successfully")

    except Exception as eobj:
        print("Unable to send mail ",eobj)
        


def main():
    # call process scan
    #ProcessScan()

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

        elif(sys.argv[1] == "--u" or sys.argv[1] == "--U"):

            print("Use the automation script as :")
            print(f"python {sys.argv[0]} Time_Interval Folder_Name ReceiverEmail SenderEmail AppPassword")
            print("Time_Interval : Time in minutes for periodic execution")
            print("Foler_Name : Name of the folder for the log file creation")
            print("ReceiverEmail : Receiver's emailid")
            print("SenderEmail : Sender's emailid")
            print("AppPassword : Email App Password(16 char unique number)")
           

        else:
            print("Unable to proceed as there is no matching argument")
            print("Please use --h or --u flag for getting more details")

    # actual project code
    elif(len(sys.argv) == 6):

        #print("CPU USAGE : ", psutil.cpu_percent())

        TimeInterval = int(sys.argv[1])
        FolderName = sys.argv[2]
        ReceiverEmail = sys.argv[3]
        SenderEmail = sys.argv[4]
        Password = sys.argv[5]

        print("Scheduler started successfully...")
        print("Suggestion : Press CTRL + C to abort the automation script")
        
        schedule.every(TimeInterval).seconds.do(PlatformSurvillence,FolderName,ReceiverEmail,SenderEmail,Password)

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




