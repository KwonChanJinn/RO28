package frontend;

import entyti.account;

import java.util.ArrayList;

public class program10 {
    public static void main(String[] args) {
        program10 p = new program10();
        p.question9();
    }

    public void question9() {
        System.out.println("Nhập thông tin account");
        account[] accounts = new account[10];
        ArrayList<account> accountArrayList;
        for (int i = 0; i < 4; i++) {
            accounts[i] = new account();
            accountArrayList = new ArrayList<account>();
            accountArrayList.add(accounts[i]);
            for (account account : accountArrayList) {
                System.out.println(account);
            }
        }

    }
}
