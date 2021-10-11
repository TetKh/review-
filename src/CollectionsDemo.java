import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {



        List<Integer> list= Arrays.asList(2,3,4,10,0,-2,4,45,22);
        Collections.sort(list, Comparator.reverseOrder());//reverse order
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,22));
        System.out.println(Collections.binarySearch(list,1));

        //Collections.reverse(list);
       // System.out.println(list);

        Collections.shuffle(list);//random content
        System.out.println(list);


        System.out.println( Collections.max(list));
        System.out.println( Collections.min(list));

        System.out.println(Collections.frequency(list,4));
    }
}
