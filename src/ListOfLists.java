import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfLists {

    public static void main(String[] args) {

        List <String> row= Arrays.asList("John","Doe","1986-04-03","123 Main","Faitfax","Va" );


        List<List <String>> listOfLists= new ArrayList<>();
        listOfLists.add(row);
        listOfLists.add(row);
        listOfLists.add(row);
        listOfLists.add(row);
        System.out.println(listOfLists);

        for (List<String>eachrow:listOfLists) {
            System.out.println(eachrow);

        }
    }
}
