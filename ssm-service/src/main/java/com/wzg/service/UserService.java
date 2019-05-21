package com.wzg.service;

import com.wzg.pojo.User;

public interface UserService {

    //特有的方法
    public User login(String username, String password);

    public User getUserById(Integer id);
}
