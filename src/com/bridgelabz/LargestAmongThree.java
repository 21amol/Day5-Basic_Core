package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThree {

    public void largestOfThree() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number (Num1): ");
        float num1 = sc.nextFloat();
        System.out.println("Enter first number (Num2): ");
        float num2 = sc.nextFloat();
        System.out.println("Enter first number (Num3): ");
        float num3 = sc.nextFloat();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest among three.");
        }

        else if (num2 > num3) {
            System.out.println(num2 + " is the largest among three");

        } else {
            System.out.println(num3 + " is the largest among three");
        }
    }

    public static void main(String[] args) {

        // Welcome to Largest among three numbers program.
            LargestAmongThree largest = new LargestAmongThree();
            largest.largestOfThree();
    }
}
