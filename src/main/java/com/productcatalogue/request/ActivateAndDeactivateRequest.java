package com.productcatalogue.request;

public class ActivateAndDeactivateRequest {

	private Long productId;
	private boolean active;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
