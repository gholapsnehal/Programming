import schedule
import time

def Display(fobj):

    try:

        fobj.write("Jay Ganesh...\n")

    except ValueError as eobj:
        print("Unable to write into file : ",eobj)



def ExecuteTask(counter,fobj):

    try:
        Display(fobj)
        counter[0] = counter[0] + 1
        print("counter : ",counter[0])

        if counter[0] == 5:
            return schedule.CancelJob

    except Exception as e:
        print("unable to execute task : ",e)



def main():

    counter = [0]

    try:

        fobj = open("Alog.txt","w")

        print("script running...")
        schedule.every(5).seconds.do(ExecuteTask,counter,fobj)

        while True:
            schedule.run_pending()

            if counter[0] == 5:
                break

            time.sleep(1)

        fobj.close()

    except Exception as e:
        print("Error : ",e)


if __name__ == "__main__":
    main()