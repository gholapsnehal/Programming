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
        'Math' : [np.nan, 76, 88],
        'Science' : [91, np.nan, 85]
    }

    DataFrame = pd.DataFrame(Data)

    return DataFrame

############################################################################
#
# Function Name    : FillMissingValues()
# Description      : Fill missing values using column mean
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def FillMissingValues(DataFrame):

    border = "-"*80

    DataFrame["Math"] = \
        DataFrame["Math"].fillna(
            DataFrame["Math"].mean()
        )

    DataFrame["Science"] = \
        DataFrame["Science"].fillna(
            DataFrame["Science"].mean()
        )

    print(border+"\n")
    print("dataframe after filling missing values\n")
    print(border+"\n")

    print(DataFrame)
    print(border)

############################################################################

def main():

    df = CreateDataFrame()

    FillMissingValues(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        