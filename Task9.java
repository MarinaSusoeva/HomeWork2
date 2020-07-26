package com.dmdev.lesson7.homeWork3;

/**
 * Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class Task9 {

    public static void main(String[] args) {
        int[] values = {5, 10, 15, 20, 25, 30};

        shiftRight(values);
        printArrayForeach(values);

        shiftRight(values);
        printArrayForeach(values);

        shiftRight(values);
        printArrayForeach(values);
    }

    public static void shiftRight(int[] values) {
        int end = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = end;
    }

    public static void printArrayForeach(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
