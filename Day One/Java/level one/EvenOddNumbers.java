import java.util.Arrays;
public class EvenOddNumbers{

    public static void main(String[] args){

        int [] array = {45, 60, 3, 10, 9, 22};
        int [] [] result = new int[2] [3];
        int evennum = 0;
        int oddnum = 0;
            for(int count = 0; count < array.length; count++){
                    if(array[count] % 2 != 0){
                        result[0][evennum] = array[count];
                        evennum++;
                            
                }

                    if(array[count] % 2 == 0){
                      result[1][oddnum] = array[count];
                        oddnum++;
                }
  
          } 
                
System.out.print(Arrays.deepToString(result));
            }

        }
    

















