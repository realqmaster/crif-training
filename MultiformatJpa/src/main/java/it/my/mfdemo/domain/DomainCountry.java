package it.my.mfdemo.domain;

import java.util.List;


public class DomainCountry {


	private String funnyId;
	private String code;
	private String name;
	private List<DomainProvince> provinces;

	public String getFunnyId() {
		return funnyId;
	}

	public void setFunnyId(String id) {
		this.funnyId = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DomainProvince> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<DomainProvince> provinces) {
		this.provinces = provinces;
	}

	public DomainCountry(String code, String name, List<DomainProvince> provinces) {
		super();
		this.code = code;
		this.name = name;
		this.provinces = provinces;
	}

	public DomainCountry() {
		super();
		// TODO Auto-generated constructor stub
	}
}
