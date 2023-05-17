package com.fatma.users.service;

import java.util.List;

import com.fatma.users.entities.Role;
import com.fatma.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List<User> findAllUsers();
}

