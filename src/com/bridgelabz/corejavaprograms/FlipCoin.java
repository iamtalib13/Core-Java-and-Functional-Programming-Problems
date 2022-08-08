package com.bridgelabz.corejavaprograms;

public class FlipCoin {
    public static void main(String[] args) {
        int headCounter = 0;
        int tailCounter = 0;

        for (int i = 1; i <= 10; i++) {
            int coinFlip = (int) Math.round(Math.random());
            System.out.println("Coin Flip Value = "+coinFlip);

            if(coinFlip < 0.5) {
                tailCounter++;
            } else {
                headCounter++;
            }

        }
        System.out.println("TailCount:"+tailCounter);
        System.out.println("HeadCount:"+headCounter);

        int PercentageTail = (tailCounter * 100) / 10;
        int PercentageHead = (headCounter * 100) / 10;

        System.out.println("The Percentage of Tails is : " + PercentageTail+"%");
        System.out.println("The Percentage of Heads is : " + PercentageHead+"%");
    }
}

