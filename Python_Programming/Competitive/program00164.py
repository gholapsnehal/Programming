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
        'English' : [75, 85, 82]
    }

    DataFrame = pd.DataFrame(Data)

    return DataFrame

############################################################################
#
# Function Name    : AddTotalMarks()
# Description      : Add new column "Total" to dataframe as the sum of 
#                    all subject marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def AddTotalMarks(DataFrame):

    border = "-"*80

    DataFrame["Total"] = \
        DataFrame["Math"] + \
        DataFrame["Science"] + \
        DataFrame["English"] 

    print(border)
    print("dataframe after adding Total column")
    print(border)

    print(DataFrame)
    print(border)

############################################################################

def main():

    df = CreateDataFrame()

    AddTotalMarks(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        