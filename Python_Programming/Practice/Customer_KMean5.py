import pandas as pd
import matplotlib.pyplot as plt

from sklearn.preprocessing import StandardScaler
from sklearn.cluster import KMeans


###################################################################################################

def main():

    # Step 1 :  Load the data

    df = pd.read_csv("Mall_Customers.csv")

    print("dataset loaded with values")

    print(df.head())

    print("Missing values : ")
    print(df.isnull().sum())

    # Step 2 :  Feature selection

    X = df[["AnnualIncome","SpendingScore"]]

    print("Selected Feature : ")
    print(X.head())

    # Step 3 : Scale data

    scalar = StandardScaler()

    X_scaled = scalar.fit_transform(X)

    print("Scaled data : ")
    print(X_scaled[:5])

    # Step 4 : Elbow Method

    WCSS = []

    for k in range(1,11):
        model = KMeans(
            n_clusters=k,
            random_state=42,
            n_init=10
        )

        model.fit(X_scaled)

        WCSS.append(model.inertia_)

    print("Values of WCSS : ")

    for i in range(len(WCSS)):

        print(f"{i + 1} : {WCSS[i]}")


    # Step 5 :  Visualize

    plt.plot(range(1,11),WCSS,marker="o")

    plt.xlabel("Number of clusters : k")
    plt.ylabel("WCSS")

    plt.title("Elbow Analysis")

    plt.grid()
    plt.show()


###################################################################################################

if __name__ == "__main__":
    main()


###################################################################################################