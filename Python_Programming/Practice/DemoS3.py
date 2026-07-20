import schedule
import time
from datetime import datetime 


def display():
    
    CurrentTime = datetime.now()
    print("Current Time is :",CurrentTime.ctime())



def main():
    
    schedule.every(10).seconds.do(display)
    
    while True:
        schedule.run_pending()
        time.sleep(2)

if __name__ == "__main__":
    main()

