
def ReverseString(str):

    Reverse = ""

    for char in str:
        Reverse =  char + Reverse

    return Reverse   

def main():

    str = input("Enter a string : ")

    Ret = ReverseString(str)

    print("Given String : ",str)
    print("Reversed string : ",Ret)


if __name__ == "__main__":
    main()