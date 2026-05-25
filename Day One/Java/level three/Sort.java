public class Sort{

        public static int [] sortingNumbers(int [] array){
        int temp = 0;
        for(int count = 0; count < array.length; count++){
            for(int counter = count+1; counter < array.length; counter++){
                    if(array[count] < array[counter]){
                    temp = array[count];
                    array[count] = array[counter];
                    array[counter] = temp;
                }

            }
        }
return array;
    }

}
