// collect input which is an array and indication of index
// it is similar to slicing in python
// from the first index to the indicated index you take them to the back
// have a new array
// start adding from where the indicated index is down then add from the beginning
// [2, 3, 4, 5, 6] - [3, 4, 5, 6, 2]

// add from the next number after the index....now how do add the numbers in the front? this where the second loop comes in, it will iterate from the first index up to the indicated index and stops there;
import java.util.Arrays;
public class Rotate{

    public static int [] rotate(int [] array){

    java.util.Scanner input = new java.util.Scanner(System.in);

    int [] newarray = new int [array.length];

   int counter = 0;

    System.out.print("enter index");
    int number = input.nextInt();

    for(int count = number  + 1; count < array.length; count++){
            newarray[counter] = array[count];
            counter++;
    }

     for(int value = 0; value <= number; value++){
            newarray[counter] = array[value];
            counter++;
    }
    
    return newarray;
    }

}
