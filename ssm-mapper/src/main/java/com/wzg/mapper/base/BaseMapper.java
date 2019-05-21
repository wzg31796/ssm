package com.wzg.mapper.base;
import com.wzg.pojo.User;

public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    public void update(T t);

    public int insert(T t);
}
