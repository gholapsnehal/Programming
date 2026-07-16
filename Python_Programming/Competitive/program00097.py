############################################################################################################
#
# Class name:          BookStore
# Instance Variable:   Name, Author
# Class Variable:      NoOfBooks
# Methods:             __init__(), Dsiplay(),
# Description:         Maintains book details and counts the number of books created
# Date:                16/07/2026
# Author:              Snehal Gholap
# 
############################################################################################################

class BookStore:

    NoOfBooks = 0

    def __init__(self, Name, Author):
        self.Name = Name
        self.Author = Author

        BookStore.NoOfBooks = BookStore.NoOfBooks + 1

    def Display(self):
        print(f"{self.Name} by {self.Author}. No of books : {BookStore.NoOfBooks}")


bobj1 = BookStore("Linux System Programming", "Robert Love")
bobj1.Display()

bobj2 = BookStore("C Programming", "Dennis Ritchie")
bobj2.Display()

