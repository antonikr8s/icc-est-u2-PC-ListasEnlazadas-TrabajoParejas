package Controller;

import Model.Contact;
import Model.LinkedList;
import Model.Node;

public class ContactManager {
    private LinkedList<Contact<String, String>> contacts = new LinkedList<>();

    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<String, String> findContactByName(String name) {
        Node<Contact<String, String>> current = contacts.head;
        while (current != null) {
            if (current.getValue().getName().equals(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Node<Contact<String, String>> current = contacts.head;
        while (current != null) {
            if (current.getValue().getName().equals(name)) {
                return contacts.deleteByValue(current.getValue());
            }
            current = current.getNext();
        }
        return false;
    }

    public void printList() {
        contacts.print();
    }
}
