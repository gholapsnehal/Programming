import schedule
import time

def Display(fobj):

    try:

        fobj.write("Marvel...\n")

    except ValueError as eobj:
        print("Unable to write into file : ",eobj)



def main():

    StartTime = time.time()

    try:

        fobj = open("Alog.txt","w")

        print("script running...")
        schedule.every(2).seconds.do(Display,fobj)

        while True:
            schedule.run_pending()

            CurrentTime = time.time()

            ElapsedTime = CurrentTime - StartTime

            if ElapsedTime >= 10:
                break          

            time.sleep(1)
            
        fobj.close()

        print("Script stopped automatically")

    except Exception as e:
        print("Error : ",e)


if __name__ == "__main__":
    main()