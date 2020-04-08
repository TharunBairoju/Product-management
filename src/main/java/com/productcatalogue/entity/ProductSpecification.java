/**
 * 
 */
package com.productcatalogue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mar 27, 2020
 *
 * @author Tharunkumar Bairoju
 * 
 */
@Entity
@Table(name = "product_specification")
public class ProductSpecification extends BaseEntity{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "length")
	private Long length;

	@Column(name = "width")
	private Long width;

	@Column(name = "height")
	private Long height;

	@Column(name = "weight")
	private Long weight;

	@Column(name = "material")
	private String material;

	@Column(name = "capacity")
	private Long capacity;

	@Column(name = "body_material")
	private String bodyMaterial;

	@Column(name = "intel_water_pressure")
	private String intelWaterPressure;

	@Column(name = "storage_capacity")
	private Long storageCapacity;

	@Column(name = "membrane_type")
	private String membraneType;

	@Column(name = "booster_pump_voltage")
	private Long boosterPumpVoltage;

	@Column(name = "mains_voltage")
	private Long mainsVoltage;

	@Column(name = "mounting")
	private String mounting;

	@Column(name = "backwash")
	private String backWash;

	@Column(name = "activated_carbon")
	private String activatedCarbon;

	@Column(name = "selica_sand")
	private String selicaSand;

	@Column(name = "gavel")
	private String gavel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public Long getWidth() {
		return width;
	}

	public void setWidth(Long width) {
		this.width = width;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Long getCapacity() {
		return capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public String getBodyMaterial() {
		return bodyMaterial;
	}

	public void setBodyMaterial(String bodyMaterial) {
		this.bodyMaterial = bodyMaterial;
	}

	public String getIntelWaterPressure() {
		return intelWaterPressure;
	}

	public void setIntelWaterPressure(String intelWaterPressure) {
		this.intelWaterPressure = intelWaterPressure;
	}

	public Long getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Long storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getMembraneType() {
		return membraneType;
	}

	public void setMembraneType(String membraneType) {
		this.membraneType = membraneType;
	}

	public Long getBoosterPumpVoltage() {
		return boosterPumpVoltage;
	}

	public void setBoosterPumpVoltage(Long boosterPumpVoltage) {
		this.boosterPumpVoltage = boosterPumpVoltage;
	}

	public Long getMainsVoltage() {
		return mainsVoltage;
	}

	public void setMainsVoltage(Long mainsVoltage) {
		this.mainsVoltage = mainsVoltage;
	}

	public String getMounting() {
		return mounting;
	}

	public void setMounting(String mounting) {
		this.mounting = mounting;
	}

	public String getBackWash() {
		return backWash;
	}

	public void setBackWash(String backWash) {
		this.backWash = backWash;
	}

	public String getActivatedCarbon() {
		return activatedCarbon;
	}

	public void setActivatedCarbon(String activatedCarbon) {
		this.activatedCarbon = activatedCarbon;
	}

	public String getSelicaSand() {
		return selicaSand;
	}

	public void setSelicaSand(String selicaSand) {
		this.selicaSand = selicaSand;
	}

	public String getGavel() {
		return gavel;
	}

	public void setGavel(String gavel) {
		this.gavel = gavel;
	}

}
