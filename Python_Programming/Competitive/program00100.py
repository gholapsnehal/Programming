##################################################################################################
#
# Function Name : CountLines
# Input         : String
# Output        : Integer
# Description   : Accept file name from user and return the total number of lines
#                 present in the file
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def CountLines(FileName):

    try:
        fobj = open(FileName, "r")

        iCnt = 0

        for Line in fobj:
            iCnt = iCnt + 1

        fobj.close()

        return iCnt
    
    except FileNotFoundError as obj:
        print("Unable to open file as file does not exist")
        return -1


##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept file name from user and display total number of lines
#                 present in the file.
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    FileName = input("Enter file name : ")

    Ret = CountLines(FileName)

    if Ret != -1:
        print("Total number of lines are : ",Ret)

##################################################################################################
#
#   Starter 
#
##################################################################################################

if __name__ == "__main__":
    main()

