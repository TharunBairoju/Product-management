/**
 * 
 */
package com.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalogue.entity.ProductReview;

/**
 * Mar 28, 2020
 *
 *	@author Tharunkumar Bairoju
 * 
 */
@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview, Long>{

}
