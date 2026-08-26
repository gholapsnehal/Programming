###################################################################################################
#
# Assignment 48 Q.3  : Linear Regression model without using sklearn
#                      Using matplotlib for graph
# Description        : 
# Date               : 20/08/2026
# Author             : Snehal Gholap
#
###################################################################################################

###################################################################################################
#    Tasks :
#    1. Train linear regression model
#    2. Predict salary for 6 years of experience
#    3. Plot regression line using matplotlib
#
#    Graph should display:
#    - Data points
#    - Regression line
###################################################################################################

import matplotlib.pyplot as plt

# Dataset
experience = [1, 2, 3, 4, 5]
salary = [20000, 25000, 30000, 35000, 40000]

# Calculate mean
mean_x = sum(experience) / len(experience)
mean_y = sum(salary) / len(salary)

# Calculate slope
top = 0
bottom = 0

for i in range(len(experience)):
    top += (experience[i] - mean_x) * (salary[i] - mean_y)
    bottom += (experience[i] - mean_x) ** 2

slope = top / bottom

# Calculate intercept
intercept = mean_y - (slope * mean_x)

# Display model
print("Slope =", slope)
print("Intercept =", intercept)
print("Regression Equation: Salary =", slope, "* Experience +", intercept)

# Predict salary for 6 years
years = 6
predicted_salary = slope * years + intercept

print("Predicted Salary for 6 Years Experience: Rs", int(predicted_salary))

# Calculate values for regression line
regression_salary = []

for x in experience:
    y = slope * x + intercept
    regression_salary.append(y)

# Plot data points
plt.scatter(experience, salary, label="Data Points")

# Plot regression line
plt.plot(experience, regression_salary, label="Regression Line")

plt.xlabel("Years of Experience")
plt.ylabel("Salary")
plt.title("Linear Regression: Experience vs Salary")

plt.legend()
plt.grid(True)
plt.show()