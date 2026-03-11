package com.advanced.collections.queues;
import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        // For adding elements [add][strict] [offer][lenient]
        orders.add("Order102");
        orders.offer("Order103");
        orders.offer("Order104");
        System.out.println("Orders: " + orders);
        // For removing elements [remove] [poll][lenient]
        orders.remove();
        System.out.println("Orders: " + orders);
        orders.poll();
        System.out.println("Orders: " + orders);
    }
}
