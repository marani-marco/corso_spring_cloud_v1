package com.tapandget.warehousemanagementservice.repository;

import com.tapandget.warehousemanagementservice.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ProductRepository extends CrudRepository<Product, BigDecimal> {

    Product findByCode(String code);

}
