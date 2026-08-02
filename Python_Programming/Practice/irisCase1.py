from sklearn.datasets import load_iris

def main():

    print("-"*80)

    print("Iris Classification Case Study")

    print("-"*80)

    dataset = load_iris()

    print(dataset)



if __name__ == "__main__":
    main()