package com.productcatalogue.request;

import java.util.Date;
import java.util.List;

import com.productcatalogue.entity.ProductAsset;
import com.productcatalogue.entity.ProductDesignSpecification;
import com.productcatalogue.entity.ProductPricing;
import com.productcatalogue.entity.ProductSpecification;
import com.productcatalogue.entity.ProductWarrenty;

public class ModifyProductRequest {

	private Long productId;
	private String name;
	private String description;
	private String sku;
	private String upc;
	private String ean;
	private String mpn;
	private String isbn;
	private String warrantyInfo;
	private boolean active;
	private Date manufacturedDate;
	private boolean available;
	private String color;
	private Long brandId;
	private Long supplierId;
	private Long unitId;
	private Long productSubCategoryId;
	private Long productCategoryId;
	private ProductWarrenty productWarrenty;
	private ProductSpecification productSpecification;
	private List<ProductAsset> productAssets;
	private ProductDesignSpecification productDesignSpecification;
	private ProductPricing productPricing;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public Long getProductSubCategoryId() {
		return productSubCategoryId;
	}

	public void setProductSubCategoryId(Long productSubCategoryId) {
		this.productSubCategoryId = productSubCategoryId;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public ProductWarrenty getProductWarrenty() {
		return productWarrenty;
	}

	public void setProductWarrenty(ProductWarrenty productWarrenty) {
		this.productWarrenty = productWarrenty;
	}

	public ProductSpecification getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(ProductSpecification productSpecification) {
		this.productSpecification = productSpecification;
	}

	public List<ProductAsset> getProductAssets() {
		return productAssets;
	}

	public void setProductAssets(List<ProductAsset> productAssets) {
		this.productAssets = productAssets;
	}

	public ProductDesignSpecification getProductDesignSpecification() {
		return productDesignSpecification;
	}

	public void setProductDesignSpecification(ProductDesignSpecification productDesignSpecification) {
		this.productDesignSpecification = productDesignSpecification;
	}

	public ProductPricing getProductPricing() {
		return productPricing;
	}

	public void setProductPricing(ProductPricing productPricing) {
		this.productPricing = productPricing;
	}

}
