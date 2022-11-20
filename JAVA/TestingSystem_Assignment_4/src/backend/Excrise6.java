package backend;

import entity.VietnamesePhone;
import entity.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excrise6 {
    //Question 1: abstract class & abstract method
    //Tạo 1 class Phone để lưu thông tin liên lạc, trong Phone có chứa 1
    //property có kiểu dữ liệu là Array contacts, trong từng contact có lưu
    //thông tin number, name
    //a) Tạo các abstract method
    //a. void insertContact(String name, String phone)
    //b. void removeContact(String name)
    //c. void updateContact(String name, String newPhone)
    //d. void searchContact(String name)
    //b) Tạo class VietnamesePhone kế thừa Phone và triển khai các
    //method abstract
    //Viết chương trình demo
    private Scanner sc;
    private List<contact> ContactList11;

    public Excrise6() {
        ArrayList<contact> ContactList11;
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Excrise6 excrise6 = new Excrise6();
        excrise6.Question1();

    }


    public void Question1() {
        Menu();
    }


    private void Menu() {
        while (true) {
            System.out.println("----Lựa chọn chức năng bạn muốn sử dụng------");
            System.out.println("--- 1. insertContact -- - ");
            System.out.println("--- 2. removeContact -- - ");
            System.out.println("--- 3. updateContact- - ");
            System.out.println("--- 4. searchContact- - ");

            int menuchoose = sc.nextInt();

            switch (menuchoose) {
                case 1:
                    insertContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhập đúng thông tin đầu vào ");
                    break;

            }
        }


    }

    public void insertContact() {
        VietnamesePhone VietnamesePhone = new VietnamesePhone();

        System.out.println("Nhập vào tên Contact: ");
        String name = sc.next();
        System.out.println("Nhập vào tên số Phone: ");
        String phone = sc.next();
        VietnamesePhone.insertContact(name, phone);


    }

    public void removeContact() {
        VietnamesePhone VietnamesePhone = new VietnamesePhone();
        System.out.println("Nhập vào tên Contact: ");
        String name1 = sc.next();
        VietnamesePhone.removeContact(name1);
        System.out.println("Đã xóa thành công " + name1);
    }

    public void updateContact() {
        VietnamesePhone VietnamesePhone = new VietnamesePhone();
        System.out.println("Nhập vào tên Contact: ");
        String name2 = sc.next();
        System.out.println("Nhập vào tên số Phone: ");
        String phone2 = sc.next();
        VietnamesePhone.updateContact(name2, phone2);
    }

    public void searchContact(){
        VietnamesePhone VietnamesePhone = new VietnamesePhone();
        System.out.println("Nhập vào tên Contact: ");
        String name3 = sc.next();
        VietnamesePhone.searchContact(name3);
    }

}
