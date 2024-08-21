package com.hieu.finalexamjavaadvance.repository;

import com.hieu.finalexamjavaadvance.entity.Orders;
import com.hieu.finalexamjavaadvance.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepository extends JpaRepository<Orders, Long> {
    public Orders findByUser(Users users);
}