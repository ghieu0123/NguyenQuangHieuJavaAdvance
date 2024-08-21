package com.hieu.finalexamjavaadvance.service;

import com.hieu.finalexamjavaadvance.entity.OrderDetails;
import com.hieu.finalexamjavaadvance.entity.Orders;
import com.hieu.finalexamjavaadvance.entity.Users;
import com.hieu.finalexamjavaadvance.repository.IOrderDetailsRepository;
import com.hieu.finalexamjavaadvance.repository.IOrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrderService{

    @Autowired
    IOrdersRepository repository;

    @Autowired
    IOrderDetailsRepository ordersDetailsRepository;

    @Override
    public List<Orders> findAll() {
        return repository.findAll();
    }

    @Override
    public Orders findByUsers(Users user) {
        return repository.findByUser(user);
    }

    @Override
    public void createOrder(Orders order, OrderDetails orderDetails) {
        repository.save(order);
        ordersDetailsRepository.save(orderDetails);
    }
}
