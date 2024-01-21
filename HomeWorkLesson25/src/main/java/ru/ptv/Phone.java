package ru.ptv;

public class Phone {
    /*
    Создайте класс Phone, который содержит переменные number, model и weight.
     */
    int number;
    String model;
    double weight;

    /*
    3.Добавьте в класс Phone методы:
    - receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    - Метод getNumber – возвращает номер телефона.
     */
    public void receiveCall(String userName) {
        System.out.println("Звонит " + userName);
    }

    public int getNumber() {
        return number;
    }
}
