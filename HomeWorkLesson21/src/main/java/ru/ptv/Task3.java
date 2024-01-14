package ru.ptv;

public class Task3 {
    public static void main(String[] args) {
        /*
        3.Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.
        (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)
         */

        double a1 = 3;
        double b1 = 4;
        double c1 = 5;

        double a2 = 4;
        double b2 = 5;
        double c2 = 6;

        boolean isTriangle1;
        boolean isTriangle2;
        isTriangle1 = isTriangle(a1, b1, c1);
        isTriangle2 = isTriangle(a2, b2, c2);

        if (!isTriangle1 || !isTriangle2) {
            System.out.println("Это не треугольник");
            return;
        }

        double p1 = getPerimeter(a1, b1, c1);
        double p2 = getPerimeter(a2, b2, c2);

        double s1 = getSquare(a1, b1 ,c1);
        double s2 = getSquare(a2, b2 ,c2);

        double sumP = p1 + p2;
        double sumS = s1 + s2;

        System.out.println("Сумма периметров двух треугольников равна: " + sumP);
        System.out.println("Сумма площадей двух треугольников равна: " + sumS);
    }

    public static boolean isTriangle(double a1, double b1, double c1) {

        return a1 + b1 > c1 && b1 + c1 > a1 && a1 + c1 > b1;
    }

    public static double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double getSquare(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }
}
