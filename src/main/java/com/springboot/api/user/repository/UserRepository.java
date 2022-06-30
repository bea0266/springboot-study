package com.springboot.api.user.repository;

import com.springboot.api.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {
}
