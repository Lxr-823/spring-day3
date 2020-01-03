package com.baizhi;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    //查所有
    @Test
    public void test1() {
        ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) cxc.getBean("userDao");
        List<User> users = userDao.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    //查一个
    @Test
    public void test2() {
        ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) spring.getBean("userDao");
        User user = userDao.selectId(1);
        System.out.println(user);
    }

    //添加
    @Test
    public void test3() {
        ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) cxc.getBean("userDao");
        userDao.addUser(new User(4, "eee", "rrrr"));
        System.out.println("添加成功");
    }

    //删除
    @Test
    public void test4() {
        ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) cxc.getBean("userDao");
        userDao.delete(4);
        System.out.println("删除成功");
    }

    //修改
    @Test
    public void test5() {
        ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) cxc.getBean("userDao");
        userDao.update(new User(4, "rrr", "66666"));
        System.out.println("修改成功");
    }
}
