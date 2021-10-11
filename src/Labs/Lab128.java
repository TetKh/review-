package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab128 {
    public static void main(String[] args){

        List<String> list1 = Arrays.asList("hey", "yo");
        List<String> list2 = Arrays.asList("what", "up");

        System.out.println(combineTwo(list1, list2)); // [hey, yo, what, up]

        List<String> list3 = Arrays.asList("hi", "hello");
        List<String> list4 = Arrays.asList("how", "do", "you", "do");

        System.out.println(combineTwo(list3, list4)); // [hi, hello, how, do, you, do]



    }

    public static List<String> combineTwo(List<String> wordList1, List<String> wordList2){
        // implement
        ArrayList<String> combined = new ArrayList<>();

        combined.addAll(wordList1);
        combined.addAll(wordList2);
        return combined;


    }

}
    //Implement the method that takes two parameters
// - a List of Strings called wordList1, and
// a List of Strings called wordList2
// and returns a new ArrayList of Strings which combines all the elements from the two Lists.
