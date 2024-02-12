package ru.ptv;

import java.util.Scanner;

public class Main {
    public static final int MEMORY_CELL = 10;

    public static void main(String[] args) {
        LandlinePhone phone = new LandlinePhone(MEMORY_CELL);
        initPhoneDirectory(phone);
    }

    private static void initPhoneDirectory(LandlinePhone phone) {
        System.out.println("\n *** КОНТАКТЫ ТЕЛЕФОНА ***\n\n");

        System.out.println("Инициализация контактов из хранилища ...");
        phone.showContacts();
        phone.showCommandMenu();

        Scanner sc = new Scanner(System.in);
        String inputText;
        String[] split;
        int index;

        while (sc.hasNext()) {
            inputText = sc.nextLine();
            //TODO: delete
            System.out.println(inputText);
            CommandMenu commandMenu = CommandMenu.getCommand(inputText);

            switch (commandMenu) {
                case GO_OUT:
                    System.out.println("\nСохранение и выход из раздела");
                    sc.close();
                    phone.saveContactsToDisk();
                    System.out.println("\n\n *** КОНТАКТЫ ТЕЛЕФОНА ***");
                    return;
                case NEW_CONTACT:
                    if (!phone.isAvailableForRecording()) {
                        System.out.println("Память телефона заполнена, для записи нового контакта необходимо удалить " +
                                "один из контактов.");
                        break;
                    }

                    System.out.println(commandMenu.name);
                    System.out.println("Введите имя из символов от 'а' до 'я', затем через " +
                            "пробел введите номер телефона в формате '89999999999'\nНапример: Слава 89999999999");

                    inputText = sc.nextLine();
                    //TODO: delete
                    System.out.println(inputText);
                    split = inputText.split(" ");
                    boolean isSaved = false;

                    if (split.length != 2) {
                        System.out.println("Неверно введены данные нового контакта. Введите команду");
                        break;
                    } else {
                        String name = split[0];
                        String value = split[1];


                        if (phone.isNotCorrectName(name)) {
                            System.out.println("Символами имени могут быть только русские буквы. Введите команду");
                            break;
                        }

                        if (phone.isNotCorrectValue(value)) {
                            System.out.println("Номер должен состоять только из цифр. Введите команду");
                            break;
                        }

                        if (phone.isNotCorrectLengthName(name)) {
                            System.out.println("Количество символов имени должно быть от 2 до 20. Введите команду");
                            break;
                        }

                        if (phone.isNotCorrectLengthValue(value)) {
                            System.out.println("Количество цифр номера должно быть 11 и начинается с 8. Введите команду");
                            break;
                        }

                        Contact contact = new Contact();
                        contact.name = name;
                        contact.value = value;
                        isSaved = phone.saveNewContact(contact);
                    }

                    if (isSaved) {
                        phone.showContacts();
                        phone.showCommandMenu();
                    } else {
                        System.out.println("Ошибка: контакт не сохранен");
                    }
                    break;
                case EDIT_CONTACT:
                    if (phone.isEmpty()) {
                        System.out.println("Нет контактов в телефонной книге для изменения. Введите команду");
                        break;
                    }

                    System.out.println(commandMenu.name);
                    System.out.println("Выберите контакт из списка по индексу");
                    phone.showContacts();

                    try {
                        index = Integer.parseInt(sc.nextLine());

                        if (phone.isNotValidIndex(index)) {
                            System.out.println("Неправильно введен индекс контакта для его изменения. Введите команду");
                            phone.showCommandMenu();
                            break;
                        }

                        if (phone.isNotContainsContactBy(index)) {
                            System.out.println("Введен индекс пустой ячейки " + index + ". Введите команду");
                            phone.showCommandMenu();
                            break;
                        }

                        System.out.println("Введите имя из символов от 'а' до 'я', затем через " +
                                "пробел введите номер телефона в формате '89999999999'\nНапример: Слава 89999999999");

                        inputText = sc.nextLine();
                        //TODO: delete
                        System.out.println(inputText);
                        split = inputText.split(" ");
                        boolean isEdited = false;

                        if (split.length != 2) {
                            System.out.println("Неверно введены данные нового контакта. Введите команду");
                            break;
                        } else {
                            String name = split[0];
                            String value = split[1];

                            if (phone.isNotCorrectName(name)) {
                                System.out.println("Символами имени могут быть только русские буквы. Введите команду");
                                break;
                            }

                            if (phone.isNotCorrectValue(value)) {
                                System.out.println("Номер должен состоять только из цифр. Введите команду");
                                break;
                            }

                            if (phone.isNotCorrectLengthName(name)) {
                                System.out.println("Количество символов имени должно быть от 2 до 20. Введите команду");
                                break;
                            }

                            if (phone.isNotCorrectLengthValue(value)) {
                                System.out.println("Количество цифр номера должно быть 11 и начинается с 8. Введите команду");
                                break;
                            }

                            Contact contact = new Contact();
                            contact.name = name;
                            contact.value = value;
                            isEdited = phone.editContact(index, contact);
                        }

                        if (!isEdited) {
                            System.out.println("Ошибка: Контакт не изменен");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Введено недопустимое значение. Введите команду");
                    }

                    phone.showContacts();
                    phone.showCommandMenu();
                    break;
                case DELETE_CONTACT:
                    if (phone.isEmpty()) {
                        System.out.println("Нет контактов в телефонной книге для удаления. Введите команду");
                        break;
                    }

                    System.out.println(commandMenu.name);
                    System.out.println("Выберите контакт из списка по индексу");
                    phone.showContacts();

                    try {
                        index = Integer.parseInt(sc.nextLine());

                        if (phone.isNotValidIndex(index)) {
                            System.out.println("Неправильно введен индекс контакта для его удаления. Введите команду");
                            phone.showCommandMenu();
                            break;
                        }

                        if (phone.isNotContainsContactBy(index)) {
                            System.out.println("Введен индекс пустой ячейки " + index + ". Введите команду");
                            phone.showCommandMenu();
                            break;
                        }

                        boolean isDeleted = phone.deleteContact(index);

                        if (!isDeleted) {
                            System.out.println("Ошибка: Контакт не удален");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Введено недопустимое значение. Введите команду");
                    }

                    phone.showContacts();
                    phone.showCommandMenu();
                    break;
                case NEXT_IN:
                    System.out.println(commandMenu.name);
                    break;
            }
        }
    }
}