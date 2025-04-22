package Java8Features;

import java.util.ArrayList;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 9);
        }

       /* Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        //System.out.println(list.toString());

        /*for (int i : list) {
            System.out.println(i);
        }*/

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        System.out.println(list1.toString());
        /*for (String st : list1) {
            System.out.println(st);
        }*/
    }
}
