package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int dividend, divisor, quotient, remainder;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of Dividend :");
        dividend = sc.nextInt();

        System.out.println("Enter the Value of Divisor :");
        divisor = sc.nextInt();


        quotient = dividend / divisor;
        remainder = dividend % divisor;


        System.out.println("Quotient =" + quotient);
        System.out.println("Remainder =" + remainder);
    }
}
