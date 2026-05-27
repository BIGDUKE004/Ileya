#// write a program that simulate a booking suggestion system
#//here are the following functionalities: suggest books (keep sugessting books at random with random pages and quit when the user decides to stop)e.g: book title: the art of sleeping, page: 47
#//add books from the user
#//remove books
#//update books(change the name or title)
#// show all books
#
#// understanding the first function which is suggesting random books with pages.....it will keep generating this with random numbers which serves as pages(1-100) and stop when the user enters "STOP"
import random

def test_that_suggestion_of_random_book_works(booklist):
    random_book = random.choice(booklist)
    random_page = random.randrange(1, 101)

    return f"{random_book}  page: {random_page}"

book = ["me", "you", "us"]

def user_can_add_book():
    book = []
    user = input("enter name of book")

    book.append = (user)
    
    return book
answer = user_can_add_book()
print(user_can_add_book(book))
print(test_that_suggestion_of_random_book_works(book))
