
import pandas as pd
import matplotlib.pyplot as plt

border = "-"*80

#####################################################################################
#
#    1 : Load the Dataset
#
#####################################################################################

print(border)
print("Load the dataset")
print(border)

DataPath = ("student_performance_ml.csv")

df = pd.read_csv(DataPath)

print("Dataset loaded successfully")

#####################################################################################
#
#    2 : Plot Histogram of StudyHours
#
#####################################################################################

print(border)
print("Plot Histogram of StudyHours")
print(border)

plt.figure(figsize=(7,5))

plt.hist(df["StudyHours"], bins= 10)

plt.title("Histogram of StudyHours")

plt.xlabel("StudyHours")
plt.ylabel("Frequency")

plt.grid()
plt.show()
