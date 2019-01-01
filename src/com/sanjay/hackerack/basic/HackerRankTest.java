package com.sanjay.hackerack.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HackerRankTest {

    public static void main(String[] args) {
        System.out.println(oddNumbers(3,5));
    }


    static String findNumber(List<Integer> arr, int k) {

        String answer = "NO";

        for(int i = 0; i< arr.size();i++){
            if(arr.get(i) == k){
                answer = "YES";
            }
        }
        return answer;

    }

    static List<Integer> oddNumbers(int l, int r) {

        List<Integer> answerList = new ArrayList<>();

        for(int i = l;i < r+1;i++){
            if(i % 2 ==0){
                continue;
            }else {
                answerList.add(i);            }
        }

        return answerList;
    }

    static int triangle(int a, int b, int c) {
        int answer = 0;

        if(a > 0 && b > 0 && c > 0){
            if(a == b && a == c && b == c){
                answer = 1;
            }else{
                int edge1 = a+b;
                int edge2 = a+c;
                int edge3 = b+c;
                if(edge1 > c && edge2 > b && edge3 > a ){
                    answer = 2;
                }else{
                    answer = 0;
                }
            }

        }else{
            answer = 0;
        }
        return answer;
    }

    static int[] delta_encode(int[] array) {
        /*
         * Write your code here.
         */


       // int[] answer = new int[array.length * 2];
        int positiveRange = 128;
        int negativeRange  = -128;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < array.length; i++){

            if (i == 0) {
                list.add(array[i]);
            }else{

                int diff =  array[i] - array[i-1];

                if(diff >  positiveRange ){
                    list.add(-128);
                    list.add(diff);
                } else if (diff < negativeRange) {
                   list.add(-128);
                   list.add(diff);
                }else {
                    list.add(diff);
                }

            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }


    static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes) {


        Set<Integer> findDuplicate = new HashSet<>();
        int countAgents = 0;
        for(int i = 0; i< callsTimes.size();i++){

            if(!findDuplicate.add(i)){
                countAgents++;
            }

        }

        if(countAgents > noOfCurrentAgents){
            countAgents = countAgents - noOfCurrentAgents;
        }else{
            countAgents = noOfCurrentAgents;
        }

        return countAgents;

    }


}
