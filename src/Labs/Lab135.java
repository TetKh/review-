package Labs;

import java.util.ArrayList;
import java.util.List;

public class Lab135 {
    static class Main {
        public static void main(String[] args) {

            String[]arr= { "Apple", "Orange", "Banana"};
            System.out.println( array2List(arr));
            System.out.println(array2List(new String[]{"Red", "Orange", "Yellow"}));
            System.out.println(array2List(new String[] {"Left", "Right", "Forward", "Back"}));





        }


        public static List<String> array2List(String[] stringArray) {

            List<String> array2List = new ArrayList<String>();

            for (String fruit: stringArray){
                array2List.add(fruit);
            }


            return array2List;

        }
    }
}

    //Given an array of Strings, return an ArrayList containing the same Strings in the same order.

    // array2List( {"Apple", "Orange", "Banana"} ) -> ["Apple", "Orange", "Banana"]
//    array2List( {"Red", "Orange", "Yellow"} ) -> ["Red", "Orange", "Yellow"]
//    array2List( {"Left", "Right", "Forward", "Back"} ) -> ["Left", "Right", "Forward", "Back"]
