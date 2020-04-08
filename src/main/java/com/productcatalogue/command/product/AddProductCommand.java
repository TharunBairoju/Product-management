/**
 * 
 */
package com.productcatalogue.command.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogue.command.Command;
import com.productcatalogue.entity.Product;
import com.productcatalogue.repository.BrandRepository;
import com.productcatalogue.repository.ProductAssetRepository;
import com.productcatalogue.repository.ProductCategoryRepository;
import com.productcatalogue.repository.ProductDesignSpecificationRepository;
import com.productcatalogue.repository.ProductPricingRepository;
import com.productcatalogue.repository.ProductRepository;
import com.productcatalogue.repository.ProductSpecificationRepository;
import com.productcatalogue.repository.ProductSubCategoryRepository;
import com.productcatalogue.repository.ProductWarrentyRepository;
import com.productcatalogue.repository.SupplierRepository;
import com.productcatalogue.repository.UnitRepository;
import com.productcatalogue.request.AddProductRequest;
import com.productcatalogue.response.Response;
import com.productcatalogue.service.ProductCatelogueService;
import com.productcatelogue.constants.CatalogueConstants;

/**
 * Mar 28, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@Service
public class AddProductCommand implements Command<AddProductRequest, Response> {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Autowired
	BrandRepository brandRepository;

	@Autowired
	ProductDesignSpecificationRepository productDesignSpecificationRepository;

	@Autowired
	ProductSubCategoryRepository productSubCategoryRepository;
	
	@Autowired
	ProductSpecificationRepository productSpecificationRepository;

	@Autowired
	SupplierRepository supplierRepository;

	@Autowired
	UnitRepository unitRepository;

	@Autowired
	ProductWarrentyRepository productWarrentyRepository;

	@Autowired
	ProductAssetRepository productAssetRepository;
	
	@Autowired
	ProductPricingRepository productPricingRepository;
	
	@Autowired
	ProductCatelogueService productCatelogueService;

	@Override
	public Response execute(AddProductRequest request) {
		Response response = new Response();
		try {
			Product product = request.getProduct();
			if (product != null) {
				productCatelogueService.prepareProductBrand(brandRepository, request, product);
				productCatelogueService.prepareProductSupplier(supplierRepository, request, product);
				productCatelogueService.prepareProductCatagory(productCategoryRepository, request, product);
				productCatelogueService.prepareProductSubCatagory(productSubCategoryRepository, request, product);
				productCatelogueService.prepareUnit(unitRepository, request, product);
				productCatelogueService.prepareProductSpecification(productSpecificationRepository, request, product);
				productCatelogueService.prepareProductDesignSpecification(productDesignSpecificationRepository, request, product);
				productCatelogueService.prepareProductAssets(productAssetRepository, request, product);
				productCatelogueService.prepareProductWarrenty(productWarrentyRepository, request, product);
				productCatelogueService.prepareProductPricing(productPricingRepository, request, product);
				productRepository.save(product);
				response.setStatus(CatalogueConstants.SUCCESS);
				response.setMessage("Product added successfully..!");
				response.setBody(product);
				return response;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
