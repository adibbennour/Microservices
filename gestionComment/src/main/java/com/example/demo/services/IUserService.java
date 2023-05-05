package com.example.demo.services;

import com.example.demo.entities.User;

import java.util.List;

public interface IUserService {

    User getUser(Long id);

    List<User> getUsers();

    public User addUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

    User getUserByUsername(String username);

    User getUserByEmail(String email);
}
