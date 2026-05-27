// [9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6
import java.util.Arrays;
public class Flatten{

        public static int [] flatten(int [] [] arr){
        
        int [] array = new int[12];
        int index = 0;

        for(int count = 0; count < arr.length; count++){
            for(int counter = 0; counter < arr[count].length; counter++){
                    array[index] = arr[count][counter];
                    index++;
            }
    
        }
return array;
    }

}

