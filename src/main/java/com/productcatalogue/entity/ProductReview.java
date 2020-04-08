/**
 * 
 */
package com.productcatalogue.entity;

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
@Table(name = "product_review")
public class ProductReview extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "review")
	private String review;
	
	@Column(name = "rating")
	private int rating;

	@Column(name = "testimonials")
	private String testimonials;

	@Column(name = "customer_id")
	private Long customerId;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Product.class)
	@JoinColumn(name = "product_id")
	private Product product;

	@Column(name = "headline")
	private String headline;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "video_url")
	private String videoUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTestimonials() {
		return testimonials;
	}

	public void setTestimonials(String testimonials) {
		this.testimonials = testimonials;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
