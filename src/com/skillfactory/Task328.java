package com.skillfactory;

import java.util.Scanner;

public class Task328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        //Написать код здесь
        boolean result = false;
        int count = 0;
        if (name.length() != 0) {
            count++;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == ' ') {
                    count++;
                }
            }
            if (count == 3) {
                result = true;
            } else result = false;
        }

        return result;
    }

}
