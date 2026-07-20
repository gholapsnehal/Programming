import schedule
import time
from datetime import datetime

def Fun():
    print(" fun start")
    time.sleep(10)
    print("Fun : ",datetime.now().strftime("%H:%M:%S"))
    print("fund end")

def Gun():
    print("Gun :",datetime.now().strftime("%H:%M:%S"))


def main():

    schedule.every(10).seconds.do(Fun)
    schedule.every(15).seconds.do(Gun)

    while True:
        schedule.run_pending()
        time.sleep(2)


if __name__ == "__main__":
    main()