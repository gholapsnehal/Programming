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
# Function Name    : NormalizeMath()
# Description      : Normalize Math marks using Min-Max Scaling
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def NormalizeMath(DataFrame):

    border = "-"*80

    MinValue = DataFrame["Math"].min()

    MaxValue = DataFrame["Math"].max()

    DataFrame["Math_Normalized"] = \
        (DataFrame["Math"] - MinValue) / \
        (MaxValue - MinValue)

    print(border)
    print("Dataframe after normalization")
    print(border)

    print(DataFrame)
    print(border)

############################################################################

def main():

    df = CreateDataFrame()

    NormalizeMath(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        