package javaSE.Collections;

import java.util.*;

public class SetData {

    public static void main(String[] args) {
        Set<Integer> mySet = new LinkedHashSet<>();
        mySet.add(5);
        mySet.add(1);
        mySet.add(3);
        mySet.add(9);
        mySet.add(9);
        mySet.add(9);
        mySet.add(9);
        mySet.stream().forEach((temp) -> System.out.print(temp + " "));
    }
}
