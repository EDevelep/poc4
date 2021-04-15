package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
@FeignClient(name="praveen-flipkart-billing-service" )
public interface FeignBillingServiceProxy {
	@PostMapping("/rest/billingservice/billingorder")
	public String createOrder(String orderid);
}
