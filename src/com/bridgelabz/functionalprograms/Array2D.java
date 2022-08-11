package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        int[][] arr;
        int m, n, row, col;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre the Value of Rows for Array :");
        m = sc.nextInt();
        System.out.println("Enter the Value of Columns for Array :");
        n = sc.nextInt();

        arr = new int[m][n];

        System.out.println("Enter the Values in " + m + " x " + n + " Array Matrix:");
        for (row = 0; row < m; row++) {
            for (col = 0; col < n; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("The Values in " + m + " x " + n + " Array Matrix are :\n");
        for (row = 0; row < m; row++) {
            for (col = 0; col < n; col++) {
                System.out.print("\t" + arr[row][col]);
            }
            System.out.print("\n");
        }
    }

}
