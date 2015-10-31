package com.company;

/**
 * Created by ADI on 10/25/2015.
 */
public class Tema1b {
    public static void main(String[] args) {
        int a = 4533900;
        int count = 0;

            while (a != 0) {
                a = a / 10;
                count++;
            }
            System.out.println("Numarul cifrelor este: " + count);
        }
}
