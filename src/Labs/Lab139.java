package Labs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab139 {
    static class Main {
        public static void main(String[] args) {
//            List<Integer> list= Arrays.asList(5, 7, 9, 5, 11);
//            System.out.println(foundIntTwice(list,5));
//
//            List<Integer> list2= Arrays.asList(6, 8, 10, 11, 13);
//            System.out.println(foundIntTwice(list2,0));
//
//            List<Integer> list3= Arrays.asList(9, 23, 44, 2, 88, 44);
//            System.out.println(foundIntTwice(list3,44));
         //   foundIntTwice()


        }

        public  boolean foundIntTwice(List<Integer> integerList, int intToFind) {

            int count = 0;

            for (Integer findTwice: integerList ){
                if (intToFind == findTwice){
                    count += 1;


                }
            }
            if (count == 2){
                return true;
            }

            return false;
        }


    }
}
   // Given a List of Integers, and an int value,
// return true if the int value appears two or more times in the list.

      //  foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
//  foundIntTwice( [6, 8, 10, 11, 13], 8 )-> false
//  foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true