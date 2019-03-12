package com.crif.cff.appraisal.resource.prova.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class SubProvaEntity {
	
	@Id
	private String id;
	private String descr;
	
	@ManyToOne
	@JoinColumn
	@JsonIgnoreProperties("children")
	private ProvaEntity parent;
	
	public SubProvaEntity() {
		
	}
	
	@Mapping("id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Mapping("descr")
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	public ProvaEntity getParent() {
		return parent;
	}
	public void setParent(ProvaEntity parent) {
		this.parent = parent;
	}

}
