package ru.ptv;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.Заполнить массив из двенадцати элементов 1, 2, ... 12.
         */

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
}
