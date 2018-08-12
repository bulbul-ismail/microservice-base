package com.springboot.springboottemplate.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency implements Serializable{

	private static final long serialVersionUID = 3483123751223172209L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int currencyType;
    private String selling;
    private String buying;
    private String update_date;
    private String change_rate;
    private String name;
    private String full_name;
    private String code;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCurrency() {
		return currencyType;
	}

	public void setCurrency(int currency) {
		this.currencyType = currency;
	}

	public String getSelling() {
		return selling;
	}

	public void setSelling(String selling) {
		this.selling = selling;
	}

	public String getBuying() {
		return buying;
	}

	public void setBuying(String buying) {
		this.buying = buying;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getChange_rate() {
		return change_rate;
	}

	public void setChange_rate(String change_rate) {
		this.change_rate = change_rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

    
}
