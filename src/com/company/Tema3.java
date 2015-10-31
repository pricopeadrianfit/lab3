package com.company;

import java.util.Scanner;

/**
 * Created by ADI on 10/25/2015.
 */
public class Tema3 {
    public static void main(String[] args) {
        System.out.print("Introduceti numarul: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int n = num;
        int reversenum = 0,rmd;

        while (num > 0) {
            rmd = num % 10;
            reversenum = reversenum * 10 + rmd;
            num = num / 10;
        }
        if( reversenum == n )
            System.out.println("Numarul este un palindrom: ");
            else
                System.out.println("Numarul nu este un palindrom: ");

        }
    }


