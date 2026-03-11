package com.advanced.collections.lists;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("mouse");
        cart.add("keyboard");
        // mouse no longer needed
        cart.remove("mouse"); // it is case sensitive
        System.out.println("Latest cart after removal: " + cart);
        cart.set(1, "Mechanical keyboard");
        System.out.println("Latest cart after update: " + cart);
    }
}
