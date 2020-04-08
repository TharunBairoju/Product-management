/**
 * 
 */
package com.productcatalogue.request;

import java.util.List;

import com.productcatalogue.entity.Product;
import com.productcatalogue.entity.ProductAsset;
import com.productcatalogue.entity.ProductDesignSpecification;
import com.productcatalogue.entity.ProductPricing;
import com.productcatalogue.entity.ProductSpecification;
import com.productcatalogue.entity.ProductWarrenty;

/**
 * Mar 28, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
public class AddProductRequest {

	private Product product;
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

	public ProductPricing getProductPricing() {
		return productPricing;
	}

	public void setProductPricing(ProductPricing productPricing) {
		this.productPricing = productPricing;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

}
