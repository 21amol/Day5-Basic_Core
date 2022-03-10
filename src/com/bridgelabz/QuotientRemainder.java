package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {

    public static void quotientRemainder() {
        int remainder = 0;
        int quotient = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Dividend= ");
        int dividend = sc.nextInt();

        System.out.println("Enter the value of Divisor= ");
        int divisor = sc.nextInt();

        quotient = dividend / divisor;
        remainder = dividend - (quotient * divisor);

        System.out.println("The value of Remainder and Quotient is = " + remainder + " and " + quotient + " respectively");
    }

    public static void main(String[] args) {

        // Welcome to Quotient Remainder Program.
        quotientRemainder();

    }
}
