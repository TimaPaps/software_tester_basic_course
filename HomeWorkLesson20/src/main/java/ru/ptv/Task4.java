package ru.ptv;

public class Task4 {
    public static void main(String[] args) {
        /*
        4.Даны три вещественных числа a, b, c.
        Проверить:
        1.выполняется ли неравенство a < b < c;
        2.выполняется ли неравенство b > a > c.
         */

        double a = 1.15;
        double b = 4.77;
        double c = 9.33;

        if (a < b && b < c) {
            System.out.println("Неравенство a < b < c выполняется");
        } else {
            System.out.println("Неравенство a < b < c не выполняется");
        }

        if (b > a && a > c) {
            System.out.println("Неравенство b > a > c выполняется");
        } else {
            System.out.println("Неравенство b > a > c не выполняется");
        }
    }
}
