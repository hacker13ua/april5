package org.esurovskiy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMultiMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void add(K key, V value) {
        if (!map.containsKey(key)) {
            List<V> list = new ArrayList<>();
            map.put(key, list);
        }
        List<V> list = map.get(key);
        list.add(value);
    }

    public List<V> get(K key) {
        List<V> list = map.get(key);
        if(list != null) {
            return new ArrayList<>(list);
        }
        return Collections.emptyList();
    }


    public Integer doSmth(int i){
        System.out.println("do1");
        return 1;
    }

    public String doSmth(long i){
        System.out.println("do1");
        return "1";
    }
}
