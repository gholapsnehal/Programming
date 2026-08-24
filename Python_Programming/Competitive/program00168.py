############################################################################
#
# Function Name    : CreateDataFrame()
# Description      : Create DataFrame of given information 
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

import pandas as pd
import matplotlib.pyplot as plt

############################################################################

def CreateDataFrame():

    Data = {
        'Name' : ['Amit', 'Sagar', 'Pooja'],
        'Math' : [85, 90, 78],
        'Science' : [92, 88, 80],
        'English' : [75, 85, 82]
    }

    DataFrame = pd.DataFrame(Data)

    return DataFrame

############################################################################
#
# Function Name    : DisplayBarChart()
# Description      : Display bar chart of student total marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DisplayBarChart(DataFrame):

    border = "-"*80

    DataFrame["Total"] = \
        DataFrame["Math"] + \
        DataFrame["Science"] + \
        DataFrame["English"]

    plt.bar(
        DataFrame["Name"],
        DataFrame["Total"]
    )

    plt.title("Student Total Marks")
    plt.xlabel("Student Name")
    plt.ylabel("Total Marks")

    plt.show()

############################################################################

def main():

    df = CreateDataFrame()

    DisplayBarChart(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        