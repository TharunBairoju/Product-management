package com.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalogue.entity.ProductPricing;

@Repository
public interface ProductPricingRepository extends JpaRepository<ProductPricing, Long> {

}
