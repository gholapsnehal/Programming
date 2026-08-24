############################################################################
#
# Function Name    : CreateDataFrame()
# Description      : Create DataFrame of given information 
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

import pandas as pd
import numpy as np

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
# Function Name    : DropColumn()
# Description      : Drop English column from DataFrame
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DropColumn(DataFrame):

    border = "-"*80

    NewDataFrame = DataFrame.drop(
        "English",
        axis = 1
    )

    print(border)
    print("dataframe after dropping English Column")
    print(border)

    print(NewDataFrame)

############################################################################

def main():

    df = CreateDataFrame()

    DropColumn(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        