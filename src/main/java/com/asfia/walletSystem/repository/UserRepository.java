package com.asfia.walletSystem.repository;

import com.asfia.walletSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String Email);
    boolean existsByEmail(String email);
}
