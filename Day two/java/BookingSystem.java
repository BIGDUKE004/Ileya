// write a program that simulate a booking suggestion system
//here are the following functionalities: suggest books (keep sugessting books at random with random pages and quit when the user decides to stop)e.g: book title: the art of sleeping, page: 47
//add books from the user
//remove books
//update books(change the name or title)
// show all books

// understanding the first function which is suggesting random books with pages.....it will keep generating this with random numbers which serves as pages(1-100) and stop when the user enters "STOP"
import java.util.Random;
import java.util.Arrays;
public class BookingSystem{ 

        public static String bookSuggestion(String[] books){

        java.util.Scanner input = new java.util.Scanner(System.in);

        Random random = new Random();

        String response = "";

        while(true){
        int suggest = random.nextInt(books.length);
        int pages = random.nextInt(1, 101);

        System.out.println( books[suggest]);
        System.out.println("page " + pages);
        System.out.print("would you like another suggestion: ");
        response = input.nextLine();

        if(response.equalsIgnoreCase("Stop")){
        break;
        }

        }

        return response;

        }

        public static String [] addBooksFromUser(String[] books){

        java.util.Scanner input = new java.util.Scanner(System.in);

        for(int count = 0; count < books.length; count++){
        System.out.println("enter name of book and author: ");
        books[count] = input.nextLine();
        }
        return books;

        }

        public static String [] userCanRemoveBooks(String[] books){
 
       java.util.Scanner input = new java.util.Scanner(System.in);
       int usernum = 0;
       System.out.print("indicate the number in which the book you wanna delete is:  ");      
       usernum = input.nextInt();

        for(int count = 0; count < books.length; count++){
        if(count == usernum){
                books[count] = null;
                }
            }
        
        return books;
        }
    
        public static String [] userCanUpdateBook(String[] books){
            
       java.util.Scanner input = new java.util.Scanner(System.in);
       String usernum = "";
        String userbookname = "";

       System.out.print("indicate the name of the book you wanna edit:  ");      
       usernum = input.nextLine();

        System.out.print("enter new name for the book: ");
        userbookname = input.nextLine();

        for(int count = 0; count < books.length; count++){
        if(books[count].equals(usernum)){
                books[count] = userbookname;
                }
            }
        
        return books;
        }

        public static String [] showAllBooks(String[] books){

        return books;
    
        }

}
