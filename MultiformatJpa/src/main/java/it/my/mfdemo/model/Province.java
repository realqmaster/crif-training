package it.my.mfdemo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.eaio.uuid.UUID;

@Entity
public class Province {

	@Id
	@GenericGenerator(strategy = "it.my.mfdemo.util.UUIDGenerator", name = "uuid")
	@GeneratedValue(generator = "uuid")
	private UUID id;
	private String code;
	private String name;
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "province_id")
	private List<City> cities;

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

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}


	public Province(String code, String name, List<City> cities) {
		super();
		this.code = code;
		this.name = name;
		this.cities = cities;
	}

	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
}
