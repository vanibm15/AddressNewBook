package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    private String addressbookName;
    static Scanner scanner = new Scanner(System.in);


    public AddressBook() {
    }

    public AddressBook(String addressbookName) {
        this.addressbookName = addressbookName;

    }

    public String getAddressbookName() {
        return addressbookName;
    }

    public void setAddressbookName(String addressbookName) {
        this.addressbookName = addressbookName;
    }

    void addAddressBook() {
        System.out.println("enter the name of addressbook");
        addressbookName=scanner.next();


    }
}