package com.bridgelabz;

import java.util.Scanner;

public class Contact
{
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private long phNo;
    private long zip;
Scanner scanner=new Scanner(System.in);
    public Contact() {
    }


    public Contact(String firstName, String lastName, String address, String email, long phNo, long zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phNo = phNo;
        this.zip = zip;
    }

        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phNo=" + phNo +
                ", zip=" + zip +
                '}';
    }
    void addContact(){
        System.out.println("enter the FirstName");
        firstName=scanner.next();
        System.out.println("enter  the last name");
        lastName=scanner.next();
        System.out.println("enter the address");
        address=scanner.next();
        System.out.println("enter the email");
        email=scanner.next();
        System.out.println("enter the phone number");
        phNo=scanner.nextInt();
        System.out.println("enter the zip");
        zip=scanner.nextLong();
    }
    void displayContact(){
        System.out.println("enter the firstname :" + firstName+"\n"+ "enter the last name :" +lastName+"\n"
       +"enter the address :" + address+"\n"+ "enter the email :" + email+"\n"+ "enter the phone number :" + phNo + "\n"
        +"enter the zip :" + zip + "\n");
        }



        }





