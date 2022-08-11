package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class LargestFromThreeNumbers {
    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 Numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Largest is : " + a);
            } else {
                System.out.println("Largest is : " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest is : " + b);
            } else {
                System.out.println("Largest is : " + c);
            }
        }
    }
}
