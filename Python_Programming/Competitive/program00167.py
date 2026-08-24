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
# Function Name    : SortDataFrame()
# Description      : Sort DataFrame by Total marks in descending order
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def SortDataFrame(DataFrame):

    border = "-"*80

    DataFrame["Total"] = \
        DataFrame["Math"] + \
        DataFrame["Science"] + \
        DataFrame["English"] 

    SortedDataFrame = \
        DataFrame.sort_values(
            by = "Total",
            ascending = False
        )

    print(border)
    print("dataframe sorted by Total marks")
    print(border)

    print(SortedDataFrame)
  
############################################################################

def main():

    df = CreateDataFrame()

    SortDataFrame(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        