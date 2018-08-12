package com.springboot.springboottemplate.service;

import java.util.List;
import java.util.Optional;
import com.springboot.springboottemplate.entity.Currency;

public interface CurrencyService {

	public List<Currency> findWithCode(Optional<String> code);
}
