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
# Function Name    : DisplayLine()
# Description      : Line chart of Amit's marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DisplayLine(DataFrame):

    border = "-"*80

    Subjects = ["Math","Science","English"]

    Marks = [
        DataFrame.loc[0,"Math"],
        DataFrame.loc[0,"Science"],
        DataFrame.loc[0,"English"]
    ]

    plt.plot(
        Subjects,
        Marks,
        marker = "o"
    )

    plt.title("Amit's Marks")
    plt.xlabel("Subjects")
    plt.ylabel("Marks")

    plt.grid()

    plt.show()

############################################################################

def main():

    df = CreateDataFrame()

    DisplayLine(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        