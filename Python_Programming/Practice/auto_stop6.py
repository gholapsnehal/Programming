import schedule
import time
import sys

def Display(fobj):

    try:

        fobj.write("Marvel Dooms...\n")

    except ValueError as eobj:
        print("Unable to write into file : ",eobj)



def main():

    TimeInterval = int(sys.argv[1])
    Duration = int(sys.argv[2])

    StartTime = time.time()

    try:

        fobj = open("Alog.txt","w")

        print("script running...")
        schedule.every(TimeInterval).seconds.do(Display,fobj)

        while True:
            schedule.run_pending()

            CurrentTime = time.time()

            ElapsedTime = CurrentTime - StartTime

            if ElapsedTime >= Duration:
                break          

            time.sleep(1)
            
        fobj.close()

        print("Script stopped automatically")

    except Exception as e:
        print("Error : ",e)


if __name__ == "__main__":
    main()