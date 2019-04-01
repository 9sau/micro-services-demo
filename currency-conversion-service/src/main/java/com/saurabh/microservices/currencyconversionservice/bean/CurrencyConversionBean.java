package com.saurabh.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private BigDecimal quantity;
	private BigDecimal amount;
	private int port;

	public CurrencyConversionBean() {

	}

	public CurrencyConversionBean(long id, String from, String to, BigDecimal conversionFactor, BigDecimal quantity,
			BigDecimal amount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.quantity = quantity;
		this.amount = amount;
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
