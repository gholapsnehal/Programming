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
# Function Name    : DisplayHistogram()
# Description      : Display Histogram of Math Marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DisplayHistogram(DataFrame):

    border = "-"*80

    plt.hist(DataFrame["Math"])
    plt.title("Histogram of Math Marks")
    plt.xlabel("Math Marks")
    plt.ylabel("Frequency")

    plt.show()

############################################################################

def main():

    df = CreateDataFrame()

    DisplayHistogram(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        