############################################################################
#
# Function Name    : CreateDataFrame()
# Description      : Create DataFrame of given information 
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

import pandas as pd

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
# Function Name    : CalculateAverageMarks()
# Description      : Group students by Gender and calculate average marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def CalculateAverageMarks(DataFrame):

    border = "-"*80

    NewDataFrame = DataFrame.groupby("Gender")[
        ["Math","Science","English"]
    ].mean()


    print(border)
    print("Average Marks Grouped By Gender")
    print(border)

    print(NewDataFrame)
    print(border)

############################################################################

def main():

    df = CreateDataFrame()

    CalculateAverageMarks(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        