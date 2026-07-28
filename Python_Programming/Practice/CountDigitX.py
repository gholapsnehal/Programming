def Count(No):

    Count = 0

    while(No > 0):
        Count = Count + 1
        No = No // 10

    return Count


def main():

    Value = int(input("Enter number : "))

    Ret = Count(Value)

    print(f"Count of digits in {Value} is {Ret}")


if __name__ == "__main__":
    main()