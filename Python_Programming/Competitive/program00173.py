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
# Function Name    : PerformOneHotEncoding()
# Description      : One Hot Encoding of Gender column
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def PerformOneHotEncoding(DataFrame):

    border = "-"*80

    DataFrame = pd.get_dummies(
        DataFrame,
        columns=['Gender']
    )

    print(border)
    print("Dataframe after one hot encoding")
    print(border)

    print(DataFrame)
    print(border)

############################################################################

def main():

    df = CreateDataFrame()

    PerformOneHotEncoding(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        