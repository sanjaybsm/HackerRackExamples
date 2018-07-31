package com.sanjay.hackerack.basic;

/*
*
* For output like below for given n, example 4
*     #
*    ##
*   ###
*  ####
*
*
* */

public class PrintStairCase {


    public static void main(String[] args) {
        printStairCase(4);
    }


    public static void printStairCase(int numberOfStairCase){

        int iteration = numberOfStairCase;
        int pointerForStairCase = numberOfStairCase-1;
        StringBuilder stairCaseBuilder = null;

        for(int i=0;i< iteration;i++){
            stairCaseBuilder = new StringBuilder();
         for(int j = 0;j<iteration;j++){
             if(j >= pointerForStairCase){
                 stairCaseBuilder.append("#");
             }else{
                 stairCaseBuilder.append(" ");
             }
         }
            pointerForStairCase--;
            System.out.println(stairCaseBuilder);
        }


    }

}
