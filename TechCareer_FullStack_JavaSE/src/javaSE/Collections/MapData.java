package javaSE.Collections;

import java.util.*;

public class MapData {

    public static void main(String[] args) {
        Map<String, String> mapList = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            mapList.put(UUID.randomUUID().toString(), i + " ");
        }

        for (String key : mapList.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("\n***************");

        for (String value : mapList.values()) {
            System.out.print(value + " ");
        }
        System.out.println("\n***************");

        for (String key : mapList.keySet()) {
            System.out.println(key + " " + mapList.get(key));
        }

        System.out.println("\n");
        mapList.entrySet().forEach(entry -> System.out.println(entry));
    }
}
