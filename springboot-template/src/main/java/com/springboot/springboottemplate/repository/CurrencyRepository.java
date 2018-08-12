package com.springboot.springboottemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springboot.springboottemplate.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency,String>,JpaSpecificationExecutor<Currency>{

}
