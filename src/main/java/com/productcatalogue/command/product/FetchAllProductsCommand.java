/**
 * 
 */
package com.productcatalogue.command.product;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogue.command.Command;
import com.productcatalogue.entity.Product;
import com.productcatalogue.repository.ProductRepository;
import com.productcatalogue.response.Response;
import com.productcatelogue.constants.CatalogueConstants;

/**
 * Mar 29, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@Service
public class FetchAllProductsCommand implements Command<Long, Response> {
	
	public static final Logger logger = LoggerFactory.getLogger(FetchAllProductsCommand.class);
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Response execute(Long request) {
		try {
			List<Product> products = productRepository.findAllByActive(true);
			return new Response(CatalogueConstants.SUCCESS, "Fetched products successfully", products);
		} catch (Exception e) {
			logger.error("Error while fetching products..!"+e.getMessage());
		}
		return null;
	}

}
