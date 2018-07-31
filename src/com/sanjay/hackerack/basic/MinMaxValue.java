package com.sanjay.hackerack.basic;

import java.util.Arrays;

public class MinMaxValue {

    public static void main(String[] args) {

    }

    public static void printMinMaxValue(int[] arr){
         Arrays.sort(arr);
        long mininumValue = 0;
        long maximuxValue = 0;
        int length = arr.length -1;
        for (int i = 0;i < length; i++ ){
            mininumValue = mininumValue + arr[i];
        }
        maximuxValue = (mininumValue-arr[0])+arr[length];
        System.out.println(mininumValue+" "+maximuxValue);
    }
}
