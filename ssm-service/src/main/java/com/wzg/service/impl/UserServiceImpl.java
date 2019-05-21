package com.wzg.service.impl;

import com.wzg.pojo.User;
import com.wzg.pojo.UserExample;
import com.wzg.service.UserService;
import com.wzg.service.base.BaseServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {


    public User getUserById(Integer id) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<User> userList=userMapper.selectByExample(userExample);

        if(userList!=null)
        {
            System.out.println("get data success111");
            System.out.println(userList.toString());
            System.out.println(userList.size());
            System.out.println(userList.get(0).getUsername());
            return userList.get(0);
        }
        System.out.println("get data fail");
        return null;
    }
    @Override
    public User login(String username, String password) {
        return null;
    }



    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
