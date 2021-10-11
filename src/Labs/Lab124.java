package Labs;

import java.util.ArrayList;

public class Lab124 {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hola");
        list.add("hallo");
        list.add("que paso");
        list.add("como");

        test(list);

        System.out.println(list); //[duo, hola, hallo, que paso, tech]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("como");

        test(list2);

        System.out.println(list2); //[duo,tech]


    }



    public static void test(ArrayList<String> words){


        words.set(0,"duo");
        words.set(words.size()-1, "tech");

        // implement here
    }
}

   // Implement the method that takes an ArrayList of Strings,
// and sets the first and the last element to be "duo" and "tech" respectively.
// Assume the passed ArrayList will have at least 2 elements.
