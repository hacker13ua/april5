package org.esurovskiy;

import java.util.List;

public class MainMultiMap {
    public static void main(String[] args) {
        ListMultiMap<Integer, String> multiMap = new ListMultiMap<>();
        multiMap.add(1, "one");
        multiMap.add(1, "один");
        multiMap.add(2, "два");
        List<String> list = multiMap.get(2);
        System.out.println(list);
        list.add("two");
        System.out.println(list);
        List<String> list2 = multiMap.get(2);
        System.out.println(list2);
        System.out.println((multiMap.get(2) == multiMap.get(2)));
    }
}
