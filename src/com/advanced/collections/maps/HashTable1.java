package com.advanced.collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(106,"Anu");
        ht.put(117,"Naveen");
        ht.put(128,"Meghana");
        ht.put(102,"Punith");
        ht.put(100,"Sinchana");
        ht.put(99,"Kavana");
        ht.put(98,"Gowda");
        System.out.println(ht.getOrDefault(99, "Not found"));
        System.out.println(ht.getOrDefault(101, "Not found"));
        ht.putIfAbsent(90, "Ananya");
        System.out.println("Updated Table: " + ht);
        ht.putIfAbsent(102, "saurav"); // It won't update
        System.out.println("Updated Table: " + ht);
    }
}
