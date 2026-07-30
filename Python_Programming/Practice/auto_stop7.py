import schedule
import time


def Display():
    print("Jay Ganesh")


def ExecuteTask(StartTime, Duration):

    Display()

    CurrentTime = time.time()
    ElapsedTime = CurrentTime - StartTime

    if ElapsedTime >= Duration:
        print("Scheduled job stopped")
        return schedule.CancelJob


def main():

    StartTime = time.time()
    Duration = 10

    schedule.every(2).seconds.do(ExecuteTask, StartTime, Duration)

    while True:

        schedule.run_pending()

        CurrentTime = time.time()
        ElapsedTime = CurrentTime - StartTime

        if ElapsedTime >= Duration:
            break

        time.sleep(1)

    print("Script stopped automatically")


if __name__ == "__main__":
    main()