package com.tapandget.ordermanagementservice.repository;
import com.tapandget.ordermanagementservice.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface OrderManagementRepository extends CrudRepository<Order, BigDecimal> {
}
