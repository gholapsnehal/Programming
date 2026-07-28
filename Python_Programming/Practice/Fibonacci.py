

def Fibonacci(No):
    a = 0
    b = 1

    print("Fibonacci Series : ")

    for i in range(No):

        print(a,end=" ")

        a, b = b, a + b


def main():
    Number = int(input("Enter the number : "))

    Fibonacci(Number)

if __name__ == "__main__":
    main()