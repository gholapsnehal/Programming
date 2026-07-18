def main():

    Ans = 0

    try:

        print("Enter first number : ")
        No1 = int(input())

        print("Enter second number : ")
        No2 = int(input())

        Ans = No1/No2

        print("Division is successfull")          #exception aala skip hoel

    except ZeroDivisionError as zobj:

        print("Exception occured due to second operand is zero : ",zobj)

    except ValueError as vobj:

        print("Exception occurred due to invaid datatype : ",vobj)

    print("Division is : ",Ans)
    

if __name__ == "__main__":
    main()

# Enter first number :
#12
#Enter second number :
#4
#Division is successfull
#Division is :  3.0

#C:\Users\sneha\OneDrive\Desktop\Python>python ExceptionDemo3.py
#Enter first number :
#12
#Enter second number :
#0
#Exception occured due to second operand is zero :  division by zero
#Division is :  0

#C:\Users\sneha\OneDrive\Desktop\Python>python ExceptionDemo3.py
#Enter first number :
#12
#Enter second number :
#h
#Exception occurred due to invaid datatype :  invalid literal for int() with base 10: 'h'
#Division is :  0

