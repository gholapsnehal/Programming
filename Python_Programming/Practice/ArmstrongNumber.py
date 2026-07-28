def Armstrong(No):

    temp = No
    count = len(str(No))
    total = 0

    while(temp > 0):

        digit = temp % 10
        total = total + (digit ** count)
        temp = temp//10

    if(No == total):
        return True
    else:
        return False

def main():

    Value = int(input("Enter number : "))

    Ret = Armstrong(Value)

    if Ret:
        print(f"{Value} is an Armstrong Number")
    else:
        print(f"{Value} is not an Armstrong Number")


if __name__ == "__main__":
    main()