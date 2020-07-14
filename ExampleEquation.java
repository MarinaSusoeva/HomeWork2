package com.dmdev.lesson2;

public class ExampleEquation {
    /**
     * Решение квадратного уравнения с использ-ем функций
     */
    public static void main(String[] args) {
        int a = 1;
        int b = -6;
        int c = 9;

        int d = discriminant(a, b, c);

        isZero(d == 0, "Корень в уравнении один и равен " + ((-b) / 2 * a));
        isPositive (a, b, d);

        if (d < 0){
            System.out.println("Дискриминант отрицательный. Корней у данного уравнения нет.");
        }
    }

    private static void isPositive (int a, int b, int d) {
        if (d > 0) {
            System.out.println("Корня в уравнении два и они равны " + (((-b) + Math.sqrt(d)) / 2 * a + " и " + (((-b) - Math.sqrt(d)) / 2 * a)));
        }
    }


    private static void isZero(boolean b2, String s) {
        if (b2) {
            System.out.println(s);
        }
    }

    private static int discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}
