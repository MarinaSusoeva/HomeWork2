package com.dmdev.lesson7.homeWork3;

import java.util.Arrays;

public class Task11 {
    /**
     * Заданы 2 массива целых чисел произвольной длины. 
     *     Написать программу, создающую третий массив,
     * представляющий собой слияние 2-х заданных.
     */
    public static void main(String[] args) {
        int[] values1 = {1, 3, 5, 7, 9};
        int[] values2 = {2, 4, 6, 8, 10};
        int[] mergedValues = mergeArrays(values1, values2);

        System.out.println(Arrays.toString(mergedValues));
    }

    private static int[] mergeArrays(int[] values1, int[] values2) {
        int[] resultArray = new int[values1.length + values2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < resultArray.length; ) {
            if (index1 < values1.length && index2 < values2.length) {
                resultArray[i++] = values1[index1++];
                resultArray[i++] = values2[index2++];
            } else if (index1 < values1.length) {
                resultArray[i++] = values1[index1++];
            } else {
                resultArray[i++] = values2[index2++];
            }
        }
        return resultArray;
    }
}
