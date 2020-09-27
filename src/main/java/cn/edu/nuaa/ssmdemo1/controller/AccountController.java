package cn.edu.nuaa.ssmdemo1.controller;

import cn.edu.nuaa.ssmdemo1.domain.Account;
import cn.edu.nuaa.ssmdemo1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/findAll")
    public String testFindAll(Model model){
        System.out.println("AccountController...");
        List<Account> accountList = accountService.findAll();
        for (Account a:accountList) {
            System.out.println(a);
        }
        model.addAttribute("list", accountList);
        return "success";
    }
    @RequestMapping("/addAccount")
    public String addAccount(Account account){
        System.out.println("AccountController.addAccount...");
        accountService.insertAccount(account);
        return "success";
    }
}
