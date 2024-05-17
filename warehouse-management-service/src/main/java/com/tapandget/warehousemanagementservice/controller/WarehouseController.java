package com.tapandget.warehousemanagementservice.controller;

import com.tapandget.warehousemanagementservice.entity.Product;
import com.tapandget.warehousemanagementservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/search")
    public Product searchProductByCode(@RequestBody String code){
        return productRepository.findByCode(code);
    }

}
