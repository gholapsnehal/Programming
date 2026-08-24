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
# Function Name    : ReplaceName()
# Description      : Replace Pooja with Puja in Name column
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def ReplaceName(DataFrame):

    border = "-"*80

    DataFrame["Name"] = \
        DataFrame["Name"].replace(
            "Pooja",
            "Puja"
        )

    print(border)
    print("Updated dataframe : ")
    print(border)

    print(DataFrame)
    print(border)

############################################################################

def main():

    df = CreateDataFrame()

    ReplaceName(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        