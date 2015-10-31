package com.company;

/**
 * Created by ADI on 10/25/2015.
 */
public class Tema1d {
    public static void main(String[] args) {
        int a = 234435;
        int nrControl = 0;

        if (a <= 0)
            System.out.println("Numarul introdus este negativ");
        else {
            int sum = 0;

            while (a != 0) {
                sum += a % 10;
                a /= 10;
            }
                while (sum != 0) {
                nrControl += sum % 10;
                sum /= 10;
            }
            System.out.println("Cifra de control este: " + nrControl);
        }
    }
}

