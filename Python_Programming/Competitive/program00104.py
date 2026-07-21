##################################################################################################
#
# Function Name : SearchWord
# Input         : String, String
# Output        : Boolean
# Description   : Accept file name and a word from user and check whether the
#                 specified word is present in the file or not
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def SearchWord(FileName, Word):

    try:
        fobj = open(FileName, "r")

        Data = fobj.read()

        fobj.close()

        if Word in Data:
            return True
        else:
            return False

    except FileNotFoundError as obj:
        print("Unable to open file as file does not exist")
        return

##################################################################################################
#
# Function Name : main
# Input         : None
# Output        : None
# Description   : Accept file name and a word from user and check whether the
#                 specified word is present in the file or not
# Date          : 18/07/2026
# Author        : Snehal Gholap
#
##################################################################################################

def main():

    FileName = input("Enter file name : ")
    Word = input("Enter word to search : ")

    Ret = SearchWord(FileName, Word)

    if Ret is not None:

        if Ret == True:
            print("Word found in file")

        else:
            print("Word not found in file")

##################################################################################################
#
# Starter
#
##################################################################################################

if __name__ == "__main__":
    main()