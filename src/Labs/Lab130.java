package Labs;

import java.util.ArrayList;

public class Lab130 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-6);
        list.add(3);
        list.add(-8);
        list.add(-1);
        list.add(4);
        list.add(3);

        System.out.println(sumAppend(list)); // [4,3,4,3,14]


    }

    public static ArrayList<Integer> sumAppend(ArrayList<Integer> nums){

       ArrayList<Integer> newList = new ArrayList<>();
        int sum = 0;
        for(int num : nums) {
            if(num > 0) {
                newList.add(num);
                sum += num;
            }
        }
        newList.add(sum);
        return newList;


    }


}
//    Implement the method that takes an ArrayList of Integers.
//
//        This method should:
//
//        Create a new ArrayList of Integers. Add only the positive Integers to the new ArrayList. Sum the positive Integers in the new ArrayList and add the Sum as the last element
//
//
//        For example, if the passed ArrayList contains the Integers (4, -6, 3, -8, -1, 4, 3),
//        the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
//        The original ArrayList should remain unchanged.