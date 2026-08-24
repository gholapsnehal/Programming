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
# Function Name    : AddStatus()
# Description      : Add Status column based on Total marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def AddStatus(DataFrame):

    border = "-"*80

    DataFrame["Total"] = \
        DataFrame["Math"] + \
        DataFrame["Science"] + \
        DataFrame["English"]

    DataFrame["Status"] = \
        DataFrame["Total"].apply(
            lambda Marks : "Pass" if Marks >= 250 else "Fail"
        )

    print("dataframe with status column")
    print(border)

    print(DataFrame)

############################################################################

def main():

    df = CreateDataFrame()

    AddStatus(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        