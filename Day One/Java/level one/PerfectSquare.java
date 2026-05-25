public class PerfectSquare{

        public static int [] perfectSquare(int [] array){
        int count = 0;
            for(int find = 0; find < array.length; find++){ 
                    if(Math.sqrt(array[find]) * Math.sqrt(array[find]) == array[find]){
                            count++;
            }
        }

int [] newarray = new int[count];
int index = 0;
        for(int value = 0; value < array.length; value++){ 
              if(Math.sqrt(array[value]) * Math.sqrt(array[value]) == array[value]){
                        newarray[index] = array[value];    
                            index++;        
            }
        }
return newarray;
    }    
}
