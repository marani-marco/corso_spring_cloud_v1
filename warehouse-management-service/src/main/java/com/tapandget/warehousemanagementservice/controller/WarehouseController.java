package com.tapandget.warehousemanagementservice.controller;

import com.tapandget.warehousemanagementservice.entity.Product;
import com.tapandget.warehousemanagementservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    Environment environment;

    @GetMapping("/search")
    public Product searchProductByCode(@RequestBody String code){
        return productRepository.findByCode(code);
    }

    @GetMapping("/{id}")
    public Product findyById(@PathVariable("id") BigDecimal id){

        Product product = productRepository.findById(id).orElse(null);
        product.setPort(environment.getProperty("local.server.port"));

        return product;
    }

}
