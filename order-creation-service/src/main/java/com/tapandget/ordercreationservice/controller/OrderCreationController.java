package com.tapandget.ordercreationservice.controller;

import com.tapandget.ordercreationservice.entity.Order;
import com.tapandget.ordercreationservice.repository.OrderCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-creation")
public class OrderCreationController {

    @Autowired
    OrderCreationRepository orderCreationRepository;

    @PostMapping
    public void saveOrder(@RequestBody Order order){
        orderCreationRepository.save(order);
    }

}
