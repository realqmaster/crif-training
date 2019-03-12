package com.crif.cff.appraisal.resource.prova.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.dozer.Mapping;

import com.eaio.uuid.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ProvaEntity {

	@Id
	private UUID provaId;
	private String foo;
	private String bar;
	
	@JsonIgnoreProperties("parent")
	@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
	private List<SubProvaEntity> children;
	
	public ProvaEntity() {
	}

	@Mapping("foo")
	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
	
	@Mapping("bar")
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

	@Mapping("children")
	public List<SubProvaEntity> getChildren() {
		return children;
	}

	public void setChildren(List<SubProvaEntity> childern) {
		this.children = childern;
	}

}
