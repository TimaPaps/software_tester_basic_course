package ru.ptv;

public class Task2 {
    public static void main(String[] args) {
        /*
        2.Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
         */

        double radiusCircle = 3;
        double sideSquare = 3.1;

        double circleArea;
        double squareArea;

        circleArea = Math.PI * Math.pow(radiusCircle, 2);
        squareArea = Math.pow(sideSquare, sideSquare);

        if (circleArea > squareArea) {
            System.out.println("Площадь круга больше");
        } else if (circleArea < squareArea) {
            System.out.println("Площадь квадрата больше");
        } else {
            System.out.println("Площадь круга равна площади квадрата");
        }
    }
}
