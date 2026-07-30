import schedule
import time


def Display():

    print("Jay Ganesh")

def ExecuteTask(counter):

    Display()
    counter[0] = counter[0] + 1
    print("counter : ",counter[0])


def main():
    counter = [0]

    ExecuteTask(counter)
    ExecuteTask(counter)


if __name__ == "__main__":
    main()