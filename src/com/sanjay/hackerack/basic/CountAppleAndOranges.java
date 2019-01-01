package com.sanjay.hackerack.basic;

public class CountAppleAndOranges {

    public static void main(String[] args) {

    }



    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int startRange = s;
        int endRange = t;

        int lengthOfAppleArray = a;
        int lengthOfOrangeArray = b;

        int[] distanceOfApple = new int[apples.length];
        int[] distanceOfOranges = new int[oranges.length];


        int numberOfAppleInRange = 0;
        for(int i=0;i< apples.length;i++){
            distanceOfApple[i] = lengthOfAppleArray + apples[i];
            if(distanceOfApple[i] >= startRange && distanceOfApple[i] <= endRange){
                numberOfAppleInRange++;
            }
        }

        System.out.println(numberOfAppleInRange);

        int numberOfOrangeInRange = 0;
        for(int i=0;i< oranges.length;i++){
            distanceOfOranges[i] = lengthOfOrangeArray + oranges[i];
            if(distanceOfOranges[i] >= startRange && distanceOfOranges[i] <= endRange){
                numberOfOrangeInRange++;
            }
        }

        System.out.println(numberOfOrangeInRange);


    }
}


