package ru.ptv;

public class Task5 {
    public static void main(String[] args) {
        /*
        5.Даны два числа. Если квадратный корень из второго числа меньше первого числа,
        то увеличить второе число в пять раз.
         */

        int a = 5;
        int b = 7;

        double sqrtB = Math.sqrt(b);

        if (sqrtB < a)
        {
            b *= 5;
        }

        System.out.println("Итоговое значение второго числа: " + b);
    }
}
