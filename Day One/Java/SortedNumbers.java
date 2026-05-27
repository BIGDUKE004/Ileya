// [9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6
import java.util.Arrays;
public class SortedNumbers{

        public static int [] flatten(int [] [] arr){
        
        int [] array = new int[6];
        int index = 0;
        int temp = 0;
        for(int count = 0; count < arr.length; count++){
            for(int counter = 0; counter < arr[count].length; counter++){
                    array[index] = arr[count][counter];
                    index++;
            }
        }

for(int count = 0; count < array.length; count++){
            for(int counter = count+1; counter < array.length; counter++){
                    if(array[count] > array[counter]){
                    temp = array[count];
                    array[count] = array[counter];
                    array[counter] = temp;
                }

            }
        }
return array;
    }
}
