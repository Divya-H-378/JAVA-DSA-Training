package com.basics.Patterns;

public class RightAngledTriangle {
    static void rightsTriangle(int n){
        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print(". ");
            }
            System.out.println();
        }
    }
    static void rightsTriangleNumbers(int n){
        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rightsTriangle(5);
        rightsTriangleNumbers(5);
    }
}
