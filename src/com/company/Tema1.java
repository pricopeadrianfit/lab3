package com.company;

/**
 * Created by ADI on 10/25/2015.
 */
public class Tema1 {
    public static void main(String[] args) {
        int a = 46790;
        if (a <= 0)
            System.out.println("Numarul introdus este negativ");
        else {
            int sum = 0;
            int prod = 1;
            // suma cifrelor
            // base:  sum = 0, a = 46790
            ///se aduna ultima cifra cu 0 si se taie ultima cifra din a
            // step1: a % 10 = 0, a / 10 = 4679
            //        sum = 0, n = 4679
            // se aduna ultima cifra cu ultima suma si se taie ultima cifra din a
            // step2: a % 10 = 9, a / 10 = 467
            //        sum = 9, n = 467
            // se repeta pana cand nu mai sunt cifre in a
            // stop:  (n != 0) is false
            //same for product but the initial prod is 1
            while (a != 0) {
                // add  last digit to the sum
                sum += a % 10;
                a /= 10;
                // multiply last digit to the prod
                prod *= a % 10;
                // cut last digit
                a /= 10;
            }
            System.out.println("Suma cifrelor " + sum);
            System.out.println("Produsul cifrelor " + prod);
        }
        }
    }

