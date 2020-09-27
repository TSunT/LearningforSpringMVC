package cn.edu.nuaa.ssmdemo1.service.impl;

import cn.edu.nuaa.ssmdemo1.dao.AccountDao;
import cn.edu.nuaa.ssmdemo1.domain.Account;
import cn.edu.nuaa.ssmdemo1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        System.out.println("AccountService.findAll...");
        return accountDao.findAll();
    }

    @Override
    public void insertAccount(Account account) {
        accountDao.insertAccount(account);
    }

    @Override
    public Boolean UpdateAccount(Account account) {
        return null;
    }
}
