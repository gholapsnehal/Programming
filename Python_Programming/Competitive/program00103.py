##################################################################################################
#
# Function Name : CopyFile
# Input         : String, String
# Output        : None
# Description   : Accept source and destination file names from user and copy
#                 the contents of source file into destination file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CopyFile(Source, Destination):

    try:
        sobj = open(Source, "r")

        Data = sobj.read()

        sobj.close()

        dobj = open(Destination, "w")

        dobj.write(Data)

        dobj.close()

    except FileNotFoundError:
        print("Unable to open file as file does not exist")
        return

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept source and destination file names from user and copy
#                 the contents of source file into destination file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    SourceFile = input("Enter existing file name : ")
    DestinationFile = input("Enter new file name : ")

    CopyFile(SourceFile, DestinationFile)

    print("File content copied successfully")

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()