package Controller;

import Model.Contact;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu() {
        int option;
        do {
            consoleView.displayMenu();
            String input = consoleView.getInput("Selecciona una opcion: ");
            option = Integer.parseInt(input);

            switch (option) {
                case 1 -> addContact();
                case 2 -> findContact();
                case 3 -> deleteContact();
                case 4 -> printList();
                case 5 -> consoleView.showMessage("\nSaliendo del programa...");
                default -> consoleView.showMessage("\nOpcion no valida. Intente de nuevo");
            }
        } while (option != 5);
    }

    private void addContact() {
        String name = consoleView.getInput("Nombre: ");
        String phone = consoleView.getInput("Telefono: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("\nContacto agregado");
    }

    private void findContact() {
        String name = consoleView.getInput("Nombre del contacto a buscar: ");
        Contact<String, String> found = contactManager.findContactByName(name);
        if (found != null) {
            consoleView.showMessage("\nContacto encontrado: " + found);
        } else {
            consoleView.showMessage("\nNo se encontro el contacto");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Nombre del contacto a eliminar: ");
        boolean deleted = contactManager.deleteContactByName(name);
        if (deleted) {
            consoleView.showMessage("\nContacto eliminado");
        } else {
            consoleView.showMessage("\nNo se encontro el contacto para eliminar");
        }
    }

    private void printList() {
        contactManager.printList();
    }
}

