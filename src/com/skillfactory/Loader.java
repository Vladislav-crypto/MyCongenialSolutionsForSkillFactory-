package com.skillfactory;

public class Loader {


    public static void main(String[] args) {
        int value = add(3, 4);
        int result = add(value, 10);
        System.out.println(result);
    }

    public static int add(int x, int y) {
        return (x + y);
    }
}
