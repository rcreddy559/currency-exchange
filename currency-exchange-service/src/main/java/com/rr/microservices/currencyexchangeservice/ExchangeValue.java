package com.rr.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;

	@Column(name = "currency_from")
	private String to;

	@Column(name = "currency_to")
	private String from;
	private BigDecimal conversionMulitple;
	private Integer port;

	protected ExchangeValue() {
	}

	public ExchangeValue(Long id, String to, String from, BigDecimal conversionMulitple) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.conversionMulitple = conversionMulitple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public BigDecimal getConversionMulitple() {
		return conversionMulitple;
	}

	public void setConversionMulitple(BigDecimal conversionMulitple) {
		this.conversionMulitple = conversionMulitple;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
