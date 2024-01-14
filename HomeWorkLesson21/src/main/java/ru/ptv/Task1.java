package ru.ptv;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".
         */

        printTenSymbols(10);
    }

    public static void printTenSymbols(int count) {
        if (count > 0) {
            System.out.print("*");
            count--;
            printTenSymbols(count);
        }
    }
}
