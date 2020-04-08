/**
 * 
 */
package com.productcatalogue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalogue.entity.Product;

/**
 * Mar 28, 2020
 *
 *	@author Tharunkumar Bairoju
 * 
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByActive(boolean b);

}
