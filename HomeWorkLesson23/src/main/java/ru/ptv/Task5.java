package ru.ptv;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        /*
        5.Дан массив.Определить:
        1.количество максимальных элементов в массиве;
        2.количество минимальных элементов в массиве
         */

        Random random = new Random();
        int[] array = new int[20];

        int max = 0;
        int min = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;     // Java 11 is used
            System.out.print(array[i] + ", ");

            if (max == array[i]) {
                positiveCount++;
            } else if (max < array[i]) {
                max = array[i];
                positiveCount = 1;
            }

            if (min == array[i]) {
                negativeCount++;
            } else if (min > array[i]) {
                min = array[i];
                negativeCount = 1;
            }
        }

        System.out.print("\nколичество максимальных элементов в массиве: " + positiveCount +
                "\nколичество минимальных элементов в массиве: " + negativeCount);
    }
}
