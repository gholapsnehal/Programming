def main():

    Ans = 0

    try:

        print("Enter first number : ")
        No1 = int(input())

        print("Enter second number : ")
        No2 = int(input())

        Ans = No1/No2

        print("Division is successfull")          #this line will skip when exception occurrs

    except Exception as eobj:

        print("Exception occurred : ",eobj)

    # Generic  can handle any exception so it should be at last exception not on first
    

    print("Division is : ",Ans)
    

if __name__ == "__main__":
    main()
    
C:\Users\sneha\OneDrive\Desktop\Python>python ExceptionDemo5.py
Enter first number :
12
Enter second number :
4
Division is successfull
Division is :  3.0

C:\Users\sneha\OneDrive\Desktop\Python>python ExceptionDemo5.py
Enter first number :
12
Enter second number :
0
Exception occurred :  division by zero
Division is :  0

C:\Users\sneha\OneDrive\Desktop\Python>python ExceptionDemo5.py
Enter first number :
12
Enter second number :
h
Exception occurred :