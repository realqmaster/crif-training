package it.euris.sample.forex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.euris.sample.forex.entity.ExchangeValue;
import it.euris.sample.forex.repository.ExchangeValueRepository;

@RestController
public class ForexController /*extends MyErrorController*/{

	@Autowired
	private ExchangeValueRepository repository;
	
	
	@GetMapping("/currency-exchange")
	//visualizzo tutti i cambi che ho a disposizione. path di default come "pagina principale"
	public List<ExchangeValue> sowAllExchangeValue() {
		
		List<ExchangeValue> exchangeValue = repository.findAll();
		
		return exchangeValue;
	}
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	//visualizzo il cambio tra due valute prese in input
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		
		return exchangeValue;
	}	
	

	
}