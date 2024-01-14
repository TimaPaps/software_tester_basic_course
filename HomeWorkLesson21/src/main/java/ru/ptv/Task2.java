package ru.ptv;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        2.Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = sc.nextInt();
        sc.close();

        printSymbols(number);
    }

    public static void printSymbols(int count) {

        count = Math.abs(count);

        if (count > 0) {
            System.out.print("*");
            count--;
            printSymbols(count);
        }
    }
}
