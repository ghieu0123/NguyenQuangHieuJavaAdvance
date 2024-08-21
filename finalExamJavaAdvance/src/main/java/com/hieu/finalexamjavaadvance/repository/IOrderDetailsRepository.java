package com.hieu.finalexamjavaadvance.repository;

import com.hieu.finalexamjavaadvance.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}