def Palindrome(No):

    reverse = 0
    temp = No
    digit = 0

    while temp > 0:
        digit = temp % 10
        reverse = (reverse * 10) + digit
        temp = temp // 10
        
    if No == reverse:
        return True
    else:
        return False
    

def main():

    Value = int(input("Enter number : "))
    Ret = 0

    Ret = Palindrome(Value)

    if(Ret):
        print(f"{Value} is a palindrome\n")
    else:
        print(f"{Value} is not a palindrome\n")

    
if __name__ == "__main__":
    main()