package ru.ptv;

import java.io.*;

public class LandlinePhone {
    private static final int FIRST_INDEX = 1;
    private static final String ROOT_DIR_PATH = "HomeWorkLesson27/";
    private static final String OUT_DIR_NAME = "out";
    private static final String CONTACTS_FILE_PATH = OUT_DIR_NAME + "/contacts.txt";
    private static final String EMPTY_CONTACT = "...";
    private static final String DELIMITER = "#";
    private final Contact[] contacts;

    public LandlinePhone(int memoryCell) {
        contacts = new Contact[memoryCell];
        initContactsFromDisk(memoryCell);
    }

    public void showCommandMenu() {
        System.out.println("\nМеню:");

        for (CommandMenu commandMenu : CommandMenu.values()) {
            if (commandMenu == CommandMenu.NEXT_IN)
                continue;
            System.out.print(" *" + commandMenu.name + " (" + commandMenu.command + ")*  ");
        }

        System.out.println("\nДля выбора действия введите команду указанную в круглых скобках рядом с названием команды.");
    }

    public boolean isAvailableForRecording() {
        for (Contact contact : contacts) {
            if (contact == null)
                return true;
        }

        return false;
    }

    public boolean isEmpty() {
        boolean isEmpty = true;

        for (Contact contact : contacts) {
            if (contact != null) {
                isEmpty = false;
                break;
            }
        }

        return isEmpty;
    }

    public void showContacts() {
        for (int i = 0; i < contacts.length; i++) {
            Contact contact = contacts[i];

            if (contact != null)
                System.out.println((i + FIRST_INDEX) + ". " + contact.name + " " + contact.value);
            else
                System.out.println((i + FIRST_INDEX) + ". ...");
        }
    }

    public boolean saveNewContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                return true;
            }
        }

        return false;
    }

    public boolean isNotContainsContactBy(int index) {
        index = getCorrectIndex(index);

        if (isRangeIndex(index)) {
            return contacts[index] == null;
        }

        return false;
    }

    public boolean editContact(int index, Contact contact) {
        index = getCorrectIndex(index);

        if (isRangeIndex(index)) {
            Contact old = contacts[index];

            if (old != null) {
                old.name = contact.name;
                old.value = contact.value;
                return true;
            }
        }

        return false;
    }

    public boolean deleteContact(int index) {
        index = getCorrectIndex(index);

        if (isRangeIndex(index)) {
            contacts[index] = null;
            return true;
        }

        return false;
    }

    public boolean isNotValidIndex(int index) {
        index = getCorrectIndex(index);
        return !isRangeIndex(index);
    }

    private void initContactsFromDisk(int memoryCell) {
        File root = new File(ROOT_DIR_PATH + OUT_DIR_NAME);
        String path = ROOT_DIR_PATH + CONTACTS_FILE_PATH;

        if (!root.exists()) {
            if (root.mkdir()) {
                File file = new File(path);

                if (!file.exists()) {
                    File createFile = new File(path);

                    try {
                        if (createFile.createNewFile()) {
                            System.out.println("Создан файл для сохранения списка контактов");
                            return;
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка при создании файла для сохранения списка контактов");
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            for (int i = 0; i < memoryCell; i++) {
                if ((line = reader.readLine()) != null) {

                    if (line.equals(EMPTY_CONTACT)) {
                        contacts[i] = null;
                        continue;
                    }

                    String[] split = line.split(DELIMITER);

                    if (split.length != 2) {
                        System.out.println("Ошибка при инициализации контакта " + (i + FIRST_INDEX)  + " из хранилища");
                    } else {
                        Contact contact = new Contact();
                        contact.name = split[0];
                        contact.value = split[1];
                        contacts[i] = contact;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при получении данных из хранилища");
        }
    }

    public void saveContactsToDisk() {
        String path = ROOT_DIR_PATH + CONTACTS_FILE_PATH;
        StringBuilder sb = new StringBuilder();

        for (Contact contact : contacts) {
            if (contact == null) {
                sb.append(EMPTY_CONTACT).append("\n");
                continue;
            }

            sb.append(contact.name).append(DELIMITER).append(contact.value).append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(sb.toString());
            System.out.println("Контакты сохранены в хранилище");
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в хранилище");
        }
    }

    private int getCorrectIndex(int index) {
        return index - FIRST_INDEX;
    }

    private boolean isRangeIndex(int index) {
        return index >= 0 && index <= contacts.length - 1;
    }

    public String[] checkInputTextFull(String inputText) {
        return new String[2];
    }

    public boolean isNotCorrectName(String name) {
        String regex = "^[А-ЯЁа-яё]*$";
        return !name.matches(regex);
    }

    public boolean isNotCorrectValue(String value) {
        String regex = "^[0-9]*$";
        return !value.matches(regex);
    }

    public boolean isNotCorrectLengthName(String name) {
        return name.length() < 2 || name.length() > 20;
    }

    public boolean isNotCorrectLengthValue(String value) {
        if (value.length() != 11)
            return true;

        char c = value.charAt(0);
        return c != '8';
    }
}
