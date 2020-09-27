package cn.edu.nuaa.ssmdemo1.test;

import cn.edu.nuaa.ssmdemo1.dao.AccountDao;
import cn.edu.nuaa.ssmdemo1.domain.Account;
import cn.edu.nuaa.ssmdemo1.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestClass {
    @Test
    public void testService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.findAll();
    }
    @Test
    public void testSqlMap() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("ddd");
        account.setMoney(2000);
        accountDao.insertAccount(account);
        List<Account> accountList = accountDao.findAll();
        for (Account a:accountList) {
            System.out.println(a);
        }
        sqlSession.commit();//提交事务
        sqlSession.close();
        in.close();
    }


}
