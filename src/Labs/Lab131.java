package Labs;

import java.util.ArrayList;

public class Lab131 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(0);
        list.add(1);
        list.add(7);

        multiplyByTwo(list);

        System.out.println(list); // [8,4,10,20,0,2,14]

    }


    public static void multiplyByTwo(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);

        }
    }
}

   // Implement the method that takes in an ArrayList of Integers
// and multiplies every value of the ArrayList by two.
