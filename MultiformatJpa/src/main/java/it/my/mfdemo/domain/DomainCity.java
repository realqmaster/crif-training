package it.my.mfdemo.domain;

import com.eaio.uuid.UUID;

public class DomainCity {

	private UUID id;
	private String name;
	private Integer population;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}


	public DomainCity(String name, Integer population) {
		super();
		this.name = name;
		this.population = population;
	}

	public DomainCity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
