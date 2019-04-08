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
public class Country {

	@Id
	@GenericGenerator(strategy = "it.my.mfdemo.util.UUIDGenerator", name = "uuid")
	@GeneratedValue(generator = "uuid")	private UUID id;
	private String code;
	private String name;
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "country_id")
	private List<Province> provinces;

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

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = provinces;
	}

	public Country(String code, String name, List<Province> provinces) {
		super();
		this.code = code;
		this.name = name;
		this.provinces = provinces;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
}
