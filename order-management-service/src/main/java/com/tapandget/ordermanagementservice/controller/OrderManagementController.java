package com.tapandget.ordermanagementservice.controller;

import com.tapandget.ordermanagementservice.bean.ProductBean;
import com.tapandget.ordermanagementservice.dto.OrderDTO;
import com.tapandget.ordermanagementservice.entity.Order;
import com.tapandget.ordermanagementservice.repository.OrderManagementRepository;
import com.tapandget.ordermanagementservice.utils.WarehouseManagementProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path="/order-management")
public class OrderManagementController {

    private static Logger logger = LoggerFactory.getLogger(OrderManagementController.class);

    @Autowired
    OrderManagementRepository orderManagementRepository;

    @Autowired
    WarehouseManagementProxy warehouseManagementProxy;

    @GetMapping(path="/{id}")
    public OrderDTO findOrderById(@PathVariable("id") Long id){

        logger.info("Start findOrderById service");

        Order order = orderManagementRepository.findById(new BigDecimal(id)).orElse(null);

        if(order != null){
            logger.info("Found order with id " + id);
            logger.info("Searching for product with id " + order.getProductId());

            ProductBean productBean = warehouseManagementProxy.findyById(order.getProductId());

            OrderDTO response = new OrderDTO();
            response.setId(order.getId());
            response.setQuantity(order.getQuantity());
            response.setStatus(order.getStatus());
            response.setCodeProduct(productBean.getCode());
            response.setShortDescriptionProduct(productBean.getShortDescription());
            response.setPortWMSInUse(productBean.getPort());

            return response;


        } else
            return new OrderDTO();


    }

}
