package vn.com.vti.controller;

import vn.com.vti.entity.Account;
import vn.com.vti.service.IAccountService;

import java.util.ArrayList;
import java.util.List;

public class AcccountController {

    // thì gọi ddeesns thằng service
    private final IAccountService accountService;

    public AcccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public List<Account> getListAccounts() {
        // tạo 1 cái list mới
        List<Account> accounts = new ArrayList<>();
        try {
            accounts = accountService.getListAccounts();
        } catch (Exception e) {
            System.out.println("Lấy danh sách account không thành công " + e.getMessage());
        }
        return accounts;
    }
    //request đẩy lấy thông tin từ server lên giao diện cho người dùng
    public void creteAccounts(Account request) {
        try {
            accountService.creteAccount(request);
        } catch (Exception e) {
            System.out.println("Tạo mới phòng ban không thành công! " + e.getMessage());
        }
    }

    public void updateAccounts(Account request) {
        try {
            accountService.updateAccount(request);
        } catch (Exception e) {
            System.out.println("Chỉnh sửa phòng không thành công! " + e.getMessage());
        }
    }

    public void deleteAccounts(Account request) {
        try {
            accountService.deleteAccount(request);
        } catch (Exception e) {
            System.out.println("Xoá phòng không thành công! " + e.getMessage());
        }
    }
}
