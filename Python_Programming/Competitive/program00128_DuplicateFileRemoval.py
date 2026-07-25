##################################################################################################
#
# Imported modules
#
##################################################################################################

import os
import sys
import hashlib
import schedule
import time
import datetime
import smtplib

##################################################################################################
#
# Function Name : CalculateChecksum
# Input         : String
# Output        : String
# Description   : Calculate and return MD5 checksum of the specified file.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CalculateChecksum(FileName):

    try:

        fobj = open(FileName,"rb")

        hobj = hashlib.md5()

        Buffer = fobj.read()

        hobj.update(Buffer)

        fobj.close()

        return hobj.hexdigest()

    except Exception as eobj:

        return eobj

##################################################################################################
#
# Function Name : FindDuplicate
# Input         : String
# Output        : Dictionary
# Description   : Scan the specified directory and return duplicate files.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def FindDuplicate(DirectoryName):

    Duplicate = {}

    for FolderName, SubFolderNames, FileNames in os.walk(DirectoryName):

        for File in FileNames:

            FilePath = os.path.join(FolderName, File)

            Checksum = CalculateChecksum(FilePath)

            if Checksum in Duplicate:

                Duplicate[Checksum].append(FilePath)

            else:

                Duplicate[Checksum] = [FilePath]

    return Duplicate

##################################################################################################
#
# Function Name : DeleteDuplicate
# Input         : Dictionary, File Object
# Output        : None
# Description   : Delete duplicate files and store information in log file.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def DeleteDuplicate(DuplicateData, fobj):

    iCount = 0

    for Checksum in DuplicateData:

        if(len(DuplicateData[Checksum]) > 1):

            for FileName in DuplicateData[Checksum][1:]:

                try:

                    os.remove(FileName)

                    fobj.write(f"{FileName} deleted successfully\n")

                    iCount = iCount + 1

                except Exception:

                    fobj.write(f"{FileName} cannot be deleted\n")

    fobj.write("\n")
    fobj.write(f"Total Duplicate Files Deleted : {iCount}\n\n")

    print("Duplicate files deleted successfully")


##################################################################################################
#
# Function Name : CreateLogFile
# Input         : None
# Output        : File Object
# Description   : Create Marvellous directory and log file.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CreateLogFile():

    DirectoryName = "Marvellous"

    if(os.path.exists(DirectoryName) == False):

        os.mkdir(DirectoryName)

    CurrentDateTime = datetime.datetime.now()

    TimeStamp = CurrentDateTime.strftime("%d_%m_%Y_%H_%M_%S")

    LogFileName = "DuplicateRemovalLog_%s.log"%(TimeStamp)

    LogFilePath = os.path.join(DirectoryName,LogFileName)

    fobj = open(LogFilePath,"w")

    border = "_" * 50

    fobj.write(f"{border}\n")
    fobj.write("Duplicate File Removal Log\n")
    fobj.write(f"{border}\n\n")

    fobj.write(f"Date : {CurrentDateTime.strftime('%d/%m/%Y')}\n")
    fobj.write(f"Time : {CurrentDateTime.strftime('%H:%M:%S')}\n\n")

    return fobj


##################################################################################################
#
# Function Name : ProcessDirectory
# Input         : String, String
# Output        : None
# Description   : Find and delete duplicate files from the specified directory.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def ProcessDirectory(DirectoryName, EmailID):

    fobj = CreateLogFile()

    DuplicateData = FindDuplicate(DirectoryName)

    DeleteDuplicate(DuplicateData, fobj)

    LogFileName = fobj.name

    fobj.close()

    SendEMail(LogFileName, EmailID)

    print("Process completed successfully")

##################################################################################################
#
# Function Name : SendMail
# Input         : String, String
# Output        : None
# Description   : Send log file as an email attachment.
# Date          : 24/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def SendEMail(LogFileName, ReceiverEmail):

    from email.message import EmailMessage

    SenderMail = input("Enter Sender Email : ")

    Password = input("Enter App Password : ")

    msg = EmailMessage()

    msg["Subject"] = "Duplicate File Removal Log"

    msg["From"] = SenderMail

    msg["To"] = ReceiverEmail

    msg.set_content("Please find the attached log file.")

    fobj = open(LogFileName,"rb")

    FileData = fobj.read()

    fobj.close()

    FileName = os.path.basename(LogFileName)

    msg.add_attachment(FileData,
                       maintype = "application",
                       subtype = "octet-stream",
                       filename = FileName)

    server = smtplib.SMTP("smtp.gmail.com",587)

    server.starttls()

    server.login(SenderMail,Password)

    server.send_message(msg)

    server.quit()

    print("Email sent successfully")


########################################################################
#
# main
#
########################################################################
def main():

    if(len(sys.argv)!=4):
        print("Usage : python program.py DirName Inerval EmailID")
        return

    DirectoryName = sys.argv[1]
    Interval = int(sys.argv[2])
    Receiver = sys.argv[3]

    schedule.every(Interval).seconds.do(ProcessDirectory,DirectoryName,Receiver)

    while(True):

        schedule.run_pending()

        time.sleep(1)


########################################################################
#
# starter 
#
#######################################################################

if __name__ == "__main__":
    main()