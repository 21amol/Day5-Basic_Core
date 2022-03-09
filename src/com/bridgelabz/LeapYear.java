package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // Welcome to leap year program.

        int check;
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four digit year: ");
        year = sc.nextInt();

        check = (year % 4);
        //  System.out.println(check);
        if (check == 0) {
            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
