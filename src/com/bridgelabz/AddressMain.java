package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressMain {


    static Map<String, Contacts> contactsMap = new HashMap<>();
static Map<String,AddressBook>addressBookMap=new HashMap<>();


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
            System.out.println("1:ADD ADDRESSBOOK");
            System.out.println("2:ADD CONTACT");
            System.out.println("3:EDIT CONTACT");
            System.out.println("4:DISPLAY CONTACT");
            System.out.println("5:DELETE CONTACT");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewAddressBook();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    deleteContact();
                    break;
                default:
                    System.out.println("Enter the choices between 1-5");
                    contactOperations();
            }
        } while (choice != 5);
    }
    static void addNewAddressBook(){
        AddressBook addressBook=new AddressBook();
        addressBook.addAddressBook();
        addressBookMap.put(addressBook.getAddressbookName(),addressBook);
    }

    public static void main(String[] args) {
        AddressMain addressBook = new AddressMain();
       contactOperations();
  //     AddressBook addressBook1=new AddressBook();
     //  AddressBook addressBook2=new AddressBook();
       //AddressBook addressBook3=new AddressBook();
     //   addNewAddressBook();


    }
}