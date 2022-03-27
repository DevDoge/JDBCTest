package com.lucas.jdbctest;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucas.jdbctest.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
