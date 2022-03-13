package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Factors of " +num + " are: ");
        int i = 2;
        while (i <= num) {
            if ((num % i) == 0) {
                System.out.print(i + " ");
                num = (num / i);
            } else {
                i++;
            }
        }
    }
}
