package com.springboot.springboottemplate.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.springboottemplate.entity.Currency;
import com.springboot.springboottemplate.service.CurrencyService;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class CurrencyController {

	private CurrencyService currencyService;

	@Autowired
	public void setCurrencyService(CurrencyService currencyService) {
		this.currencyService = currencyService;
	}

	@RequestMapping(value = "/currencies", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("Returns Currency data with given CODE parameter.")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "code", value = "Currency's code", required = false, dataType = "string", paramType = "query"), })
	public List<Currency> currencies(

			@RequestParam(value = "code", required = false) Optional<String> code) {

		return currencyService.findWithCode(code);
	}
}
