package com.tapandget.ordercreationservice.controller;

import com.tapandget.ordercreationservice.configuration.ConfigProperties;
import com.tapandget.ordercreationservice.entity.Order;
import com.tapandget.ordercreationservice.repository.OrderCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order-creation")
public class OrderCreationController {

    @Autowired
    OrderCreationRepository orderCreationRepository;

    @Autowired
    ConfigProperties configProperties;

    @PostMapping
    public void saveOrder(@RequestBody Order order){
        orderCreationRepository.save(order);
    }

    @GetMapping
    public String orarioMaxCreazione(){
        return configProperties.getMaximumTimeCreation();
    }

}
