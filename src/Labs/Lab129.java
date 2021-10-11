package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab129 {
    public static void main(String[] args){

        List<String> list  =  new ArrayList<>(Arrays.asList(new String[]{"java", "python", "java", "scala", "ruby", "clojure", "java"}));
        removeAll(list, "java");
        System.out.println(list); //[python, scala, ruby, clojure]


        List<String> list2  =  new ArrayList<>(Arrays.asList(new String[]{"java", "java", "java", "java", "java"}));
        removeAll(list2, "java");
        System.out.println(list2);  // []

    }

    public static void removeAll(List<String> list, String targetWord){
        //implement here
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(targetWord)) {
                list.remove(list.get(i));
                i--;
            }
        }
       // System.out.println(list);
    }

}
   // Create a static method that takes two parameters:
// an ArrayList of Strings called list,
// and a String called targetWord and
// removes every instance of targetWord from the ArrayList.
//Examples:
      //  [java, python, java, scala, ruby, clojure, java] , "java"  -> [python, scala, ruby, clojure]
      //  [java, java, java, java, clojure, java] , "java"  -> [clojure]
     //   [scala, ruby, clojure, java] , "scala"  -> [ruby, clojure, java]
     //   [java, java, java, java, java] , "java"  -> []
