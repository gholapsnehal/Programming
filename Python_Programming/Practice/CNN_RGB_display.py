from PIL import Image
import numpy as np

img = Image.open("color.png")

img = img.resize((28,28))

pixels = np.array(img)

print("Image information      : ")
print("Image shape            : ",pixels.shape)

print("Height       : ",pixels.shape[0]," Rows")
print("Width        : ",pixels.shape[1]," Columns")
print("Channels     : ",pixels.shape[2],"(R,G,B)")

total = pixels.shape[0] * pixels.shape[1]

print("Total Pixels : ",total)

print("Single pixel meaning : ")