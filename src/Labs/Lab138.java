package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab138 {
    static class Main {
        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997);
            System.out.println(findLargest(list1));

            List<Integer> list2 = Arrays.asList(987, 1234, 9381, 731, 43718, 8932);
            System.out.println(findLargest(list2));

            List<Integer> list3 = Arrays.asList(34070, 1380, 81238, 7782, 234, 64362, 627);
            System.out.println(findLargest(list3));




        }


        public static Integer findLargest(List<Integer> integerList) {



            return  Collections.max(integerList);
        }
    }
}
   // Given a List of Integers, return the largest value.

      //  findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
//  findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
//  findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
