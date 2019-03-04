package com.crif.cff.appraisal.resource.prova.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.eaio.uuid.UUID;

@Entity
public class ProvaEntity {

	@Id
	private UUID provaId;
	private String foo;
	private String bar;
	
//	@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
//	private List<SubProvaEntity> childern;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	public UUID getProvaId() {
		return provaId;
	}

	public void setProvaId(UUID provaId) {
		this.provaId = provaId;
	}

//	public List<SubProvaEntity> getChildern() {
//		return childern;
//	}
//
//	public void setChildern(List<SubProvaEntity> childern) {
//		this.childern = childern;
//	}

}
