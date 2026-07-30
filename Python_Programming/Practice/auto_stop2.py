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

    print("scheduler started...")
    schedule.every(2).seconds.do(ExecuteTask,counter)

    while(counter[0] < 5):
        schedule.run_pending()
        time.sleep(1)


if __name__ == "__main__":
    main()