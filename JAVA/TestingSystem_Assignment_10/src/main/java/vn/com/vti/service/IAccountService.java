package vn.com.vti.service;

import vn.com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;
public interface IAccountService {
        List<Account> getListAccounts() throws SQLException;

        void creteAccount(Account request) throws SQLException;

        void updateAccount(Account request) throws SQLException;

        void deleteAccount(Account request) throws SQLException;

}
