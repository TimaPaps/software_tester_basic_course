package ru.ptv;

public class Task3 {
    public static void main(String[] args) {
        /*
        3.Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
        для значений 1, 2, ..., 10 фунтов (1фунт=453г).
         */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " фунт = " + i * 0.453 + " киллограмма");
        }
    }
}
