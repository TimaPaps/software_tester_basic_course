package ru.ptv;

public class LandlinePhone {
    public static final int FIRST_INDEX = 1;
    private final Contact[] contacts;

    public LandlinePhone(int memoryCell) {
        contacts = new Contact[memoryCell];
    }

    public void showCommandMenu() {
        System.out.println("Меню:");

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

    private int getCorrectIndex(int index) {
        return index - FIRST_INDEX;
    }

    private boolean isRangeIndex(int index) {
        return index >= 0 && index <= contacts.length - 1;
    }
}
