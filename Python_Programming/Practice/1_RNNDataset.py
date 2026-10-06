sentences = [
    "movie was good",
    "movie was bad",
    "movie was not good"
]

labels = [1,0,0]

# for each 
for sentance , label in zip(sentences,labels):
    sentiment = "Positive" if label == 1 else "Negative"

    print("Sentance : ",sentance)
    print("Label : ",label)
    print("Meaning : ",sentiment)
    print("------------------------------")