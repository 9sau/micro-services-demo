package com.saurabh.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.microservices.currencyexchangeservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue value = exchangeValueRepository.findByFromAndTo(from, to);
		//ExchangeValue value = new ExchangeValue(1001L, from, to, BigDecimal.valueOf(65));
		value.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return value;
	}
}
