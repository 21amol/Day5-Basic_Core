package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {

        // Welcome to Harmonic Numbers Program.

        double i;
        double value = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Harmonic value N: ");
        int N = sc.nextInt();

        for (i=2; i<=N; i++) {
            value = (value + (1/i));
           System.out.println(value);                // The value step by step.
        }
        System.out.println("The value of Nth Harmonic number is: " +value);   // Final Value.
    }
}
