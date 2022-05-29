package com.bridgelabz;

import com.bridgelabz.Contacts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressMain {

    static Map<String, Contacts> contactsMap = new HashMap<>();

    static Scanner scanner = new Scanner(System.in);


    static void addNewContact() {
        Contacts contacts = new Contacts();
        contacts.addContact();
        contactsMap.put(contacts.getPhoneNumber(), contacts);
    }

    private static void editContact() {
        System.out.println("Enter the contactNumber");
        String phoneNumber = scanner.next();
        Contacts contacts = contactsMap.get(phoneNumber);
        if (contacts != null) {
            contacts.addContact();
        } else {
            System.out.println("The contact is not present in Addressbook");
        }
    }

    private static void showContact() {
        System.out.println("Enter the contactNumber");
        String phoneNumber = scanner.next();
        Contacts contacts = contactsMap.get(phoneNumber);
        if (contacts != null) {
            contacts.displayContact();
        } else {
            System.out.println("The contact is not present in AddressBook");
        }
    }

    private static void deleteContact() {
        System.out.println("Enter the ContactNumber");
        String phoneNumber = scanner.next();
        Contacts contacts = contactsMap.get(phoneNumber);
        if (contacts != null) {
            contactsMap.remove(contacts);
        } else {
            System.out.println("The contact is not present in Addressbook");
        }
    }

    static void contactOperations() {
        int choice;
        do {
            System.out.println("Enter the choice");
            System.out.println("1:ADD CONTACT");
            System.out.println("2:EDIT CONTACT");
            System.out.println("3:DISPLAY CONTACT");
            System.out.println("4:DELETE CONTACT");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    showContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                default:
                    System.out.println("Enter the choices between 1-5");
                    contactOperations();
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        AddressMain addressBook = new AddressMain();
        contactOperations();
    }
}