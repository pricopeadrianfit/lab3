package com.company;

/**
 * Created by ADI on 10/25/2015.
 */
public class Tema2 {
    public static void main(String[] args) {
        int a = 22355634;
        int reversenum = 0;
        while (a != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + a%10;
             a = a/10;
        }
        System.out.println("Inversul numarului este: " + reversenum);
    }

}
