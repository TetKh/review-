package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab140 {
    static class Main {
        public static void main(String[] args) {

           // ArrayList<Integer> fizzBuzzList = new ArrayList<>();



            System.out.println( fizzBuzzList(new Integer[]{1,2,3}));
            System.out.println(fizzBuzzList(new Integer[]{4, 5, 6}));
            System.out.println(fizzBuzzList(new Integer[] {7, 8, 9, 10, 11, 12, 13, 14, 15}));


        }


        public static List<String> fizzBuzzList(Integer[] integerArray) {
            List<String> fizzBuzzList = new ArrayList<>();

            for (Integer checkForFizzBuzz: integerArray){
                if (checkForFizzBuzz % 3 == 0 && checkForFizzBuzz % 5 == 0){
                    fizzBuzzList.add("FizzBuzz");
                } else if (checkForFizzBuzz % 3 == 0){
                    fizzBuzzList.add("Fizz");
                } else if (checkForFizzBuzz % 5 == 0){
                    fizzBuzzList.add("Buzz");
                } else {
                    fizzBuzzList.add(checkForFizzBuzz.toString());
                }
            }

            return fizzBuzzList;


        }
    }
}
    //Given an array of Integers, return a List that contains the same numbers as Strings.
// Except any multiple of 3 should be replaced by the String "Fizz",
// any multiple of 5 should be replaced by the String "Buzz",
// and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz".

    //fizzBuzzList( {1, 2, 3} ) -> [1, 2, "Fizz"]
// fizzBuzzList( {4, 5, 6} ) -> [4, "Buzz", 6]
// fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} ) -> [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14,
// "FizzBuzz"]


