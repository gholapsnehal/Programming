
def ReverseString(str):

    Rev = str[::-1]
    return Rev

def main():

    str = input("Enter a string : ")

    Ret = ReverseString(str)

    print("Given String : ",str)
    print("Reversed string : ",Ret)


if __name__ == "__main__":
    main()