/**
 * 
 */
package com.productcatalogue.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Mar 27, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@Entity
@Table(name = "product")
public class Product extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "sku")
	private String sku;

	@Column(name = "upc")
	private String upc;

	@Column(name = "ean")
	private String ean;

	@Column(name = "mpn")
	private String mpn;

	@Column(name = "isbn")
	private String isbn;

	@Column(name = "warranty_info")
	private String warrantyInfo;

	@Column(name = "is_active")
	private boolean active;

	@Column(name = "manufactured_date")
	private Date manufacturedDate;

	@Column(name = "available")
	private boolean available;

	@Column(name = "color")
	private String color;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Brand.class)
	@JoinColumn(name = "brand_id", nullable = true)
	private Brand brand;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Supplier.class)
	@JoinColumn(name = "supplier_id", nullable = true)
	private Supplier supplier;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Unit.class)
	@JoinColumn(name = "unit_id", nullable = true)
	private Unit unit;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductCategory.class)
	@JoinColumn(name = "product_category_id", nullable = true)
	private ProductCategory productCategory;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductSubCategory.class)
	@JoinColumn(name = "product_sub_category_id", nullable = true)
	private ProductSubCategory productSubCategory;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductSpecification.class)
	@JoinColumn(name = "product_specification_id", nullable = true)
	private ProductSpecification productSpecification;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductDesignSpecification.class)
	@JoinColumn(name = "product_design_specification_id", nullable = true)
	private ProductDesignSpecification productDesignSpecification;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductWarrenty.class)
	@JoinColumn(name = "product_warrenty_id", nullable = true)
	private ProductWarrenty productWarrenty;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductPricing.class)
	@JoinColumn(name = "product_pricing_id", nullable = true)
	private ProductPricing productPricing;

	public ProductPricing getProductPricing() {
		return productPricing;
	}

	public void setProductPricing(ProductPricing productPricing) {
		this.productPricing = productPricing;
	}

	public ProductWarrenty getProductWarrenty() {
		return productWarrenty;
	}

	public void setProductWarrenty(ProductWarrenty productWarrenty) {
		this.productWarrenty = productWarrenty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getWarrantyInfo() {
		return warrantyInfo;
	}

	public void setWarrantyInfo(String warrantyInfo) {
		this.warrantyInfo = warrantyInfo;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ProductSpecification getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(ProductSpecification productSpecification) {
		this.productSpecification = productSpecification;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public ProductSubCategory getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(ProductSubCategory productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public ProductDesignSpecification getProductDesignSpecification() {
		return productDesignSpecification;
	}

	public void setProductDesignSpecification(ProductDesignSpecification productDesignSpecification) {
		this.productDesignSpecification = productDesignSpecification;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

}
