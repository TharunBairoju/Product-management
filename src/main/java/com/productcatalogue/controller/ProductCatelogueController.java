/**
 * 
 */
package com.productcatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalogue.command.product.ActivateAndDeActivateProductCommand;
import com.productcatalogue.command.product.AddProductCommand;
import com.productcatalogue.command.product.FetchAllProductsCommand;
import com.productcatalogue.command.product.ModifyProductCommand;
import com.productcatalogue.request.ActivateAndDeactivateRequest;
import com.productcatalogue.request.AddProductRequest;
import com.productcatalogue.request.ModifyProductRequest;
import com.productcatalogue.response.Response;
import com.productcatelogue.constants.CatalogueConstants;

/**
 * Mar 28, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@RestController
@RequestMapping(value = "/api/productcatelogue")
public class ProductCatelogueController {
	
	@Autowired
	AddProductCommand addProductCommand;
	
	@Autowired
	FetchAllProductsCommand fetchAllProductsCommand;
	
	@Autowired
	ActivateAndDeActivateProductCommand activateAndDeActivateProductCommand;
	
	@Autowired
	ModifyProductCommand modifyProductCommand;
	
	@RequestMapping(value = "/v1/add", method = RequestMethod.POST)
	public ResponseEntity<?> addProduct(@RequestBody AddProductRequest request){
		Response response =  addProductCommand.execute(request);
		if(response != null) {
			return ResponseEntity.status(200).body(response);
		}
		return ResponseEntity.status(500).body(new Response(CatalogueConstants.FAILED, "Failed to add product", null));
	}
	
	
	@RequestMapping(value = "/v1/fetchProducts", method = RequestMethod.GET)
	public ResponseEntity<?> getProducts(){
		Response response =  fetchAllProductsCommand.execute(null);
		if(response != null) {
			return ResponseEntity.status(200).body(response);
		}
		return ResponseEntity.status(500).body(new Response(CatalogueConstants.FAILED, "Failed to fetch products", null));
	}
	
	
	@RequestMapping(value = "/v1/activate/deactivate", method = RequestMethod.PUT)
	public ResponseEntity<?> activateDeactivateProducts(@RequestBody ActivateAndDeactivateRequest request){
		Response response =  activateAndDeActivateProductCommand.execute(request);
		if(response != null) {
			return ResponseEntity.status(200).body(response);
		}
		return ResponseEntity.status(500).body(new Response(CatalogueConstants.FAILED, "Failed to activate/deactive products", null));
	}
	
	
	@RequestMapping(value = "/v1/modify/product", method = RequestMethod.PUT)
	public ResponseEntity<?> modifyProduct(@RequestBody ModifyProductRequest request){
		Response response =  modifyProductCommand.execute(request);
		if(response != null) {
			return ResponseEntity.status(200).body(response);
		}
		return ResponseEntity.status(500).body(new Response(CatalogueConstants.FAILED, "Failed to update the product", null));
	}
	
	
	
	
}