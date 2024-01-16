package ru.ptv;


import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        /*
        4.Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.
         */

        int[] array = new int[12];
        Random random = new Random();

        StringBuilder positive = new StringBuilder();
        StringBuilder negative = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;     // Java 11 is used
            System.out.print(array[i] + ", ");

            if (array[i] > 0)
                positive.append(array[i]).append(", ");

            if (array[i] < 0)
                negative.append(array[i]).append(", ");
        }

        System.out.print("\nнеотрицательные элементы: " + positive + "\nотрицательные элементы: " + negative);
    }
}
