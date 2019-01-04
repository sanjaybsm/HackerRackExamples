package com.sanjay.hackerack.basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountingValleys {


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();

        int nextStep = 0;
        int valley = 0;

        for(char step: steps){
            if(step == 'U'){
                nextStep++;
                if(nextStep == 0){
                    valley++;
                }
            }else{
                nextStep--;
            }
        }
        return valley;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
/*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
