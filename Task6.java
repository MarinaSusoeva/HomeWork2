package HomeWork;

public class Task6 {
    /** Написать программу, вычисляющую сумму цифр введённого
     пользователем целого числа.
    */
    public static void main(String[] args) {
        int number = 81083;
        int result = digit(number);
        System.out.println(result);

    }
    public static int digit (int number) {
        int result = 0;
        for (int value = number; value !=0 ; value /= 10) {
            result += value % 10;
        }
        return result;
    }
}
