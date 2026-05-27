// ceasar cephers encryption
// write a message and shift eac letter of the message with a specific amount of shift
// collect input
// count the amount of letters in the word and use the length to create an array to store the digit
// take each letter and turn it into numbers
// now add the specific amount of shift to each number
// convert back to words
//print
import java.util.Arrays;
public class Encryption{

    public static void main(String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.print("enter message: ");
    String word = input.nextLine();

    System.out.print("enter shift: ");
    int shift = input.nextInt();

    int [] user = new int[word.length()];
    char [] conversion = new char[word.length()];

    int firstindex = 0;
    int index = 0;

   for(int count = 0; count < word.length() ; count++){
    int cast = word.charAt(count);
    user[index] = cast;
    index++;
    }


    for(int counter = 0; counter < user.length; counter++){
    user[counter] += shift;
    }


    for(int finalcount = 0; finalcount < user.length; finalcount++){

    char me = (char) (user[finalcount]);

    conversion[firstindex] = me;

    firstindex++;
    
    }


//     int user = (int) userinput;
    System.out.println(Arrays.toString(conversion));    
    
    
    
    
    
    }

}
