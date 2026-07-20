import os

def main():

        if(os.path.exists("demo.txt")):
            print("file is present")
        else:
            print("file is not present")
       
    
if __name__ == "__main__":
    main()