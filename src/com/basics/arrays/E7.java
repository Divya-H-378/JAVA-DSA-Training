package com.basics.arrays;
// Varargs (Variable arguments) -> ... for an array {It internally uses arrays} 🟨🟨💲Intel, Sasken company question
public class E7 {
    public static void display(int... arr){
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {0,4,5,6,8,7};
        display(array);
    }

}
