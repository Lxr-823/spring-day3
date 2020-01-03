package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    //查一个
    public User selectId(int id);

    //查所有
    public List<User> queryAll();

    //添加
    public void addUser(User user);

    //删除
    public void delete(int id);

    //修改
    public void update(User user);

}
