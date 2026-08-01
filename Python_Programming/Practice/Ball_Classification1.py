############################################################################################
#
# File Name    : BallClassification.py
# Description  : Ball Classification Case Study
# Author       : Snehal Gholap
# Date         : 01/08/2026
#
############################################################################################

############################################################################################
#
# Function Name : main
# 
############################################################################################

def main():

    print("------------------------------------------------")
    print("           Ball Classification Case Study")
    print("------------------------------------------------")

    Features = [
        [35, "Rough"],
        [47, "Rough"],
        [90, "Smooth"],
        [48, "Rough"],
        [90, "Smooth"],
        [35, "Rough"],
        [92, "Smooth"],
        [35, "Rough"],
        [35, "Rough"],
        [35, "Rough"],
        [96, "Smooth"],
        [43, "Rough"],
        [110, "Smooth"],
        [35, "Rough"],
        [95, "Smooth"]
    ]

    Labels = [
        "Tennis",
        "Tennis",
        "Cricket",
        "Tennis",
        "Cricket",
        "Tennis",
        "Cricket",
        "Tennis",
        "Tennis",
        "Tennis",
        "Cricket",
        "Tennis",
        "Cricket",
        "Tennis",
        "Cricket"
    ]

    print("Features are : ")
    print(Features)

    print()

    print("Labels are : ")
    print(Labels)


############################################################################################
#
#  Starter
#
############################################################################################

if __name__ == "__main__":
    main()