package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {

    public void evenOdd() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is a even number");

        } else {
            System.out.println(num + " is a odd number");
        }
    }

    public static void main(String[] args) {

        //Welcome to odd even program.
        EvenOdd eo = new EvenOdd();
        eo.evenOdd();
    }
}
