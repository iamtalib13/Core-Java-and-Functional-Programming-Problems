package com.bridgelabz.functionalprograms;

public class Distance {
    public static void main(String[] args) {

        int x, y;
        double Distance = 0.0;

        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        System.out.println("The Value for Point X : " + x);
        System.out.println("The Value for Point Y : " + y);

        Distance = Math.sqrt( Math.pow(x,x) + Math.pow(y,y) );

        System.out.println("Euclidean Distance : " + Distance);
    }
}
