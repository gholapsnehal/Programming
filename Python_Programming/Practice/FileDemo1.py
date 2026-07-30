def FileStats(FileName):

    try:

        fobj = open(FileName, "r")

        Data = fobj.read()

        fobj.close()

        Lines = Data.splitlines()
        Words = Data.split()
        Characters = len(Data)

        return len(Lines), len(Words), Characters

    except Exception as eobj:

        print("Error :", eobj)


def main():

    FileName = input("Enter file name : ")

    Result = FileStats(FileName)

    if(Result != None):

        print("Total Lines :", Result[0])
        print("Total Words :", Result[1])
        print("Total Characters :", Result[2])


if __name__ == "__main__":
    main()