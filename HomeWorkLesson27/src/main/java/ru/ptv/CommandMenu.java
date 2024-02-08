package ru.ptv;

public enum CommandMenu {
    NEW_CONTACT ("n-c", "Новый контакт"),
    EDIT_CONTACT("e-c", "Редактировать контакт"),
    DELETE_CONTACT("d-c", "Удалить контакт"),
    GO_OUT("#", "Выйти"),
    NEXT_IN("n-i", "Команда введена не правильно. Введите команду");

    public final String command;
    public final String name;

    CommandMenu(String command, String name) {
        this.command = command;
        this.name = name;
    }

    public static CommandMenu getCommand(String command) {
        for (CommandMenu commandMenu : CommandMenu.values()) {
            if (commandMenu.command.equals(command) && !command.equals(CommandMenu.NEXT_IN.command))
                return commandMenu;
        }
        return CommandMenu.NEXT_IN;
    }
}
