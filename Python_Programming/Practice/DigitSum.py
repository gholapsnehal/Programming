def SumOfDigit(Number):

    Digit = 0
    Sum = 0

    while(Number != 0):

        Digit = Number % 10
        Sum = Sum + Digit
        Number = Number // 10

    return Sum
    

def main():

    Value = int(input("Enter Number : "))

    Ret = SumOfDigit(Value)

    print(f"Sum of digits in {Value} is {Ret}")


if __name__ == "__main__":
    main()