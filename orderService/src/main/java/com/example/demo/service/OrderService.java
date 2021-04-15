package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Order;

@Service
public class OrderService {
  @Autowired
	private OrderDao orderDao;
  
  
  public void saveOrder(Order order) {
	  orderDao.save(order);
  }
}
