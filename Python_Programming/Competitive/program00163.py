############################################################################
#
# Function Name    : CreateDataFrame()
# Description      : Display descriptive statistics of student DataFrame
#                    using .describe()
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

import pandas as pd

############################################################################

def CreateDataFrame():

    data = {
        'Name' : ['Amit', 'Sagar', 'Pooja'],
        'Math' : [85, 90, 78],
        'Science' : [92, 88, 80],
        'English' : [75, 85, 82]
    }

    DataFrame = pd.DataFrame(data)

    return DataFrame

############################################################################

def DisplayStatistics(DataFrame):

    border = "-"*80

    Statistics = DataFrame.describe()

    print("Descriptive Statistics")
    print(border)

    print(Statistics)

############################################################################

def main():

    df = CreateDataFrame()

    DisplayStatistics(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################


