package com.bridgelabz.corejavaprograms;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value for A :");
        a=sc.nextInt();
        System.out.println("Enter the Value for B :");
        b=sc.nextInt();

        System.out.println("Value of A and B Before Swapping");
        System.out.println("A : " + a + "\t" + "B : " + b);

        c = a;
        a = b;
        b = c;
        System.out.println("--------------------------------");
        System.out.println("Value of A and B After Swapping");
        System.out.println("A : " + a + "\t" + "B : " + b);
    }


}
