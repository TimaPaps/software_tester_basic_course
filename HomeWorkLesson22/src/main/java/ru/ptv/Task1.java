package ru.ptv;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.Составить программу вывода любого числа любое заданное число раз.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = sc.nextInt();
        StringBuilder str = new StringBuilder();

        while (Math.abs(number) > 0) {
            int digit = sc.nextInt();
            str.append(digit).append(" ");
            number--;
        }
        System.out.print(str);

        sc.close();
    }
}
