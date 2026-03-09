package com.basics.strings;

public class StringConstantPool {
    public static void main(String[] args) {
        // They have the same literal value "Java"
        // so they point to the same object in heap
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);
        String s3 = new String("Java");
        System.out.println(s1 == s3); // They are different object
        System.out.println(s1.equals(s3)); // checking values
    }
}
