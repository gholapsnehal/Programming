# encoding on label dependent variable

from sklearn.datasets import load_iris

def main():

    print("-"*80)

    print("Iris Classification Case Study")

    print("-"*80)

    dataset = load_iris()

    for i in range(len(dataset.target)):
        print("ID %d, Features %s, Label %s" %(i,dataset.data[i],dataset.target[i]))



if __name__ == "__main__":
    main()