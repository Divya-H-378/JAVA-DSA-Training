package com.basics.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Tripillar Solutions";
        System.out.println("Length: " + str.length());
        System.out.println("char at index 2: " + str.charAt(2));
        System.out.println("char at last index: " + str.charAt(str.length() - 1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Uppercase: " + str.toLowerCase());
        System.out.println("Substring(0:9): " + str.substring(0,9));
        System.out.println("Equals (Tripillar Solutions): " + str.equals("Triplillar Solutions"));
        System.out.println("Equals (case does'nt matter): " + str.equalsIgnoreCase("triplillar solutions"));
        String jumbled = "Divya1Is1from1ECE1Sec1B";
                // "Divya, Is, From, ECE, Sec, B";
        String[] words  = jumbled.split("1");
        System.out.println(words[3]);
        String name = "      Kshama G N      ";
        System.out.println(name.trim()); // remove spaces from start and end
        char[] letters = {'C','h','a','i','t','a','n','y','a'};  //this is array not string
        // Chaitanya
        // String word = letters.toString();  // Not correct - it only works for wrapper classes
        String word = new String(letters);
        System.out.println(word);
    }
}
