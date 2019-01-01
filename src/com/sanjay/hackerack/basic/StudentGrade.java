package com.sanjay.hackerack.basic;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        int[] example = {33,47,56,83};
        System.out.println(gradingStudents(example));

    }



    static int[] gradingStudents(int[] grades) {

        int value;
        int[] finalAnswerArray = new int[grades.length];

        for(int i= 0 ;i < grades.length;i++){
            value = grades[i];
            if (value < 38) {
                finalAnswerArray[i] = value;
            } else if (value >= 38) {
                int modulerOf5 = value;
                while (true) {
                    if (modulerOf5 % 5 == 0) {

                        break;
                    } else {
                        modulerOf5++;
                    }
                }
                //check if the difference is more than 2
                if ((modulerOf5 - value) > 2) {
                    finalAnswerArray[i] = value;
                } else {
                    finalAnswerArray[i] = modulerOf5;
                }
            }
        }
        System.out.println(Arrays.toString(finalAnswerArray));
        return finalAnswerArray;
    }

}
