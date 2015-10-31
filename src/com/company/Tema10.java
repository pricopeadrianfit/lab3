package com.company;

/**
 * Created by ADI on 10/25/2015.
 */
public class Tema10 {
    public static void main(String[] args) {
        int n = 4;
        long rezultat = 1;
        for (int i = 1; i <= n; i++) {
            rezultat = rezultat * i;
        }
        System.out.print("Factorialul lui ");
        System.out.print( + n );
        System.out.println(" este " + rezultat);
    }
}

