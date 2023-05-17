package com.fatma.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatma.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}
