package com.hieu.finalexamjavaadvance.repository;

import com.hieu.finalexamjavaadvance.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);
}
