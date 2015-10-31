package com.company;


 /** Created by ADI on 10/25/2015.
 */
public class Tema1c {
     public static void main(String[] args) {
         int a = 57980;
         int max = 0;
         int min = 9;
         while (a != 0) {
                     if (a % 10 > max) {
                         max = a % 10;
                     }
                     if (a % 10 < min) {
                         min = a % 10;
                     }
                     a = a / 10;
             }
             System.out.println("Cifra maxima este " + max);
             System.out.println("Cifra minima este " + min);
         }
     }
