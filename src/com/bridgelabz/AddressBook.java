package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class AddressBook {
    List<Contact> contactList = new ArrayList<>();

    void addNewContact() {
        Contact contact = new Contact();
        contact.addContact();
        contactList.add(contact);
        contact.displayContact();


    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addNewContact();


    }
}