package com.productcatalogue.command.product;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.productcatalogue.request.ModifyProductRequest;
import com.productcatalogue.response.Response;
import com.productcatalogue.service.ProductCatelogueService;

@Service
public class ModifyProductCommand implements Command<ModifyProductRequest, Response> {

	private static final Logger logger = LoggerFactory.getLogger(ModifyProductCommand.class);

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
	public Response execute(ModifyProductRequest request) {
		try {
			Product product = null;
			if (request.getProductId() != null) {
				Optional<Product> optProd = productRepository.findById(request.getProductId());
				product = optProd.get();
				if (optProd.isPresent()) {
					productCatelogueService.prepareUpdatesOnProduct(productRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductPricing(productPricingRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductWarrenty(productWarrentyRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductAssets(productAssetRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductUnit(unitRepository, product, request);
					productCatelogueService.prepareUpdatesOnBrand(brandRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductSpecification(productSpecificationRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductCategory(productCategoryRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductSupplier(supplierRepository, product, request);
					productCatelogueService.prepareUpdatesOnProductDesignSpecification(productDesignSpecificationRepository, product, request);
				}
				productRepository.save(product);
			}
			return new Response("SUCCESS", "Product details modified", product);
		} catch (Exception e) {
			logger.error("Error while updating product details..!");
		}
		return null;
	}
}
