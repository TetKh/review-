package Labs;

import java.util.ArrayList;

public class Lab134 {


    static class Main{
        public static void main(String[] args){

            ArrayList<String> list = new ArrayList<>();
            list.add("hello");
            list.add("hi");
            list.add("que");
            list.add("paso");
            list.add("sup");

            everyOther(list);

            System.out.println(list); //[hi, paso]
        }


        public static void everyOther(ArrayList<String> nums){

            for (int i = 0; i < nums.size(); i++) {

                nums.remove(nums.get(i));
            }


           // nums.remove(1);
          //  nums.remove(2);

        }

    }
}

   // Implement the method that takes in an ArrayList of Strings
// and modifies it by removing every other element in the list,
// starting with removing the 0th element.

     //   Examples: ["hi","yo","sup","yolo","boop"] -> ["yo","yolo"] -> ["yo"]
