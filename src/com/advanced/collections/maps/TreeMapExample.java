package com.advanced.collections.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "A");
        map.put(4,"B");
        map.put(5,"C");
        map.put(6,"D");
        System.out.println(map);
    }
}
