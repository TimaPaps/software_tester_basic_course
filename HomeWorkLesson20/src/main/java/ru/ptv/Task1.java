package ru.ptv;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1.
        Известно количество очков, полученных командой за игру.
        Определить словесный результат игры (выигрыш, проигрыш или ничья).
         */

        int points = 3;

        switch (points) {
            case 0:
                System.out.println("Проигрыш");
                break;
            case 1:
                System.out.println("Ничья");
                break;
            case 3:
                System.out.println("Выигрыш");
                break;
            default:
                System.out.println("Что-то пошло не так 8)");
        }
    }
}
