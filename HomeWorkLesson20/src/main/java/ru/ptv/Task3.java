package ru.ptv;

public class Task3 {
    public static void main(String[] args) {
        /*
        3.Дано двузначное число. Определить: остаток от деления десятков на единицы, результат деления единиц на десятки
         */

        int number = 43;
        int units;
        int decimals;

        units = number % 10;
        decimals = number / 10;

        int result1 = decimals % units;
        System.out.println("Остаток от деления десятков на единицы: " + result1);

        double result2 = (double) units / decimals;
        System.out.println("Результат деления единиц на десятки" + result2);
    }
}
