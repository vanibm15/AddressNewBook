package com.bridgelabz;

public class AddressBook {
    public static void main(String[] args) {
        Contact contact=new Contact("vani","bm","hubli karnataka","vanibm",987456321,236);
        System.out.println(contact.getFirstName());
        System.out.println(contact.getLastName());
        System.out.println(contact.getAddress());
        System.out.println(contact.getEmail());
        System.out.println(contact.getPhNo());
        System.out.println(contact.getZip());

    }
}
