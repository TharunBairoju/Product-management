/**
 * 
 */
package com.productcatalogue.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Mar 27, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "last_updated_at")
	private Date lastUpdatedAt;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
