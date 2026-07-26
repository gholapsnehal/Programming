import schedule
import time

class Demo:

    def __init__(self):
        self.i = 0

    def display(self):
        print("Inside display")
        self.i = self.i + 1

obj = Demo()

schedule.every(2).seconds.do(obj.display)

while obj.i < 3:

    schedule.run_pending()
    time.sleep(1)

print("scheduler stopped")