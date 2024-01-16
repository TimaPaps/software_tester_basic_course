package ru.ptv;

import java.lang.reflect.Field;

public class Task3 {
    public static void main(String[] args) {
        /*
        3.Определить:
        1.сумму всех элементов массива;
        2.произведение всех элементов массива;
        3.сумму квадратов всех элементов массива;
        4.сумму шести первых элементов массива
         */

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int sumAll = 0;
        int productOfNumbers = 1;
        double sumSqrt = 0;
        int sumOfTheFirstSixNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            sumAll += array[i];
            productOfNumbers *= array[i];
            sumSqrt += Math.pow(array[i], 2);

            if (i < 6)
            {
                sumOfTheFirstSixNumbers += array[i];
            }
        }

        System.out.println("сумма всех элементов массива: " + sumAll);
        System.out.println("произведение всех элементов массива: " + productOfNumbers);
        System.out.println("сумма квадратов всех элементов массива: " + sumSqrt);
        System.out.println("сумма шести первых элементов массива: " + sumOfTheFirstSixNumbers);
    }
}
