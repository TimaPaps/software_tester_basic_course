package ru.ptv;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        4.Вычислить сумму 1 + 1/2 + 1/3 + ... + 1/n.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = sc.nextInt();

        double numerator = 1;
        double sum = 1;

        for (int i = 2; i <= number; i++) {
            sum += numerator / i;
        }

        System.out.println("Сумма: " + sum);
    }
}
