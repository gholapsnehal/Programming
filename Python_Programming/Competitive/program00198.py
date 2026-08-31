###################################################################################################
#
# Assignment 55 Q.1  : Customer Loan Approval Using Voting Classification
#
# Description        : Build Logistic Regression, Decision Tree and KNN models
#                      and combine them using Voting Classifier
#
# Date               : 31/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#
# Tasks :
#
# 1. Load the dataset
# 2. Check missing values
# 3. Separate input and output features
# 4. Split dataset into training and testing data
# 5. Train Logistic Regression model
# 6. Train Decision Tree model
# 7. Train KNN model
# 8. Calculate accuracy of individual models
# 9. Create Hard Voting Classifier
# 10. Calculate accuracy of Hard Voting
# 11. Create Soft Voting Classifier
# 12. Calculate accuracy of Soft Voting
# 13. Compare all models
#
###################################################################################################

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.tree import DecisionTreeClassifier
from sklearn.neighbors import KNeighborsClassifier
from sklearn.ensemble import VotingClassifier
from sklearn.metrics import accuracy_score

###################################################################################################

def main():

    print("------------------------------------------------")
    print("Customer Loan Approval Using Voting Classification")
    print("------------------------------------------------")

    ###################################################################################################
    # Step 1 : Load Dataset
    ###################################################################################################

    df = pd.read_csv("Customer_Loan_Approval.csv")

    print("\nDataset Loaded Successfully")

    ###################################################################################################
    # Step 2 : Check Missing Values
    ###################################################################################################

    print("\nMissing Values :")
    print(df.isnull().sum())

    ###################################################################################################
    # Step 3 : Separate Input and Output
    ###################################################################################################

    X = df.drop("LoanApproved", axis = 1)
    Y = df["LoanApproved"]

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

    print("\nTraining Data Shape :", X_train.shape)
    print("Testing Data Shape  :", X_test.shape)

    ###################################################################################################
    # Step 5 : Logistic Regression
    ###################################################################################################

    log_model = LogisticRegression(max_iter = 1000)

    log_model.fit(X_train, Y_train)

    Y_pred_log = log_model.predict(X_test)

    log_accuracy = accuracy_score(Y_test, Y_pred_log) * 100

    ###################################################################################################
    # Step 6 : Decision Tree
    ###################################################################################################

    tree_model = DecisionTreeClassifier(random_state = 42)

    tree_model.fit(X_train, Y_train)

    Y_pred_tree = tree_model.predict(X_test)

    tree_accuracy = accuracy_score(Y_test, Y_pred_tree) * 100

    ###################################################################################################
    # Step 7 : KNN
    ###################################################################################################

    knn_model = KNeighborsClassifier(n_neighbors = 5)

    knn_model.fit(X_train, Y_train)

    Y_pred_knn = knn_model.predict(X_test)

    knn_accuracy = accuracy_score(Y_test, Y_pred_knn) * 100

    ###################################################################################################
    # Step 8 : Display Individual Accuracy
    ###################################################################################################

    print("\nAccuracy Of Individual Models")
    print("--------------------------------------")

    print("Logistic Regression :", round(log_accuracy,2))
    print("Decision Tree       :", round(tree_accuracy,2))
    print("KNN                 :", round(knn_accuracy,2))

    ###################################################################################################
    # Step 9 : Hard Voting Classifier
    ###################################################################################################

    hard_voting = VotingClassifier(
                                   estimators =
                                   [
                                       ('lr', log_model),
                                       ('dt', tree_model),
                                       ('knn', knn_model)
                                   ],
                                   voting = 'hard'
                                  )

    hard_voting.fit(X_train, Y_train)

    Y_pred_hard = hard_voting.predict(X_test)

    hard_accuracy = accuracy_score(Y_test, Y_pred_hard) * 100

    ###################################################################################################
    # Step 10 : Hard Voting Accuracy
    ###################################################################################################

    print("\nHard Voting Accuracy :", round(hard_accuracy,2))

    ###################################################################################################
    # Step 11 : Soft Voting Classifier
    ###################################################################################################

    soft_voting = VotingClassifier(
                                   estimators =
                                   [
                                       ('lr', log_model),
                                       ('dt', tree_model),
                                       ('knn', knn_model)
                                   ],
                                   voting = 'soft'
                                  )

    soft_voting.fit(X_train, Y_train)

    Y_pred_soft = soft_voting.predict(X_test)

    soft_accuracy = accuracy_score(Y_test, Y_pred_soft) * 100

    ###################################################################################################
    # Step 12 : Soft Voting Accuracy
    ###################################################################################################

    print("Soft Voting Accuracy :", round(soft_accuracy,2))

    ###################################################################################################
    # Step 13 : Comparison
    ###################################################################################################

    print("\n--------------------------------------")
    print("Model Comparison")
    print("--------------------------------------")

    print("Logistic Regression :", round(log_accuracy,2))
    print("Decision Tree       :", round(tree_accuracy,2))
    print("KNN                 :", round(knn_accuracy,2))
    print("Hard Voting         :", round(hard_accuracy,2))
    print("Soft Voting         :", round(soft_accuracy,2))

###################################################################################################

if __name__ == "__main__":
    main()

###################################################################################################