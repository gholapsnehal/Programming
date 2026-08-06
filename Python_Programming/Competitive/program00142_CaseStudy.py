import pandas as pd
import matplotlib.pyplot as plt

border = "-" * 80

#####################################################################################
#
#   1 : Load the Dataset
#
#####################################################################################

print(border)
print("Load the Dataset")
print(border)

DataPath = "student_performance_ml.csv"

df = pd.read_csv(DataPath)

print("Dataset loaded successfully")

#####################################################################################
#
#   2 : Plot SleepHours vs FinalResult
#
#####################################################################################

print(border)
print("SleepHours vs FinalResult")
print(border)

plt.figure(figsize = (7,5))

plt.scatter(df["SleepHours"],
            df["FinalResult"])

plt.title("SleepHours vs FinalResult")

plt.xlabel("SleepHours")
plt.ylabel("FinalResult")

plt.grid()

plt.show()