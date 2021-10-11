package Labs;

import java.util.*;

public class Lab137 {
    static class Main {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();

            list.add("purple");
            list.add("green");
            list.add("blue");
            list.add("yellow");
            list.add("green");

            System.out.println(reverseList(list));
        }


        public static List<String> reverseList(List<String> stringList) {


            List<String> list= new ArrayList<>();
            Collections.reverse(stringList);

            return stringList;
        }
    }
}
    //Given a List of Strings, return a new list in reverse order of the original.

     //   reverseList( ["", "", "", "yellow", ]) -> ["green", "yellow", "blue", "green", "purple" ] reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
