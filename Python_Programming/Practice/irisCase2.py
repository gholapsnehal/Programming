from sklearn.datasets import load_iris

def main():

    print("-"*80)

    print("Iris Classification Case Study")

    print("-"*80)

    dataset = load_iris()

    # Meta data of dataset

    print("Independent variables are : ")
    print(dataset.feature_names)

    print("Dependent variables are : ")
    print(dataset.target_names)



if __name__ == "__main__":
    main()