package com.bridgelabz.corejavaprograms;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Character :");
        ch = sc.next().toLowerCase().charAt(0);

        if( ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonant");
        }
    }
}
