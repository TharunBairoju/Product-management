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
@Table(name = "product_design_specification")
public class ProductDesignSpecification extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "designer_notes")
	private String designerNotes;

	@Column(name = "assembly_instructions")
	private String assemblyInstructions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignerNotes() {
		return designerNotes;
	}

	public void setDesignerNotes(String designerNotes) {
		this.designerNotes = designerNotes;
	}

	public String getAssemblyInstructions() {
		return assemblyInstructions;
	}

	public void setAssemblyInstructions(String assemblyInstructions) {
		this.assemblyInstructions = assemblyInstructions;
	}

}
