package com.tapandget.warehousemanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WarehouseManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseManagementServiceApplication.class, args);
	}

}
