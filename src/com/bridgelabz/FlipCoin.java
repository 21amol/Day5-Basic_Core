package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        // Welcome to flip coin program.

        int i;                   // flip count
        double tails = 0;
        double heads = 0;
        double tailPercentage;
        double headPercentage;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times coin to be flipped x= ");
        int x = sc.nextInt();

        for (i = 0; i < x; i++) {
            double flipCheck = Math.floor(Math.random() * 10) % 2;
            System.out.println(flipCheck);

            if (flipCheck < 0.5) {
                System.out.println("It is tails.");
                tails = tails + 1;
            } else {
                System.out.println("It is heads.");
                heads = heads + 1;
            }
        }
        tailPercentage = (tails/x) * 100;
        headPercentage = (heads/x) * 100;

        System.out.println("Percentage of tails is " +tailPercentage);
        System.out.println("Percentage of heads is " +headPercentage);
    }
}
