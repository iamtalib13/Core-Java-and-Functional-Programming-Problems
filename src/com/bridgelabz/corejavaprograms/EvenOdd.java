package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number :");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The Number " + number + " is Even.");
        } else {
            System.out.println("The Number " + number + " is Odd.");
        }

    }
}
