def is_palindrome(str):

    reverse = ""

    for char in str:
        reverse = char + reverse

    if str == reverse:
        return True
    else:
        return False
    

def main():
    str = input("Enter String : ")

    if is_palindrome(str):
        print("String is a palindrome")
    else:
        print("String is not a palindrome")

    
if __name__ == "__main__":
    main()

