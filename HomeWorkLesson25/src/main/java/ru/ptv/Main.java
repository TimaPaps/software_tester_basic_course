package ru.ptv;

public class Main {
    public static void main(String[] args) {
        /*
        1.Создайте три экземпляра этого класса.
         */
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        /*
        2.Выведите на консоль значения их переменных.
         */
        System.out.println("Экземпляр Phone 1: " + phone1.number + ", " + phone1.model + ", " + phone1.weight);
        System.out.println("Экземпляр Phone 2: " + phone2.number + ", " + phone2.model + ", " + phone2.weight);
        System.out.println("Экземпляр Phone 3: " + phone3.number + ", " + phone3.model + ", " + phone3.weight);

        /*
        4.Вызовите эти методы для каждого из объектов.
         */
        phone1.receiveCall("Вася");
        phone1.getNumber();

        phone2.receiveCall("Мася");
        phone2.getNumber();

        phone3.receiveCall("Буся");
        phone3.getNumber();
    }
}