package javaSE.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListData {

    public static void main(String[] args) {
        // List<Integer> myList = new ArrayList<>();
        List<Integer> myList = new LinkedList<>();
        myList.add(5);
        myList.add(1);
        myList.add(3);
        myList.add(9);
        myList.add(9);
        myList.add(9);
        myList.add(9);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("\n***********");

        for (Integer temp : myList) {
            System.out.print(temp + " ");
        }

        System.out.println("\n***********");

        myList.stream().forEach((temp) -> System.out.print(temp + " "));

        System.out.println("\n***********");

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
