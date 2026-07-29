###########################################################################################
#
# File Name    : ProcInfoLog.py
# Description  : Create log file of running processes and send that log file
#                as an email attachment
# Author       : Snehal Gholap
# Date         : 29/07/2026
#
###########################################################################################

import psutil
import os
import sys
import time
import smtplib
from email.message import EmailMessage

###########################################################################################

def CreateLog(DirectoryName):

    try:
        # Validation

        Ret = os.path.exists(DirectoryName)

        if(Ret == False):
            print("Directory does not exist")
            return

        Ret = os.path.isdir(DirectoryName)

        if(Ret == False):
            print("Invalid directory")
            return

        Border = "-" * 80

        Filename = "ProcessInfo_%s.log"%(time.strftime("%d-%m-%Y-%H-%M-%S"))

        LogFilePath = os.path.join(DirectoryName, Filename)

        fobj = open(LogFilePath, "w")

        fobj.write(Border + "\n")
        fobj.write("Information of Running Processes\n")
        fobj.write(Border + "\n")

        process = psutil.process_iter()

        for proc in process:

            try:
                fobj.write(Border + "\n")
                fobj.write("Process Name : %s\n"%proc.name())
                fobj.write("PID          : %s\n"%proc.pid)
                fobj.write("Username     : %s\n"%proc.username())

            except(psutil.NoSuchProcess,
                   psutil.AccessDenied,
                   psutil.ZombieProcess):
                pass

        fobj.write(Border + "\n")
        fobj.write("Log file created successfully\n")
        fobj.write(Border + "\n")

        fobj.close()

        return LogFilePath

    except Exception as eobj:
        print("Exception occurred :", eobj)
        return None

###########################################################################################

def SendMail(sender, app_password, receiver, subject, body, AttachmentFile):

    try:

        msg = EmailMessage()

        msg["From"] = sender
        msg["To"] = receiver
        msg["Subject"] = subject

        msg.set_content(body)

        fobj = open(AttachmentFile, "rb")
        filedata = fobj.read()
        fobj.close()

        msg.add_attachment(filedata,
                           maintype = "application",
                           subtype = "octet-stream",
                           filename = os.path.basename(AttachmentFile))

        smtp = smtplib.SMTP_SSL("smtp.gmail.com", 465)

        smtp.login(sender, app_password)

        smtp.send_message(msg)

        smtp.quit()

        print("Mail sent successfully")

    except Exception as eobj:
        print("Unable to send email :", eobj)

###########################################################################################

def main():

    if(len(sys.argv) != 3):
        print("Invalid number of arguments")
        print("Usage : python ProcInfoLog.py DirectoryName EmailId")
        return

    DirectoryName = sys.argv[1]
    ReceiverEmail = sys.argv[2]

    sender_email = "snehalgholap0820@gmail.com"

    app_password = ""

    subject = "Test mail from python script"

    body = """Jay Ganesh,

This is a test email sent using python script

Regards,
Snehal Gholap"""

    Logfile = CreateLog(DirectoryName)

    if(Logfile != None):

        SendMail(sender_email,
                 app_password,
                 ReceiverEmail,
                 subject,
                 body,
                 Logfile)

###########################################################################################

if __name__ == "__main__":
    main()