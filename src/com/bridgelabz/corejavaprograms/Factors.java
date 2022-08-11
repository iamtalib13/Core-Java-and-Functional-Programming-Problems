package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        int number;
        int temp = 1;


             Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter the Number :");
            number = sc.nextInt();



        System.out.println("The Prime Factors for Numbers "+number+" Are:");
        for ( int i=2; i<=number; i++) {
            if(number % i == 0) {
                temp = 1;
                for (int j=2; j<=i/2; j++) {
                    if(i % j == 0) {
                        temp = 0;
                        break;
                    }
                }
                if(temp == 1) {
                    System.out.println(i +" ");
                }
            }
        }
    }
}
