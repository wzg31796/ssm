package com.wzg.service.base;

import com.wzg.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
