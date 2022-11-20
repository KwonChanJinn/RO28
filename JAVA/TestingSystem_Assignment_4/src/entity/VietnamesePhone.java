package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VietnamesePhone extends Phone_Ex6 {

    public Scanner sc;

    public List<contact> ContactList;

    public VietnamesePhone() {
        ContactList = new ArrayList<>();
    }

    @Override
    public void insertContact(String name, String phone) {
        contact con1 = new contact(name, phone);
        ContactList.add(con1);
    }

    @Override
    public void removeContact(String name) {
        ContactList.removeIf(contact -> contact.getName().equals(name));

    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (contact contact : ContactList) {
//  tim kiem trong 2 mgnar rooif leen cais moi vao get ra set vao
            if (contact.getName().equals(name)) {
                contact.setName(newPhone);
            }

        }

    }

    @Override
    public void searchContact(String name) {


        for (contact contact : ContactList) {
            if (contact.getName().equals(name)) {
                System.out.println("Không có tên nào hết v: ");
                System.out.println(contact);
            }
            else {
                System.out.println("Không có tên nào hết: ");

            }
        }

    }
}
