package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Harmonic Value : ");
        int harmonicNo = sc.nextInt();
        double total = 0;

        //Repeat until the Harmonic Sequence complete
        for(int i=1; i<=harmonicNo; i++) {
            total += (double) 1/i;
            System.out.print("1/"+i+"+");
        }

        System.out.println("\nTotal of Harmonic Number :"+ total);

    }

}
