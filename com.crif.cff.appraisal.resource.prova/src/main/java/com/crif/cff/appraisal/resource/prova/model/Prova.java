package com.crif.cff.appraisal.resource.prova.model;

import java.util.List;

import com.crif.cff.shared.commons.model.CFFKey;
import com.crif.cff.shared.commons.model.CFFResource;
import com.eaio.uuid.UUID;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

public class Prova implements CFFResource<UUID> {

	private CFFKey<UUID> id;
	private String foo;
	private String bar;
	
	private List<SubProva> children;
	
	public Prova() {
		
	}

	@Override
	public CFFKey<UUID> getId() {
		return id;
	}

	@Override
	public void setId(CFFKey<UUID> id) {
		this.id = id;

	}

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

	public List<SubProva> getChildren() {
		return children;
	}

	public void setChildren(List<SubProva> children) {
		this.children = children;
	}



}
