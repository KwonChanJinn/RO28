package entity;

import java.util.ArrayList;

public abstract class Phone_Ex6 {
    //Question 1: abstract class & abstract method
    //Tạo 1 class Phone để lưu thông tin liên lạc, trong Phone có chứa 1
    //property có kiểu dữ liệu là Array contacts, trong từng contact có lưu
    //thông tin number, name
    //a) Tạo các abstract method
    //a. void insertContact(String name, String phone)
    //b. void removeContact(String name)
    //c. void updateContact(String name, String newPhone)
    //d.
    //b) Tạo class VietnamesePhone kế thừa Phone và triển khai các
    //method abstract
    //Viết chương trình demo
//    private ArrayList<contacts> contactsList;


    public abstract void insertContact(String name, String phone);

    public abstract void removeContact(String name);

    public abstract void updateContact(String name, String newPhone);

    public abstract void searchContact(String name);
}
