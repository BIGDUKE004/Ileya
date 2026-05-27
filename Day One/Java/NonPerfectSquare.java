// expected output : [4, -1, 9, -1, 49 , -1]
import java.util.Arrays;
public class NonPerfectSquare{

        public static int [] nonPerfectSquare(int [] array){

        int [] newarray = new int[array.length];

        for(int find = 0; find < array.length; find++){
            if(Math.sqrt(array[find]) !=  (int)Math.sqrt(array[find])){
                array[find] = -1; 
                newarray[find] = array[find];
         
                } else{
                 newarray[find] = array[find];
            }
        }
return newarray;
    }

}
