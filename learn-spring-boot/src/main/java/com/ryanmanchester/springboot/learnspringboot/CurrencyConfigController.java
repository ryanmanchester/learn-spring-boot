package com.ryanmanchester.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
	
	@Autowired
	private CurrencyServiceConfig config;
	
	
	@RequestMapping("/currency-config")
	public CurrencyServiceConfig retrieveCurrencies() {
		return config;
	}
}
