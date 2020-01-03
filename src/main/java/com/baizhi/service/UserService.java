package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //查所有
    public List<User> queryAllUser();

    //查一个
    public User queryOne();

    //添加
    public void addUser(User user);

    //删除
    public void delete(int id);

    //修改
    public void update(int id);
}
