package Labs;

import java.util.ArrayList;

public class Lab127 {
    public static void main(String[] args){

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("hi");
        list1.add("what");
        list1.add("who");
        addYo(list1);
        System.out.println(list1); // [hello, yo, hi, yo, what, yo, who]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("what");
        list2.add("who");
        addYo(list2);
        System.out.println(list2); // [hello, yo, what, yo, who]

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("what");
        addYo(list3);
        System.out.println(list3); // [hello, yo, what]

    }


    public static void addYo(ArrayList<String> words) {

        words.add(1, "yo");
        words.add(3, "yo");
        words.add(5, "yo");



    }

}
//    Given an ArrayList of Strings called words, insert the String "yo" in between each String element. Assume the passed ArrayList will have at least 2 elements.
//
//        Examples: [hello, hi, what, who] -> [hello, yo, hi, yo, what, yo, who]
//
//        [hello, what, who] -> [hello, yo, what, yo, who]
//
//        [hello, what] -> [hello, yo, what]
//[hello, what, who] -> [hello, yo, what, yo, who]

  //      [hello, what] -> [hello, yo, what]
