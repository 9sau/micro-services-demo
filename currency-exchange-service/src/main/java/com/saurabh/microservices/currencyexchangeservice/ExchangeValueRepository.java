package com.saurabh.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabh.microservices.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue findByFromAndTo(String from, String to);
}
