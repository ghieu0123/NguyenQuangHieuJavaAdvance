package com.hieu.demojpa.service;

import com.hieu.demojpa.entity.OrderDetails;
import com.hieu.demojpa.entity.Orders;
import com.hieu.demojpa.entity.Users;

import java.util.List;

public interface IOrderService {
    public List<Orders> findAll();

    public Orders findByUsers(Users user);

    public void createOrder(Orders order, OrderDetails orderDetails);
}
