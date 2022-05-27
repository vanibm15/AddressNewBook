package com.bridgelabz;

import java.util.*;
import java.util.concurrent.Callable;


public class AddressBook {
    Map<String, Contact> contactList = new HashMap();
    Scanner scanner = new Scanner(System.in);

    void addNewContact() {
        Contact contact = new Contact();
        contact.addContact();
        contactList.put(contact.getPhNo(), contact);
        contact.displayContact();
    }

    void editContact() {
        System.out.println("enter the phone number");
        String phNo = scanner.next();
        Contact contact = contactList.get(phNo);
        if (contact != null) {
            contact.addContact();
        } else {
            System.out.println("phoneno is not present in addressbook");
        }
    }

    void newDisplayContact() {
        System.out.println("enter the phone number");
        String phNo = scanner.next();
        Contact contact = contactList.get(phNo);
        if (contact != null) {
            contact.displayContact();
        } else {
            System.out.println("phone number is not present");
        }
    }

    void contactOperation() {
        int choices;
        do {
            System.out.println("ENTER THE CHOICES");
            System.out.println("1:ADD CONTACT");
            System.out.println("2: EDIT CONTACT");
            System.out.println("3: DISPLAY CONTACT");
            choices = scanner.nextInt();
            switch (choices) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    newDisplayContact();
                    break;
                default:
                    System.out.println("please enter the choices between 1-3");
                    contactOperation();
            }

        }
        while (choices != 3);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.contactOperation();
    }
}