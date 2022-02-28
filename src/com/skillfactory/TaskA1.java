package com.skillfactory;

import java.util.Arrays;

public class TaskA1 {
    public static int[] numbers = new int[100];

    public static void main(String[] args) {
        // code here...
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                Math.abs(i * -1);
            }
        }


        System.out.println(Arrays.toString(numbers));
    }
}
