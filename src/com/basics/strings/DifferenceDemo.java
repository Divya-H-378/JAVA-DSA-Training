package com.basics.strings;

public class DifferenceDemo {
    public static void main(String[] args) {
        String s = "Java";
        // Hashcode -> unique id or number given by JVM or java virtual machine
        System.out.println("String before; " + s.hashCode());
        s = s + " DSA";
        System.out.println("String after: " + s.hashCode());
        // This proves that strings are IMMUTABLE
 //       for (int i=0; i<1000; i++){
 //           s = s + "DSA";
 //       }  This is bad because it will create 1000 new objects
        // To do this we have 2 special MUTABLE Strings
        // ✅ StringBUffer & StringBuilder  ->  java.lang
        StringBuilder builder = new StringBuilder("Java");
        System.out.println("Builder before: " + builder.hashCode());
        builder.append(" DSA");
        System.out.println("Builder after: " + builder.hashCode());
    }
}
