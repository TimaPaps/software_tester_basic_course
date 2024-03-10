package ru.ptv;

/**
 * Программа имеет ограничение для чисел - от переданных в аргументах чисел берется только первая цифра.
 * Это сделано для того, чтобы ограничить ряд выводимых цифр в консоль.
 */
public class Main {
    public static void main(String[] args) {
        initProgram(1, 5);
        initProgram(-1, 5);
        initProgram(1, -5);
        initProgram(-1, -5);
    }

    private static void initProgram(int numberOne, int numberTwo)
    {
        System.out.printf("Аргументы метода: %d и %d\n", numberOne, numberTwo);
        int one = firstDigit(numberOne);
        int two = firstDigit(numberTwo);

        System.out.printf("Сумма чисел равна: %d\n", one + two);
        System.out.printf("Разница между числами равна: %d\n", (one > two) ? (one - two) : (two - one));

        if (one > two)
        {
            int temp = two;
            two = one;
            one = temp;
        }

        System.out.print("Ряд цифр от минимального до максимального: ");
        for (int i = one; i <= two; i++)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n\n");
    }

    private static int firstDigit(int num)
    {
        if ( num / 10 == 0)
            return num;
        return firstDigit(num / 10);
    }
}