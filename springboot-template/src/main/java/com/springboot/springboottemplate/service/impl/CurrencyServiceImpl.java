package com.springboot.springboottemplate.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.springboottemplate.entity.Currency;
import com.springboot.springboottemplate.repository.CurrencyRepository;
import com.springboot.springboottemplate.service.CurrencyService;
import com.springboot.springboottemplate.spec.CurrencySpecification;

@Service
public class CurrencyServiceImpl implements CurrencyService{

	private CurrencyRepository currencyRepository;
	
	@Autowired
	public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
		this.currencyRepository = currencyRepository;
	};
	
	@Override
	public List<Currency> findWithCode(Optional<String> code) {
		return currencyRepository.findAll(CurrencySpecification.matchesCode(code));
	}

}
