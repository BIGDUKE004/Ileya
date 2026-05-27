public class Duplicate{
    public static int [] removingDuplicate(int [] array){

        int [] dup = new int[array.length];

        int size = 0;


        for(int count = 0; count < array.length; count++){
            boolean found = true;

        for(int counter = 0; counter < size; counter++){
            if(array[count] == dup[counter]){
                dup[size] = array[count];
                    //break;
        }

    }
//
//            if(!found){
//                dup[size] = array[count];
//                size++;
//    }
}


return dup;
}
}
