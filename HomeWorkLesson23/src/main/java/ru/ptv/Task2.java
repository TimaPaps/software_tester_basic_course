package ru.ptv;

public class Task2 {
    public static void main(String[] args) {
        /*
        2.Вывести элементы массива на экран в обратном порядке.
         */

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(array[i] + ", ");
        }
    }
}
