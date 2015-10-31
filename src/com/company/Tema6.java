package com.company;

/**
 * Created by ADI on 10/30/2015.
 */
public class Tema6 {
        public static void main(String[] args) {
            int n = 20;
            long rezultat = n * (n + 1) / 2;
            /*sau
            for (int i = 1; i <= n; i++) {
                rezultat = rezultat + i;
            }*/
            System.out.print("Suma primelor numere naturale pentru numarul dat este ");
            System.out.println( + rezultat);
        }
}
