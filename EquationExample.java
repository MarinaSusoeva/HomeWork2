package com.dmdev.lesson2;

public class EquationExample {
    /**
     * Решение квадратного уравнения
     */
    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int c = -3;

        int d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Дискриминант отрицательный. Корней у данного уравнения нет.");
        } else if (d == 0) {
            System.out.println("Корень в уравнении один и равен " + ((-b) / 2 * a));
        } else if (d > 0){
            System.out.println("Корня в уравнении два и они равны " + (int) (((-b) + Math.sqrt(d)) / 2 * a) + " и " + (int) (((-b) - Math.sqrt(d)) / 2 * a));
        }


    }
}

