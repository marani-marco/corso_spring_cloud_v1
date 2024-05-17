package com.tapandget.ordercreationservice.repository;

import com.tapandget.ordercreationservice.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface OrderCreationRepository extends CrudRepository<Order, BigDecimal> {
}
