#// write a program that simulate a booking suggestion system
#//here are the following functionalities: suggest books (keep sugessting books at random with random pages and quit when the user decides to stop)e.g: book title: the art of sleeping, page: 47
#//add books from the user
#//remove books
#//update books(change the name or title)
#// show all books
#
#// understanding the first function which is suggesting random books with pages.....it will keep generating this with random numbers which serves as pages(1-100) and stop when the user enters "STOP"
import random
def test_that_suggestion_of_random_book_works(booklist, page):
        result = random.choice(my_list) + random.randrange(1, 101)
#        page = random.randrange(1, 7)
        return result

my_list = ["me", "you", "us"] 

def test_that_suggestion_of_random_book_pages(booklist):
#        for page in range(1, 101):
        page = random.randrange(1, 7)
        return page
#my_li = pages
print(test_that_suggestion_of_random_book_works(my_list, range))
#print(test_that_suggestion_of_random_book_pages(randrange))

