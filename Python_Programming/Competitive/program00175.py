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
        'English' : [75, 85, 82],
        'Gender'  : ['Male','Male','Female']
    }

    DataFrame = pd.DataFrame(Data)

    return DataFrame

############################################################################
#
# Function Name    : DisplayPieChart()
# Description      : Display Pie Chart of Sagar's Marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DisplayPieChart(DataFrame):

    border = "-"*80

    Subjects = ["Math","Science","English"]

    Marks = [
        DataFrame.loc[1,"Math"],
        DataFrame.loc[1,"Science"],
        DataFrame.loc[1,"English"]
    ]

    plt.pie(
        Marks,
        labels= Subjects,
        autopct= "%1.1f%%"
    )

    plt.title("Sagar's subject marks")

    plt.show()


############################################################################

def main():

    df = CreateDataFrame()

    DisplayPieChart(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        