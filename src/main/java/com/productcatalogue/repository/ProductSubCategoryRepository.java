/**
 * 
 */
package com.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalogue.entity.ProductSubCategory;

/**
 * Mar 28, 2020
 *
 *	@author Tharunkumar Bairoju
 * 
 */
@Repository
public interface ProductSubCategoryRepository extends JpaRepository<ProductSubCategory, Long>{

}
