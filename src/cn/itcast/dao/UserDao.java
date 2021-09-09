package cn.itcast.dao;

import cn.itcast.domin.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
