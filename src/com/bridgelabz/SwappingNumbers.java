package com.bridgelabz;

import java.util.Scanner;

public class SwappingNumbers {

    public static void swapping() {
        int number;
        int swappedNum1;
        int swappedNum2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit (num1)= ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second digit (num2)= ");
        int num2 = sc.nextInt();
        number = num1 * 10 + num2;
        System.out.println("The user defined two digit number is " + number);    // Before swapping, two-digit number.

        // After Swapping.
        swappedNum1 = (number % num1);
        swappedNum2 = ((number / num1) * num1) / 10;
        System.out.println("The swapped number is " +swappedNum1 +swappedNum2);
    }

    public static void main(String[] args) {

        //Welcome to swapping number program.
        swapping();

    }
}
