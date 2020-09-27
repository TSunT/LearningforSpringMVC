package cn.edu.nuaa.ssmdemo1.service;

import cn.edu.nuaa.ssmdemo1.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void insertAccount(Account account);
    public Boolean UpdateAccount(Account account);
}
