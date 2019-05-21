package com.wzg.service.base;

public interface BaseService <T> {

    public T findByUUID(String uuid);
    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);
    public void update(T t);
    public void insert(T t);
}
