package com.example.repositories;

import com.example.bean.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findByName(String name);
}
