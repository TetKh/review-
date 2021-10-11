package Labs;

import java.util.Arrays;
import java.util.List;

public class Lab136 {
    static class Main {
        public static void main(String[] args) {

            List<String> list1 = Arrays.asList("Apple", "Orange", "Banana");
            System.out.println(list2Array(list1));

            List<String> list2 = Arrays.asList("Red", "Orange", "Yellow");
            System.out.println(list2Array(list2));

            List<String> list3 = Arrays.asList("Left", "Right", "Forward", "Back");
            System.out.println(list2Array(list3));




        }

        public static List<String> list2Array(List<String> stringList) {



            for (int i = 0; i < stringList.size() ; i++) {

                stringList.get(i);
            }

            return stringList;
        }
        }
    }

   // Given a list of Strings, return an array containing the same Strings in the same order

     //   list2Array( ["Apple", "Orange", "Banana"] ) -> {"Apple", "Orange", "Banana"} list2Array( ["Red", "Orange", "Yellow"] ) -> {"Red", "Orange", "Yellow"} list2Array( ["Left", "Right", "Forward", "Back"] ) -> {"Left", "Right", "Forward", "Back"}
