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
# Function Name    : CountPassedStudents()
# Description      : Count number of students who passed
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def CountPassedStudents(DataFrame):

    border = "-"*80

    DataFrame["Total"] = \
        DataFrame["Math"] + \
        DataFrame["Science"] + \
        DataFrame["English"]

    DataFrame["Status"] = \
        DataFrame["Total"].apply(
            lambda Marks : "Pass" if Marks >= 250 else "Fail"
        )

    Count = (DataFrame["Status"] == "Pass").sum()

    print("Number of passed students : ",Count)

############################################################################

def main():

    df = CreateDataFrame()

    CountPassedStudents(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        