package com.advanced.collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class LIveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        liveOrders.add("ORD104");
        // check order
        System.out.println("ORD102 Available? exists? " + liveOrders.contains("ORD102"));
        System.out.println("liveOrders: " + liveOrders);
        liveOrders.remove("ORD102");
        System.out.println("ORD102 Available? exists? " + liveOrders.contains("ORD102"));
        System.out.println("liveOrders: " + liveOrders);
        System.out.println("Total live orders: " + liveOrders.size());
        liveOrders.clear();
        System.out.println("current orders: " + liveOrders);
    }
}
