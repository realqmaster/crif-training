package it.my.mfdemo.domain;

import java.util.List;

import com.eaio.uuid.UUID;

public class DomainProvince {

	private UUID id;
	private String code;
	private String name;
	private List<DomainCity> cities;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public List<DomainCity> getCities() {
		return cities;
	}

	public void setCities(List<DomainCity> cities) {
		this.cities = cities;
	}


	public DomainProvince(String code, String name, List<DomainCity> cities) {
		super();
		this.code = code;
		this.name = name;
		this.cities = cities;
	}

	public DomainProvince() {
		super();
		// TODO Auto-generated constructor stub
	}
}
