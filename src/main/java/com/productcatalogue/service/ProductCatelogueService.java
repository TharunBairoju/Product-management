/**
 * 
 */
package com.productcatalogue.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.productcatalogue.entity.Brand;
import com.productcatalogue.entity.Product;
import com.productcatalogue.entity.ProductAsset;
import com.productcatalogue.entity.ProductCategory;
import com.productcatalogue.entity.ProductDesignSpecification;
import com.productcatalogue.entity.ProductPricing;
import com.productcatalogue.entity.ProductSpecification;
import com.productcatalogue.entity.ProductSubCategory;
import com.productcatalogue.entity.ProductWarrenty;
import com.productcatalogue.entity.Supplier;
import com.productcatalogue.entity.Unit;
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
import com.productcatalogue.request.ModifyProductRequest;

/**
 * Mar 28, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@Service
public class ProductCatelogueService {

	private static final Logger logger = LoggerFactory.getLogger(ProductCatelogueService.class);

	/**
	 * @param brandRepository
	 * @param request
	 */
	public void prepareProductBrand(BrandRepository brandRepository, AddProductRequest request, Product product) {
		try {
			Brand brand = brandRepository.findById(request.getBrandId()).get();
			if (brand != null) {
				product.setBrand(brand);
			}
		} catch (Exception e) {
			logger.error("Error while setting brand..!" + e.getMessage());
		}

	}

	/**
	 * @param supplierRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductSupplier(SupplierRepository supplierRepository, AddProductRequest request,
			Product product) {
		try {
			Supplier supplier = supplierRepository.findById(request.getSupplierId()).get();
			if (supplier != null) {
				supplierRepository.save(supplier);
				product.setSupplier(supplier);
			}
		} catch (Exception e) {
			logger.error("Error while setting supplier to product" + e.getMessage());
		}
	}

	/**
	 * @param productSpecificationRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductSpecification(ProductSpecificationRepository productSpecificationRepository,
			AddProductRequest request, Product product) {
		try {
			ProductSpecification specification = request.getProductSpecification();
			if (specification != null) {
				productSpecificationRepository.save(specification);
				product.setProductSpecification(specification);
			}
		} catch (Exception e) {
			logger.error("Error while setting spec to product " + e.getMessage());
		}

	}

	/**
	 * @param productDesignSpecificationRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductDesignSpecification(
			ProductDesignSpecificationRepository productDesignSpecificationRepository, AddProductRequest request,
			Product product) {
		try {
			ProductDesignSpecification designSpec = request.getProductDesignSpecification();
			if (designSpec != null) {
				productDesignSpecificationRepository.save(designSpec);
				product.setProductDesignSpecification(designSpec);
			}
		} catch (Exception e) {
			logger.error("Error while setting design spec to product" + e.getMessage());
		}
	}

	/**
	 * @param productAssetRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductAssets(ProductAssetRepository productAssetRepository, AddProductRequest request,
			Product product) {
		List<ProductAsset> assetList = request.getProductAssets();
		if (assetList != null && !assetList.isEmpty()) {
			for (ProductAsset productAsset : assetList) {
				productAssetRepository.save(productAsset);
			}
		}
	}

	/**
	 * @param productWarrentyRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductWarrenty(ProductWarrentyRepository productWarrentyRepository, AddProductRequest request,
			Product product) {
		try {
			ProductWarrenty warrenty = request.getProductWarrenty();
			if (warrenty != null) {
				productWarrentyRepository.save(warrenty);
				product.setProductWarrenty(warrenty);
			}
		} catch (Exception e) {
			logger.error("Error while setting warrenty to product" + e.getMessage());
		}
	}

	/**
	 * 
	 * @param productCategoryRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductCatagory(ProductCategoryRepository productCategoryRepository, AddProductRequest request,
			Product product) {
		try {
			ProductCategory category = productCategoryRepository.findById(request.getProductCategoryId()).get();
			if (category != null) {
				product.setProductCategory(category);
			}
		} catch (Exception e) {
			logger.error("Error while setting cat to product" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param productSubCategoryRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductSubCatagory(ProductSubCategoryRepository productSubCategoryRepository,
			AddProductRequest request, Product product) {
		try {
			ProductSubCategory category = productSubCategoryRepository.findById(request.getProductSubCategoryId())
					.get();
			if (category != null) {
				product.setProductSubCategory(category);
			}
		} catch (Exception e) {
			logger.error("Error while setting cat to product" + e.getMessage());
		}
	}

	/**
	 * 
	 * @param unitRepository
	 * @param request
	 * @param product
	 */
	public void prepareUnit(UnitRepository unitRepository, AddProductRequest request, Product product) {
		try {
			Unit unit = unitRepository.findById(request.getUnitId()).get();
			if (unit != null) {
				product.setUnit(unit);
			}
		} catch (Exception e) {
			logger.error("Error while setting unit to product" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param productPricingRepository
	 * @param request
	 * @param product
	 */
	public void prepareProductPricing(ProductPricingRepository productPricingRepository, AddProductRequest request,
			Product product) {
		try {
			ProductPricing pricing = request.getProductPricing();
			if (pricing != null) {
				productPricingRepository.save(pricing);
				product.setProductPricing(pricing);
			}
		} catch (Exception e) {
			logger.error("Error while setting price to product" + e.getMessage());
		}
	}

	/**
	 * 
	 * @param productRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProduct(ProductRepository productRepository, Product product,
			ModifyProductRequest request) {
		try {
			if (request.getColor() != null)
				product.setColor(request.getColor());

			if (request.getDescription() != null)
				product.setDescription(request.getDescription());

			if (request.getEan() != null)
				product.setEan(request.getEan());

			if (request.getIsbn() != null)
				product.setIsbn(request.getIsbn());

			if (request.getManufacturedDate() != null)
				product.setManufacturedDate(request.getManufacturedDate());

			if (request.getMpn() != null)
				product.setMpn(request.getMpn());

			if (request.getName() != null)
				product.setName(request.getName());

			if (request.getSku() != null)
				product.setSku(request.getSku());

			if (request.getUpc() != null)
				product.setUpc(request.getUpc());

			if (request.getWarrantyInfo() != null)
				product.setWarrantyInfo(request.getWarrantyInfo());

			logger.info("updating product completed..");

		} catch (Exception e) {
			logger.error("Error while updating product..!" + e.getMessage());
		}
	}

	/**
	 * 
	 * @param productPricingRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductPricing(ProductPricingRepository productPricingRepository, Product product,
			ModifyProductRequest request) {
		try {
			ProductPricing pricing = product.getProductPricing();

			if (pricing == null)
				pricing = new ProductPricing();

			ProductPricing requestPricing = request.getProductPricing();
			if (requestPricing != null) {

				if (requestPricing.getBasePrice() != null)
					pricing.setBasePrice(requestPricing.getBasePrice());

				if (requestPricing.getCreatedAt() != null)
					pricing.setCreatedAt(requestPricing.getCreatedAt());

				if (requestPricing.getCreatedBy() != null)
					pricing.setCreatedBy(requestPricing.getCreatedBy());

				if (requestPricing.getLastUpdatedAt() != null)
					pricing.setLastUpdatedAt(requestPricing.getLastUpdatedAt());

				if (requestPricing.getLastUpdatedBy() != null)
					pricing.setLastUpdatedBy(requestPricing.getLastUpdatedBy());

				productPricingRepository.save(pricing);
				product.setProductPricing(pricing);
			}

			logger.info("Updates for Product pricing is done..!");
		} catch (Exception e) {
			logger.error("Error while updating product pricing..!" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param productWarrentyRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductWarrenty(ProductWarrentyRepository productWarrentyRepository, Product product,
			ModifyProductRequest request) {
		try {
			ProductWarrenty warrenty = product.getProductWarrenty();
			ProductWarrenty requestWarrenty = request.getProductWarrenty();
			if (warrenty == null && requestWarrenty != null)
				warrenty = new ProductWarrenty();

			if (requestWarrenty != null) {
				if (requestWarrenty.getConsumables() != null)
					warrenty.setConsumables(requestWarrenty.getConsumables());
				if (requestWarrenty.getDeposit() != null)
					warrenty.setDeposit(requestWarrenty.getDeposit());
				if (requestWarrenty.getExtendedWarranty() != null)
					warrenty.setExtendedWarranty(requestWarrenty.getExtendedWarranty());
				if (requestWarrenty.getMonthly_AMC() != null)
					warrenty.setMonthly_AMC(requestWarrenty.getMonthly_AMC());
				if (requestWarrenty.getParts() != null)
					warrenty.setParts(requestWarrenty.getParts());
				if (requestWarrenty.getPeriodicalService() != null)
					warrenty.setPeriodicalService(requestWarrenty.getPeriodicalService());
				if (requestWarrenty.getPrice() != null)
					warrenty.setPrice(requestWarrenty.getPrice());
				if (requestWarrenty.getRelocationOnceInYear() != null)
					warrenty.setRelocationOnceInYear(requestWarrenty.getRelocationOnceInYear());
				if (requestWarrenty.getSanitization() != null)
					warrenty.setSanitization(requestWarrenty.getSanitization());
				if (requestWarrenty.getService() != null)
					warrenty.setService(requestWarrenty.getService());
				if (requestWarrenty.getWarranty() != null)
					warrenty.setWarranty(requestWarrenty.getWarranty());
				if (requestWarrenty.getYearly_AMC() != null)
					warrenty.setYearly_AMC(requestWarrenty.getYearly_AMC());
				productWarrentyRepository.save(warrenty);

				product.setProductWarrenty(warrenty);

				logger.info("updated product warrenty..!");
			}

		} catch (Exception e) {
			logger.error("Error while updating product warrenty..!" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param productAssetRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductAssets(ProductAssetRepository productAssetRepository, Product product,
			ModifyProductRequest request) {
		try {
			if (request.getProductAssets() != null && !request.getProductAssets().isEmpty()) {
				for (ProductAsset asset : request.getProductAssets()) {
					asset.setProduct(product);
					productAssetRepository.save(asset);
				}
				logger.info("Updated the product assets..!");
			}
		} catch (Exception e) {
			logger.error("Error while updating product asserts..!" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param unitRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductUnit(UnitRepository unitRepository, Product product,
			ModifyProductRequest request) {
		try {
			if (request.getUnitId() != null) {
				Unit unit = unitRepository.findById(request.getUnitId()).get();
				product.setUnit(unit);
			}
		} catch (Exception e) {
			logger.error("Error while updating product unit..!" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param brandRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnBrand(BrandRepository brandRepository, Product product, ModifyProductRequest request) {
		try {
			if (request.getBrandId() != null) {
				Brand brand = brandRepository.findById(request.getBrandId()).get();
				product.setBrand(brand);
			}
		} catch (Exception e) {
			logger.error("Error while updating product brand..!" + e.getMessage());
		}
	}

	/**
	 * 
	 * @param productSpecificationRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductSpecification(ProductSpecificationRepository productSpecificationRepository,
			Product product, ModifyProductRequest request) {
		try {

			ProductSpecification prodSpec = product.getProductSpecification();
			ProductSpecification reqProdSpec = request.getProductSpecification();

			if (reqProdSpec != null) {
				if (product.getProductSpecification() == null)
					prodSpec = new ProductSpecification();

				if (reqProdSpec.getActivatedCarbon() != null)
					prodSpec.setActivatedCarbon(reqProdSpec.getActivatedCarbon());

				if (reqProdSpec.getBackWash() != null)
					prodSpec.setBackWash(reqProdSpec.getBackWash());

				if (reqProdSpec.getBodyMaterial() != null)
					prodSpec.setBodyMaterial(reqProdSpec.getBodyMaterial());

				if (reqProdSpec.getBoosterPumpVoltage() != null)
					prodSpec.setBoosterPumpVoltage(reqProdSpec.getBoosterPumpVoltage());

				if (reqProdSpec.getCapacity() != null)
					prodSpec.setCapacity(reqProdSpec.getCapacity());

				if (reqProdSpec.getCreatedAt() != null)
					prodSpec.setCreatedAt(reqProdSpec.getCreatedAt());

				if (reqProdSpec.getCreatedBy() != null)
					prodSpec.setCreatedBy(reqProdSpec.getCreatedBy());

				if (reqProdSpec.getGavel() != null)
					prodSpec.setGavel(reqProdSpec.getGavel());

				if (reqProdSpec.getHeight() != null)
					prodSpec.setHeight(reqProdSpec.getHeight());

				if (reqProdSpec.getIntelWaterPressure() != null)
					prodSpec.setIntelWaterPressure(reqProdSpec.getIntelWaterPressure());

				if (reqProdSpec.getLastUpdatedAt() != null)
					prodSpec.setLastUpdatedAt(reqProdSpec.getLastUpdatedAt());

				if (reqProdSpec.getLastUpdatedBy() != null)
					prodSpec.setLastUpdatedBy(reqProdSpec.getLastUpdatedBy());

				if (reqProdSpec.getLength() != null)
					prodSpec.setLength(reqProdSpec.getLength());

				if (reqProdSpec.getMainsVoltage() != null)
					prodSpec.setMainsVoltage(reqProdSpec.getMainsVoltage());

				if (reqProdSpec.getMaterial() != null)
					prodSpec.setMaterial(reqProdSpec.getMaterial());

				if (reqProdSpec.getMembraneType() != null)
					prodSpec.setMembraneType(reqProdSpec.getMembraneType());

				if (reqProdSpec.getMounting() != null)
					prodSpec.setMounting(reqProdSpec.getMounting());

				if (reqProdSpec.getSelicaSand() != null)
					prodSpec.setSelicaSand(reqProdSpec.getSelicaSand());

				if (reqProdSpec.getStorageCapacity() != null)
					prodSpec.setStorageCapacity(reqProdSpec.getStorageCapacity());

				if (reqProdSpec.getWeight() != null)
					prodSpec.setWeight(reqProdSpec.getWeight());

				if (reqProdSpec.getHeight() != null)
					prodSpec.setHeight(reqProdSpec.getHeight());

				if (reqProdSpec.getWidth() != null)
					prodSpec.setWidth(reqProdSpec.getWidth());

				productSpecificationRepository.save(prodSpec);

				product.setProductSpecification(prodSpec);
				logger.info("Product spec updated..!");

			}
		} catch (Exception e) {
			logger.error("Error while updating product specification..!" + e.getMessage());
		}
	}

	/**
	 * 
	 * @param productCategoryRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductCategory(ProductCategoryRepository productCategoryRepository, Product product,
			ModifyProductRequest request) {
		try {
			if (request.getProductCategoryId() != null) {
				ProductCategory category = productCategoryRepository.findById(request.getProductCategoryId()).get();
				product.setProductCategory(category);
			}

		} catch (Exception e) {
			logger.error("Error while updating product category..!" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param supplierRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductSupplier(SupplierRepository supplierRepository, Product product,
			ModifyProductRequest request) {
		try {

			if (request.getSupplierId() != null) {
				Supplier supplier = supplierRepository.findById(request.getSupplierId()).get();
				product.setSupplier(supplier);
			}
		} catch (Exception e) {
			logger.error("Error while updating product supplier..!" + e.getMessage());
		}

	}

	/**
	 * 
	 * @param productDesignSpecificationRepository
	 * @param product
	 * @param request
	 */
	public void prepareUpdatesOnProductDesignSpecification(
			ProductDesignSpecificationRepository productDesignSpecificationRepository, Product product,
			ModifyProductRequest request) {
		try {
			ProductDesignSpecification designSpec = product.getProductDesignSpecification();
			ProductDesignSpecification reqDesignSpec = request.getProductDesignSpecification();
			if (reqDesignSpec != null) {
				if (designSpec == null)
					designSpec = new ProductDesignSpecification();

				if (reqDesignSpec.getAssemblyInstructions() != null)
					designSpec.setAssemblyInstructions(reqDesignSpec.getAssemblyInstructions());
				if (reqDesignSpec.getCreatedAt() != null)
					designSpec.setCreatedAt(reqDesignSpec.getCreatedAt());
				if (reqDesignSpec.getCreatedBy() != null)
					designSpec.setCreatedBy(reqDesignSpec.getCreatedBy());
				if (reqDesignSpec.getDesignerNotes() != null)
					designSpec.setDesignerNotes(reqDesignSpec.getDesignerNotes());
				if (reqDesignSpec.getLastUpdatedAt() != null)
					designSpec.setLastUpdatedAt(reqDesignSpec.getLastUpdatedAt());
				if (reqDesignSpec.getLastUpdatedBy() != null)
					designSpec.setLastUpdatedBy(reqDesignSpec.getLastUpdatedBy());

				productDesignSpecificationRepository.save(designSpec);
				product.setProductDesignSpecification(designSpec);

				logger.info("Updated design spec for product..!");
			}
		} catch (Exception e) {
			logger.error("Error while updating product design specification..!" + e.getMessage());
		}

	}

}
