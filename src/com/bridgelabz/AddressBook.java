package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {


    private String addressbookName;
    public  List<Contacts> contactsList = new ArrayList<>();
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
