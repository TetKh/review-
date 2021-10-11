import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionframeworkDemo {
    public static void main(String[] args) {











        List list = new ArrayList();
        list.add("jhb");
        list.add(45);
        list.add(" ");
        list.add("hgf");
        list.add(34);

//        for (int i = 0; i < 3; i++) {
//            System.out.println(((String)(list.get(i))).toUpperCase());
//
//        }
//        System.out.println(list);
//

        List<Object>list2=new ArrayList<>();
        list2.add("gvu");
        list2.add(45);
        System.out.println(list2);


        List<Integer>list3=new ArrayList<>();
        list3.add(45);
        list3.add(90000);
        list3.add(new Integer(678));
        System.out.println(list3);


        List<Double>list4= new ArrayList<>(10);
        System.out.println(list4.size());

        List<Integer>list5=new ArrayList<>(list3);
        System.out.println(list5);

        List<Integer>list6= Arrays.asList(34,45,677,2,4,5,6,7,8,2,2,34);
        System.out.println(list6);

        List<Integer>list7=new ArrayList<>(10);
        list7.add(45);
        list7.add(90000);
        list7.add(new Integer(678));
        list7.add(1,989);
        System.out.println(list7);

        List<String>list8= new ArrayList<>();
        list8.add("0");
        list8.add("1");
        list8.add("2");
        list8.add("3");
        list8.remove("2");
        list8.remove(0);
        System.out.println(list8);

        List<Integer>list9=new ArrayList<>();
        list9.add(56);
        list9.add(121);
        list9.add(1);
        list9.add(5);
        System.out.println(list9);
        list9.remove(1);//121 gone
        list9.remove(new Integer(1));//1 gone
        System.out.println(list9);
        list9.set(1,555);
       // list9.set(2,555); out of bound
        System.out.println(list9);

        System.out.println(list9.isEmpty());//False



        System.out.println(list9.contains(56));//True
        System.out.println(list9.contains(96));//false

        List<Integer>list10= Arrays.asList(34,45,677,2,4,5,6,7,8,2,2,34);
        System.out.println(list10);

        for (int i = 0; i <list10.size() ; i++) {
            list10.set(i,list10.get(i)*2);


        }
        System.out.println(list10);
        System.out.println(list10.indexOf(68));




    }
}
