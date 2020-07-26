package com.dmdev.lesson7.homeWork3;

public class Task10 {
    /**
     * Написать программу, удаляющую все повторяющиеся целые
     * числа из массива и печатающую результат. Массив должен
     * использоваться тот же самый. На место удаленных элементов
     * ставить цифру 0.
     */

    public static void main(String[] args) {
        int[] values = {3, 6, 3, 9, 2, 4, 2, 7, 8, 10, 12, 8};

        repeatNumber(values);
        printArrayForeach(values);
    }

    public static void repeatNumber(int[] values) {
        for (int i = 0; i <= values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    values[j] = 0;
                }
            }
        }
    }

    public static void printArrayForeach(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
