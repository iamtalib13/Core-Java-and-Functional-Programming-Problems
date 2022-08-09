package com.bridgelabz.corejavaprograms;

public class PowerOfTwo {

    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);

        System.out.println("Number for Power : "+n);


        if( n <= 0 || n > 31) {
            System.out.println("The Power Number must be Greater Than Zero and Less Than 31");
        } else {

            for(int i=1; i<=n; i++) {

                int powerOfNo = (int) Math.pow(2,i);
                System.out.println(powerOfNo);
            }
        }


    }

}