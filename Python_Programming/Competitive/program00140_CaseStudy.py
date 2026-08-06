
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
#    2 : Display Boxplot of Attendance
#
#####################################################################################

print(border)
print("Boxplot of Attendance")
print(border)

plt.figure(figsize= (7,5))

plt.boxplot(df["Attendance"])

plt.title("Boxplot of Attendance")

plt.ylabel("Attendance")

plt.grid()
plt.show()
