package com.bridgelabz;

import java.util.*;

public class AddressMain {

    static Map<String,AddressBook>addressBookMap=new HashMap<>();
    static Map<String,List<Contacts>>cityContactMap = new HashMap<>();
    static Map<String,List<Contacts>>stateContactMap = new HashMap<>();

    public static void main(String[] args) {
        Contacts contacts1 = new Contacts("vani","bm","vani@123","123456",
                "hubli",580021,"karnataka","bangalore");
        Contacts contacts2 = new Contacts("varsha","bm","vvv@123","123456789","reddycolony",580024,"chennai","chennai");
        Contacts contacts3 = new Contacts("pinki","patil","ppp@123","987456321","lehcolony",
                58550,"himachalpradesh","manali");
        Contacts contacts4 = new Contacts("raj","kk","raj@983","87456","rajajinagar",500031,
                "karnataka","bangalore");
        Contacts contacts5 = new Contacts("amit","mm","amit@123","1987456789","gandhichowk",580000,"delhi","delhi");
        Contacts contacts6 = new Contacts("parth","hansi","paru@123","1324556789","ggg",500024,"maharastra","mumbai");

        AddressBook addressBook1 =new AddressBook();
        addressBook1.contactsList.add(contacts1);
        addressBook1.contactsList.add(contacts3);
        addressBook1.contactsList.add(contacts6);

        AddressBook addressBook2 = new AddressBook();
        addressBook2.contactsList.add(contacts2);
        addressBook2.contactsList.add(contacts4);
        addressBook2.contactsList.add(contacts5);

        addressBookMap.put("addressbook1",addressBook1);
        addressBookMap.put("addressbook2",addressBook2);
//        System.out.println(addressBook1);
//        System.out.println(addressBook2);
        addressBook1.contactsList.stream().forEach(x->{
            if(stateContactMap.containsKey(x.getState())){
                List<Contacts> contactsList =stateContactMap.get(x.getState());
                contactsList.add(x);
            }
            else {
                List<Contacts> contactsList=new ArrayList<>();
                contactsList.add(x);
                stateContactMap.put(x.getState(),contactsList);
            }
        });

        System.out.println(addressBook1.contactsList);
        System.out.println("state Contact map");
        System.out.println(stateContactMap);
    }
    }



