package com.basics.arrays;

public class E2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1] = 400;
        System.out.println(arr[1]);
        // We can do this in constant time because of index
        ///  So - the time completely(TC) is Big 0(1)  // TC is very important
        // Accessing and updating elements in array -> TC 0(1)
        // This is because of index based access or
        // direct index mapping
        // [idx = pos - 1]; [pos = idx + 1]
        // array.length is not a method(function)
        // It is a property of arrays
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // for each loop - enhanced for loop
        for (int x : arr){
            System.out.print(x + " ");
            for (Object o : arr){
                System.out.print(o + " ");
            }
            System.out.println();
            String name = "SNPSU";
            // String.length() is a method of the string class
            System.out.println(name.length());
        }
    }
}
