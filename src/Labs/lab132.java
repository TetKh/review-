package Labs;

import java.util.ArrayList;

public class lab132 {


    //class Main{
        public static void main(String[] args){
            ArrayList<Boolean> list = new ArrayList<>();
            list.add(true);
            list.add(false);
            list.add(true);

            duplicate(list);

            System.out.println(list); // [true,false,true,true,false,true]

        }


        public static void duplicate(ArrayList<Boolean> bools) {

           int size = bools.size();
            for (int i = 0; i < size; i++) {
                bools.add(bools.get(i));
                
            }
        }

    }
//}
//Create a method that takes an ArrayList of Booleans and modifies it by repeating its values.

        //Examples: [true, false, false] -> [true, false, false, true, false, false] ->
// [false, true, false, true, false, true, false, true] -> [false, true, false, true]
