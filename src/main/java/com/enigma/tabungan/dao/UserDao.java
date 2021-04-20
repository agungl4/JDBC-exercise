package com.enigma.tabungan.dao;

import com.enigma.tabungan.entity.User;

public interface UserDao {
    public String addNewUser(User user);
    public User findUserById(Integer id);
}
