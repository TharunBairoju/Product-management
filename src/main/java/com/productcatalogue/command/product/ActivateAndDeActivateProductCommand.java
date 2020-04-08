package com.productcatalogue.command.product;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogue.command.Command;
import com.productcatalogue.entity.Product;
import com.productcatalogue.repository.ProductRepository;
import com.productcatalogue.request.ActivateAndDeactivateRequest;
import com.productcatalogue.response.Response;
import com.productcatelogue.constants.CatalogueConstants;

@Service
public class ActivateAndDeActivateProductCommand implements Command<ActivateAndDeactivateRequest, Response>{

	private static final Logger logger = LoggerFactory.getLogger(ActivateAndDeActivateProductCommand.class);
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Response execute(ActivateAndDeactivateRequest request) {
		try {
			Optional<Product> optprod = productRepository.findById(request.getProductId());
			if(optprod.isPresent()) {
				Product product = optprod.get();
				product.setActive(request.isActive());
				productRepository.save(product);
				return new Response(CatalogueConstants.SUCCESS, "Product updated", product);
			}
		} catch (Exception e) {
			logger.error("Error while update product.. !"+e.getMessage());
		}
		return null;
	}

}
