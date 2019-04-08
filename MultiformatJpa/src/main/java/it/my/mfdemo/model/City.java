package it.my.mfdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.eaio.uuid.UUID;

@Entity
public class City {

	@Id
	@GenericGenerator(strategy = "it.my.mfdemo.util.UUIDGenerator", name = "uuid")
	@GeneratedValue(generator = "uuid")	private UUID id;
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


	public City(String name, Integer population) {
		super();
		this.name = name;
		this.population = population;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

}
