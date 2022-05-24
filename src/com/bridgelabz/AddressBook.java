package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class AddressBook {
    public static void main(String[] args) {
        Contact contact1=new Contact("vani","bm","hubli karnataka","vanibm",987456321,236 );
//        System.out.println(contact.getFirstName());
//        System.out.println(contact.getLastName());
//        System.out.println(contact.getAddress());
//        System.out.println(contact.getEmail());
//        System.out.println(contact.getPhNo());
//        System.out.println(contact.getZip());
Contact contact2=new Contact("bbb","mm","mmm","hgh",56451,564);
        List<Contact>contacts=new ArrayList<>();
        contacts.add(contact1 );
        contacts.add(contact2);
        System.out.println(contacts  );




            }
}


