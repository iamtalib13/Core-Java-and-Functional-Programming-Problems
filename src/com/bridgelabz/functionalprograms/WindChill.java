package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        int t, v;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of T :");
        t = sc.nextInt();

        System.out.println("Enter The Value Of V :");
        v = sc.nextInt();

        double weather = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));

        System.out.println("Wind Chill Temperature :" + weather);
    }
}
