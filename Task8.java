package HomeWork;

public class Task8 {
    /**Написать программу, отображающую статистику по осадкам
     за N дней. N вводится пользователем.
         Пользователь также должен ввести N целых чисел, обозначающих
     величину осадков в день.
         Программа должна выводить:
     a. Количество дней
     b. Сумму осадков за этот период
     c. Среднее количество осадков за этот период
     d. Максимальное количество дневных осадков за этот период
           Не использовать массивы.
     */
    public static void main(String[] args) {

        int n = 3;
        int d1 = 2;
        int d2 = 1;
        int d3 = 6;
        System.out.println("Статистика осадков за " + n + " дней:");
        int x = d1 + d2 + d3;
        System.out.println("1. Сумма осадков за этот период составила - " + x);
        int sr = (d1 + d2 + d3) / n;
        System.out.println("2. Среднее количество осадков за этот период составило - " + sr);

        maxRainfall(d1, d2, d3);
    }

    private static void maxRainfall(int d1, int d2, int d3) {
        if (d1 > d2 && d1 > d3) {
            System.out.println("3. Максимальное количество дневных осадков за этот период - " + d1);
        } else if (d2 > d1 && d2 > d3) {
            System.out.println("3. Максимальное количество дневных осадков за этот период - " + d2);
        } else
            System.out.println("3. Максимальное количество дневных осадков за этот период - " + d3);
    }
}
 // Здесь пока не знаю как сделать так, чтобы автоматически после введенного N-дней менялось количество d.
//Скорее всего это можно будет сделать в массиве, когда у d мы сможем поставить индекс d[n]. Пойду посмотрю видео про массивы)))