import time


def WriteLog(FileName, Message):

    try:

        timestamp = time.strftime("%Y-%m-%d %H:%M:%S")

        fobj = open(FileName, "a")

        fobj.write(timestamp + " : " + Message + "\n")

        fobj.close()

        print("Log written successfully")

    except Exception as eobj:

        print("Unable to write log :", eobj)


def main():

    FileName = "System.log"

    WriteLog(FileName, "Platform Surveillance Started")
    WriteLog(FileName, "CPU monitoring completed")
    WriteLog(FileName, "RAM monitoring completed")
    WriteLog(FileName, "Platform Surveillance Completed")


if __name__ == "__main__":
    main()