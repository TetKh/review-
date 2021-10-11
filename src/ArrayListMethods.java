import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        String[]arr= { "dfg","sedgf","sfgs"};


        List<String> strings= Arrays.asList(arr);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("hgfv");
        System.out.println(list);

        List<String>list2= new ArrayList<>();
        list2.add("hgvck");
        list2.add("sfve");

        String [] arr1= new String[list2.size()];
        String []strings1 =list2.toArray(arr1);
    }
}
