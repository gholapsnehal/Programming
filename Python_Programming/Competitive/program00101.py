##################################################################################################
#
# Function Name : CountWords
# Input         : String
# Output        : Integer
# Description   : Accept file name from user and return the total number of words
#                 present in the file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CountWords(FileName):

    try:
        fobj = open(FileName, "r")

        iCnt = 0

        for Line in fobj:

            Words = Line.split()
            iCnt = iCnt + len(Words)

        fobj.close()

        return iCnt

    except FileNotFoundError:
        print("Unable to open file as file does not exist")
        return

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept file name from user and display total number of words
#                 present in the file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    FileName = input("Enter file name : ")

    Ret = CountWords(FileName)

    if Ret is not None:
        print("Total number of words are :", Ret)

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()