package com.mrhu.ssh.service;

import com.mrhu.ssh.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    boolean exist(User user);
    public List<User> getUserList();
}
