package vn.com.vti.service.imp;

import vn.com.vti.entity.Account;
import vn.com.vti.repository.AccountRepository;
import vn.com.vti.service.IAccountService;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements IAccountService {

    // thì gọi đến thằng repository
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getListAccounts() throws SQLException {
        return accountRepository.getListAccounts();
    }

    @Override
    public void creteAccount(Account request) throws SQLException {
        int result = accountRepository.creteAccount(request);
        if (result > 0) {
            System.out.println("Thêm mới dữ liệu thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }

    @Override
    public void updateAccount(Account request) throws SQLException {
        int result = accountRepository.updateAccount(request);
        if (result > 0) {
            System.out.println("Chỉnh sửa dữ liệu thành công");
        } else {
            throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
        }
    }

    @Override
    public void deleteAccount(Account request) throws SQLException {

        int result = accountRepository.deleteAccount(request);
        if (result > 0) {
            System.out.println("Xoá dữ liệu thành công");
        } else {
            throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
        }
    }

//    @Override
//    public void createAccount(Account request) throws SQLException {
//
//    }
//
//    @Override
//    public void updateAccount(Account request) throws SQLException {
//
//    }
//
//    @Override
//    public void deleteAccount(Account request) throws SQLException {
//
//    }
}
