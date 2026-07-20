import schedule
import time

icnt = 0

def display():

    global icnt
    icnt = icnt + 2
    print("counter :",icnt)


def main():

    schedule.every(10).seconds.do(display)

    while(True):
        schedule.run_pending()
        time.sleep(1)
       

if __name__ == "__main__":
    main()



    