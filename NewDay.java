package com.dmdev.lesson2;

public class NewDay {
    public static void main(String[] args) {

        int d = 28;
        int m = 2;
        int y = 2019;
        int nd = d + 1;
        int nm = m + 1;
        int ny = y + 1;

        isNextDate(d, m, y, nd, nm, ny);

    }
    private static void isNextDate(int d, int m, int y, int nd, int nm, int ny) {
        if (d == 31 && m == 12 && y > 0) {
            System.out.println("Следующий день 1.1." + ny);
        } else if (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
            System.out.println("Следующий день 1." + nm + "." + y);
        } else  if (d == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m ==10)) {
            System.out.println("Следующий день 1." + nm + "." + y);
        } else  if (d == 28 && m == 2 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))){
            System.out.println("Следующий день " + nd + "." + m + "." + y);
        } else if (d == 28 && m == 2 && y > 0) {
            System.out.println("Следующий день 1.3." + y);
        } else  if (d >= 29 && m == 2 && y % 400 == 0 || (y % 4 == 0 && y % 100 !=0)) {
            System.out.println("Такой даты в феврале этого года нет");
        } else if (d > 31 || m > 12 || y < 0)  {
            System.out.println("Дата введена некорректно");
        } else if (d > 0 && d < 30 && (m > 0 && m < 13) && y > 0){
            System.out.println("Следующий день " + nd + "." + m + "." + y);
        }
    }
}

