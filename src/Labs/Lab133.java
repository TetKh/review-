package Labs;

import java.util.ArrayList;

//public class Lab133 {


    class Main{

        public static void main(String[] args){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            list.add(6);

            System.out.println(makeTwo(list)); // [4,4,5,5,6,6]

        }


        public static ArrayList<Integer> makeTwo(ArrayList<Integer> nums){

           ArrayList<Integer> nums2 = new ArrayList<>();
            for (int i = 0; i < nums.size(); i++) {
                nums2.add(nums.get(i));
                nums2.add(nums.get(i));
                
            }
            return nums2;
           
           
        }

    }
        //Implement the method that takes an ArrayList of Integers and creates a new ArrayList of Integers 
// that contains every value of the the passed ArrayList repeated twice and returns it.

       // Examples: [1,5,3,7] -> [1,1,5,5,3,3,7,7] -> [2,2,4,4,6,6]
