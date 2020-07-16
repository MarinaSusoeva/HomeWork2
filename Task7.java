package HomeWork;

public class Task7 {
    /**
     * Написать программу, вычисляющую и отображающую все числа
     * Фибоначчи меньше введённого пользователем целого числа.
     */
    public static void main(String[] args) {
        int value = 378;
        int x1 = -1;
        int x2 = 1;

        numbers(value, x1, x2);
    }
    private static void numbers(int value, int x1, int x2) {
        while (x2 <= value) {
            int sum = x1 + x2;
            x1 = x2;
            x2 = sum;
            if (x2 > value){
                break;
            }
            System.out.println(x2);
        }
    }
}

// Долго я мучилась с этой (как оказалось простой) задачкой, честно))
// Но так и не придумала как сделать, чтобы вначале не было 0. Это страшно?))