package com.hieu.finalexamjavaadvance.service;

import com.hieu.finalexamjavaadvance.entity.OrderDetails;
import com.hieu.finalexamjavaadvance.entity.Orders;
import com.hieu.finalexamjavaadvance.entity.Users;

import java.util.List;

public interface IOrderService {
    public List<Orders> findAll();

    public Orders findByUsers(Users user);

    public void createOrder(Orders order, OrderDetails orderDetails);
}
