############################################################################
#
# Function Name    : CreateDataFrame()
# Description      : Create DataFrame of given information
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

import pandas as pd

def CreateDataFrame():

    data = {
        "Name" : ["Amit","Sagar","Pooja"],
        "Math" : [85,90,78],
        "Science" : [92,88,80],
        "English" : [75,85,82]
    }

    df = pd.DataFrame(data)

    return df

############################################################################
#
# Function Name    : DisplayInformation()
# Description      : Create DataFrame and display information
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DisplayInformation(df):

    border = "-"*80

    print(border)
    print("Student DataFrame")
    print(border)

    print(df)
    print(border)

    print("\nShape of dataframe : ")
    print(df.shape)
    print(border)

    print("\nColumn names : ")
    print(df.columns)
    print(border)

    print("\nData Types : ")
    print(df.dtypes)
    print(border)

############################################################################

def main():

    df = CreateDataFrame()

    DisplayInformation(df)

############################################################################

if __name__ == "__main__":
    main()
    