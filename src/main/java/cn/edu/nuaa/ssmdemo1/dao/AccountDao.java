package cn.edu.nuaa.ssmdemo1.dao;

import cn.edu.nuaa.ssmdemo1.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    @Select("select * from account")
    public List<Account> findAll();
    @Insert("insert into account (name,money) value (#{name},#{money})")
    public void insertAccount(Account account);
    @Update("update account set name=#{name} money=#{money} where id = #{id}")
    public void UpdateAccount(Account account);
}
