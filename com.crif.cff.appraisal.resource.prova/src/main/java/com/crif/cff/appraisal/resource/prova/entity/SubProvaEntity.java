package com.crif.cff.appraisal.resource.prova.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SubProvaEntity {
	
	@Id
	private String id;
	private String descr;
	
	@ManyToOne
	@JoinColumn
	private ProvaEntity parent;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

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
