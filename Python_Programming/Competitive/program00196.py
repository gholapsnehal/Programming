###################################################################################################
#
# Assignment 49 Q.9  : Generate Classification Report
#                      Using scikit-learn
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Store actual and predicted values
#    2. Generate classification report
#    3. Display precision, recall, F1-score and support
###################################################################################################

from sklearn.metrics import classification_report

actual = [1, 1, 1, 1, 0, 0, 0, 0]
predicted = [1, 1, 0, 1, 0, 1, 0, 0]

report = classification_report(actual, predicted)

print(report)