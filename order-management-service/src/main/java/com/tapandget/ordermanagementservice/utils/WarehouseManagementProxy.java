package com.tapandget.ordermanagementservice.utils;

import com.tapandget.ordermanagementservice.bean.ProductBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name="warehouse-management-service")
@RibbonClient(name="warehouse-management-service")
public interface WarehouseManagementProxy {

    @GetMapping("/warehouse/{id}")
    public ProductBean findyById(@PathVariable("id") BigDecimal id);

}
