
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
#    2 : Scatter plot StudyHours vs PreviousScore
#
#####################################################################################

print(border)
print("Scatter plot StudyHours vs PreviousScore")
print(border)

plt.figure(figsize= (7,5))

plt.scatter(df["StudyHours"], df["PreviousScore"])

plt.title("StudyHours vs PreviousScore")

plt.xlabel("StudyHours")
plt.ylabel("PreviousScore")

plt.grid()
plt.show()
