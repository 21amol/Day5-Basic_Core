package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonent {

    public void vowelCon() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char alphabet = sc.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I'
                || alphabet == 'O' || alphabet == 'U') {

            System.out.println(alphabet + " is a vowel");
        } else {
            System.out.println(alphabet + " is a consonent");
        }

    }

    public static void main(String[] args) {
        VowelConsonent vc = new VowelConsonent();
        vc.vowelCon();
    }
}
