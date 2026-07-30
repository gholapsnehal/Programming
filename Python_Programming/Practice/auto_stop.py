import schedule
import time


def Display():

    print("Jay Ganesh")

def ExecuteTask(counter):

    Display()
    counter = counter + 1
    print("counter : ",counter)


def main():
    counter = 0

    ExecuteTask(counter)
    ExecuteTask(counter)


if __name__ == "__main__":
    main()