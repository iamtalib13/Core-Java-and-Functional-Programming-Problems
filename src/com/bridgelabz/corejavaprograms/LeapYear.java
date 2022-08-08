package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Four Digit Year : ");
        String yr = input.nextLine();
        int year = Integer.parseInt(yr);


        if (yr.length() != 4) {
            System.out.println(year + " is not Valid Year , Please Enter Four Digit Year");

        } else if ((year % 400) == 0) {
            System.out.println(year + " is Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is Leap Year");
        } else {

            System.out.println(year + " is Not a Leap Year");
        }


    }
}
