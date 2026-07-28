def reverse(Number):

    reverse = 0
    digit = 0

    while(Number > 0):
        digit = Number % 10
        reverse = (reverse * 10) + digit
        Number = Number // 10

    return reverse


def main():

    value = int(input("Enter Number : "))

    Result = reverse(value)

    print(f"Original Number : {value}")
    print(f"Reversed Number : {Result}")


if __name__ == "__main__":
    main()