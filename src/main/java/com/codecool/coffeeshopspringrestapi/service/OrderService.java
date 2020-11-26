package com.codecool.coffeeshopspringrestapi.service;

import com.codecool.coffeeshopspringrestapi.model.Order;
import com.codecool.coffeeshopspringrestapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;


@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        List<Order> orders = orderRepository.findAll();
        orders.sort(Comparator.comparing(Order::getId));

        return orders;
    }

    public ResponseEntity<Order> getOrder(Long id) {
        return orderRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }


    public void deleteOrder(long id) {
        orderRepository.deleteById(id);
    }
}