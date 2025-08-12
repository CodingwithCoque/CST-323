package com.gamehub.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gamehub.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
