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
# Function Name    : ExportDataFrame()
# Description      : Export DataFrame to CSV file
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def ExportDataFrame(DataFrame):

    border = "-"*80

    DataFrame.to_csv(
        "StudentMarks.csv",
        index = False
    )

    print("dataframe exported successully")

############################################################################

def main():

    df = CreateDataFrame()

    ExportDataFrame(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        