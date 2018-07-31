package com.sanjay.hackerack.basic;

import java.util.Arrays;

/*
You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

        For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out  candles successfully, since the tallest candle is of height  and there are  such candles.

        Function Description

        Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

        birthdayCakeCandles has the following parameter(s):

        k: the integer threshold of students on time for class to continue
        a: an array of integers representing student arrival times
*/

public class BirthdayCandals {

    public static void main(String[] args) {

    }

    public static int blownOutCandals(int[] ar){
        Arrays.sort(ar);
        int length = ar.length;
        int candalsThatCanBeBlown = ar[length - 1];
        int numberOfCandalsToBlow = 0;
        for (int i = 0;i < ar.length;i++) {
            if(ar[i] == candalsThatCanBeBlown){
                numberOfCandalsToBlow++;
            }
        }
        return numberOfCandalsToBlow;
    }
}
