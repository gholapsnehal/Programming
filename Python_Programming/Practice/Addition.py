def Addition(num1, num2):

    return num1 + num2


def main():

    print("Enter first number : ")
    Value1 = int(input())

    print("Enter second number : ")
    Value2 = int(input())

    Ans = Addition(Value1, Value2)

    print("Addition is : ",Ans)

if __name__ == "__main__":
    main()