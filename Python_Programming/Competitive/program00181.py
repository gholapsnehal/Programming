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
# Function Name    : DisplayBoxPlot()
# Description      : Display Boxplot of English Marks
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DisplayBoxPlot(DataFrame):

    border = "-"*80

    plt.boxplot(DataFrame["English"])

    plt.title("Boxplot of English Marks")

    plt.ylabel("English Marks")

    plt.show()

############################################################################

def main():

    df = CreateDataFrame()

    DisplayBoxPlot(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        