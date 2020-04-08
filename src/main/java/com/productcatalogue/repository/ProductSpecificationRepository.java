/**
 * 
 */
package com.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalogue.entity.ProductSpecification;

/**
 * Mar 28, 2020
 *
 *	@author Tharunkumar Bairoju
 * 
 */
@Repository
public interface ProductSpecificationRepository extends JpaRepository<ProductSpecification, Long>{

}
