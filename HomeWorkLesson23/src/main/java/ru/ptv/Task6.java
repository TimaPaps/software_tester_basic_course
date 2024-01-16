package ru.ptv;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        /*
        6.Составить программу:
        1.нахождения минимального значения среди элементов любой строки двумерного массива;
        2.нахождения максимального значения среди элементов любого столбца двумерного массива
         */

        Random random = new Random();
        int[][] array2d = new int[random.nextInt(5) + 2][random.nextInt(5) + 2];     // Java 11 is used

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = random.nextInt(20);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        int minInRow = 20;
        int maxInColumn = -20;

        int randomRow = random.nextInt(array2d.length);     // Java 11 is used
        int randomColumn = random.nextInt(array2d[0].length);     // Java 11 is used

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (randomRow == i && minInRow > array2d[randomRow][j])
                {
                    minInRow = array2d[randomRow][j];
                }

                if (maxInColumn < array2d[i][randomColumn])
                {
                    maxInColumn = array2d[i][randomColumn];
                }
            }
        }

        System.out.println("минимальное значение среди элементов любой строки двумерного массива: " + minInRow +
                " в строке: " + (randomRow + 1) + "\n" +
                "максимальное значение среди элементов любого столбца двумерного массива: " + maxInColumn +
                " в колонке: " + (randomColumn + 1));
    }
}
