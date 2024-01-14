package ru.ptv;

public class Task4 {
    public static void main(String[] args) {
        /*
        4.Напечатать числа в виде следующей таблицы:
        1 2...10
        1 2...10
        1 2...10
        1 2...10
         */

        print(4, 10);
    }

    public static void print(int countLine, int maxNumber) {
        if (countLine > 0) {

            printLine(maxNumber, 1);

            System.out.println();
            countLine--;
            print(countLine, maxNumber);
        }
    }

    private static void printLine(int maxNumber, int current) {
        if (current <= maxNumber) {
            System.out.print(current + " ");
            current++;
            printLine(maxNumber, current);
        }
    }
}
