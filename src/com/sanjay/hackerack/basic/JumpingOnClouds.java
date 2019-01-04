package com.sanjay.hackerack.basic;

import java.util.Scanner;

public class JumpingOnClouds {


    static int jumpingOnClouds(int[] c) {

        int zeroSteps = 0;
        int steps = -1;
        for(int i = 0;i<c.length;i++){

            if(c[i] == 1){
                zeroSteps = 0;
            }else{

                if(zeroSteps == 2){
                    zeroSteps--;
                    continue;
                }
                zeroSteps++;
                steps++;
            }
        }
        System.out.println("answer "+steps);
        return steps;
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

    /*    bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
