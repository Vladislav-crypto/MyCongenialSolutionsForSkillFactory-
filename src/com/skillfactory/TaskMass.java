package com.skillfactory;


import java.util.Arrays;
import java.util.Scanner;

public class TaskMass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите высоту массива");
        int higt  = scanner.nextInt();
        System.out.println(" Введите ширину массива");
        int wight  = scanner.nextInt();

        int [] [] mainmass = new int[higt][wight];

        for (int i = 0; i < mainmass.length; i++) {
            for (int j = 0; j < mainmass[i].length; j++) {

                mainmass[i][j] = (int) (Math.random()* 10);
            }


        }

        System.out.println(Arrays.deepToString(mainmass));

        int max = mainmass[0][0];
        int min = mainmass[0][0];

        for (int[] ints : mainmass) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;

                }
                if (anInt < min) {
                    min = anInt;
                }
            }
        }

        System.out.println("Максимальное значение в массиве" + max);
        System.out.println("Минимальное значение в массиве" + min);
    }


}







