###################################################################################################
#
# Assignment 55 Q.2  : Fraudulent Transaction Detection Using Ensemble Learning
#
# Description        : Detect fraudulent transactions using multiple
#                      ensemble learning algorithms and compare results
#
# Date               : 31/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#
# Tasks :
#
# 1. Load dataset
# 2. Check missing values
# 3. Separate input and output
# 4. Split dataset into training and testing data
# 5. Train Decision Tree
# 6. Train Bagging Classifier
# 7. Train Random Forest
# 8. Train AdaBoost Classifier
# 9. Train Voting Classifier
# 10. Calculate Accuracy
# 11. Calculate Precision
# 12. Calculate Recall
# 13. Calculate F1 Score
# 14. Display Confusion Matrix
# 15. Compare all models
#
###################################################################################################

import pandas as pd

from sklearn.model_selection import train_test_split

from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import BaggingClassifier
from sklearn.ensemble import RandomForestClassifier
from sklearn.ensemble import AdaBoostClassifier
from sklearn.ensemble import VotingClassifier

from sklearn.metrics import accuracy_score
from sklearn.metrics import precision_score
from sklearn.metrics import recall_score
from sklearn.metrics import f1_score
from sklearn.metrics import confusion_matrix

###################################################################################################

def CalculateMetrics(Y_test, Y_pred):

    accuracy = accuracy_score(Y_test, Y_pred) * 100

    precision = precision_score(Y_test, Y_pred)

    recall = recall_score(Y_test, Y_pred)

    f1 = f1_score(Y_test, Y_pred)

    matrix = confusion_matrix(Y_test, Y_pred)

    return accuracy, precision, recall, f1, matrix

###################################################################################################

def main():

    print("----------------------------------------------------")
    print("Fraudulent Transaction Detection")
    print("----------------------------------------------------")

    ###################################################################################################
    # Step 1 : Load Dataset
    ###################################################################################################

    df = pd.read_csv("Fraudulent_Transaction_Detection.csv")

    print("\nDataset Loaded Successfully")

    ###################################################################################################
    # Step 2 : Missing Values
    ###################################################################################################

    print("\nMissing Values :")
    print(df.isnull().sum())

    ###################################################################################################
    # Step 3 : Separate Input and Output
    ###################################################################################################

    X = df.drop("Fraud", axis = 1)

    Y = df["Fraud"]

    print("\nInput Shape :", X.shape)
    print("Output Shape :", Y.shape)

    ###################################################################################################
    # Step 4 : Train Test Split
    ###################################################################################################

    X_train, X_test, Y_train, Y_test = train_test_split(
                                                        X,
                                                        Y,
                                                        test_size = 0.2,
                                                        random_state = 42
                                                       )

    ###################################################################################################
    # Step 5 : Decision Tree
    ###################################################################################################

    DT = DecisionTreeClassifier(random_state = 42)

    DT.fit(X_train, Y_train)

    Y_pred_DT = DT.predict(X_test)

    DT_Result = CalculateMetrics(Y_test, Y_pred_DT)

    ###################################################################################################
    # Step 6 : Bagging
    ###################################################################################################

    BG = BaggingClassifier(
                           estimator = DecisionTreeClassifier(),
                           n_estimators = 10,
                           random_state = 42
                          )

    BG.fit(X_train, Y_train)

    Y_pred_BG = BG.predict(X_test)

    BG_Result = CalculateMetrics(Y_test, Y_pred_BG)

    ###################################################################################################
    # Step 7 : Random Forest
    ###################################################################################################

    RF = RandomForestClassifier(
                                n_estimators = 100,
                                random_state = 42
                               )

    RF.fit(X_train, Y_train)

    Y_pred_RF = RF.predict(X_test)

    RF_Result = CalculateMetrics(Y_test, Y_pred_RF)

    ###################################################################################################
    # Step 8 : AdaBoost
    ###################################################################################################

    AB = AdaBoostClassifier(
                            n_estimators = 50,
                            random_state = 42
                           )

    AB.fit(X_train, Y_train)

    Y_pred_AB = AB.predict(X_test)

    AB_Result = CalculateMetrics(Y_test, Y_pred_AB)

    ###################################################################################################
    # Step 9 : Voting Classifier
    ###################################################################################################

    VC = VotingClassifier(
                          estimators =
                          [
                              ('dt', DT),
                              ('rf', RF),
                              ('ab', AB)
                          ],
                          voting = 'hard'
                         )

    VC.fit(X_train, Y_train)

    Y_pred_VC = VC.predict(X_test)

    VC_Result = CalculateMetrics(Y_test, Y_pred_VC)

    ###################################################################################################
    # Step 10 : Display Results
    ###################################################################################################

    print("\n----------------------------------------------------")
    print("Model Comparison")
    print("----------------------------------------------------")

    print("\nDecision Tree")
    print("Accuracy  :", round(DT_Result[0],2))
    print("Precision :", round(DT_Result[1],2))
    print("Recall    :", round(DT_Result[2],2))
    print("F1 Score  :", round(DT_Result[3],2))
    print("Confusion Matrix :")
    print(DT_Result[4])

    print("\nBagging")
    print("Accuracy  :", round(BG_Result[0],2))
    print("Precision :", round(BG_Result[1],2))
    print("Recall    :", round(BG_Result[2],2))
    print("F1 Score  :", round(BG_Result[3],2))
    print("Confusion Matrix :")
    print(BG_Result[4])

    print("\nRandom Forest")
    print("Accuracy  :", round(RF_Result[0],2))
    print("Precision :", round(RF_Result[1],2))
    print("Recall    :", round(RF_Result[2],2))
    print("F1 Score  :", round(RF_Result[3],2))
    print("Confusion Matrix :")
    print(RF_Result[4])

    print("\nAdaBoost")
    print("Accuracy  :", round(AB_Result[0],2))
    print("Precision :", round(AB_Result[1],2))
    print("Recall    :", round(AB_Result[2],2))
    print("F1 Score  :", round(AB_Result[3],2))
    print("Confusion Matrix :")
    print(AB_Result[4])

    print("\nVoting Classifier")
    print("Accuracy  :", round(VC_Result[0],2))
    print("Precision :", round(VC_Result[1],2))
    print("Recall    :", round(VC_Result[2],2))
    print("F1 Score  :", round(VC_Result[3],2))
    print("Confusion Matrix :")
    print(VC_Result[4])

###################################################################################################

if __name__ == "__main__":
    main()

###################################################################################################