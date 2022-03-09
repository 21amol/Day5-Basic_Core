package com.bridgelabz;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        // Welcome to Power of 2 program.

        int i;
        double value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the power between 0 and 31 (N): ");
        int N = sc.nextInt();
         for (i=0; i<=N; i++) {
              value = Math.pow(2,i);
             System.out.println("The value of 2^N is " +value);
         }
    }
}
