def main():

    Ans = 0

    try:

        print("Enter first number : ")
        No1 = int(input())

        print("Enter second number : ")
        No2 = int(input())

        Ans = No1/No2

        print("Division is successfull")          #this line will skip when exception occurrs

    except ZeroDivisionError as zobj:

        print("Exception occured due to second operand is zero : ",zobj)

    except ValueError as vobj:

        print("Exception occurred due to invaid datatype : ",vobj)

    # Generic  can handle any exception so it should be at last exception not on first
    except Exception as eobj:

        print("Exception occurred : ",eobj)

    finally:

        print("Inside finally block")

    print("Division is : ",Ans)
    

if __name__ == "__main__":
    main()

# try made eobj madun then finally madun the baher padel 
# either exception comes or not it will go through finally block