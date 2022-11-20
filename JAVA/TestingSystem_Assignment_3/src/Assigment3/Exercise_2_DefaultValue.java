package Assigment3;

import entity.Account;

import java.time.LocalDate;

public class Exercise_2_DefaultValue {
    public static void main(String[] args) {
        Exercise_2_DefaultValue ex = new Exercise_2_DefaultValue();
        ex.Question_1();
    }

    public void Question_1() {
        System.out.println("Khởi tạo mảng Account gồm 5 phần tử");

        Account[] accArray = new Account[5];
        for (int i = 0; i < accArray.length; i++) {
            Account acc = new Account();
            acc.email = "Email " + i;
            acc.userName = "User name " + i;
            acc.fullName = "Full name " + i;
            acc.createDate = LocalDate.now();
            accArray[i] = acc;
            System.out.println("Thông tin Account " + i +
                    "    Email: " + accArray[i].email +
                    "    UserName: " + accArray[i].userName +
                    "    FullName: " + accArray[i].fullName +
                    "    CreateDate: " + accArray[i].createDate);

        }
    }

}
