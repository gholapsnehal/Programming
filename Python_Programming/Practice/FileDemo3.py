def WriteData(FileName, Message):

    try:

        with open(FileName, "a") as fobj:
            fobj.write(Message + "\n")

        print("Data written successfully")

    except Exception as eobj:

        print("Unable to write data :", eobj)


def main():

    WriteData("Log.txt", "Platform Surveillance Started")
    WriteData("Log.txt", "CPU monitoring completed")


if __name__ == "__main__":
    main()