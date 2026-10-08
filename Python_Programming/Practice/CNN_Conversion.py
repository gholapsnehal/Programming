from PIL import Image

img = Image.open("digit.png")
print("size of file : ",img.size)

img = img.convert("L")  # L - convert into grayscale
img = img.resize((28,28))

img.save("digit_28x28.png")

print("size of file : ",img.size)

