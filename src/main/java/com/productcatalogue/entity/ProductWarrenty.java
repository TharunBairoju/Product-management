/**
 * 
 */
package com.productcatalogue.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Mar 27, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@Entity
@Table(name = "product_warrenty")
@JsonIgnoreProperties(value = { "product" })
public class ProductWarrenty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "warranty")
	private String warranty;

	@Column(name = "extended_warranty")
	private String extendedWarranty;

	@Column(name = "service")
	private String service;

	@Column(name = "periodical_service")
	private String periodicalService;

	@Column(name = "sanitization")
	private String sanitization;

	@Column(name = "consumables")
	private String consumables;

	@Column(name = "parts")
	private String parts;

	@Column(name = "relocation_once_in_year")
	private String relocationOnceInYear;

	@Column(name = "monthly_AMC")
	private String monthly_AMC;

	@Column(name = "yearly_AMC")
	private String yearly_AMC;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "deposit")
	private String deposit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getExtendedWarranty() {
		return extendedWarranty;
	}

	public void setExtendedWarranty(String extendedWarranty) {
		this.extendedWarranty = extendedWarranty;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getPeriodicalService() {
		return periodicalService;
	}

	public void setPeriodicalService(String periodicalService) {
		this.periodicalService = periodicalService;
	}

	public String getSanitization() {
		return sanitization;
	}

	public void setSanitization(String sanitization) {
		this.sanitization = sanitization;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}

	public String getRelocationOnceInYear() {
		return relocationOnceInYear;
	}

	public void setRelocationOnceInYear(String relocationOnceInYear) {
		this.relocationOnceInYear = relocationOnceInYear;
	}

	public String getMonthly_AMC() {
		return monthly_AMC;
	}

	public void setMonthly_AMC(String monthly_AMC) {
		this.monthly_AMC = monthly_AMC;
	}

	public String getYearly_AMC() {
		return yearly_AMC;
	}

	public void setYearly_AMC(String yearly_AMC) {
		this.yearly_AMC = yearly_AMC;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

}
