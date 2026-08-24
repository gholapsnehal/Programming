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
# Function Name    : DisplayStudents()
# Description      : Display students who scored more than 85 in science
# Author           : Snehal Gholap
# Date             : 13/08/2026
#
############################################################################

def DisplayStudents(DataFrame):

    border = "-"*80

    NewDataFrame = DataFrame[DataFrame["Science"] > 85]

    print(border)
    print("Students who socred more than 85 in Science")
    print(border)

    print(NewDataFrame)
    print(border)
 
############################################################################

def main():

    df = CreateDataFrame()

    DisplayStudents(df)

############################################################################

if __name__ == "__main__":
    main()

############################################################################

        