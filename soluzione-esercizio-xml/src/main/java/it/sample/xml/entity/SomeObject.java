package it.sample.xml.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SomeObject {

	@Id
	private String id;
	private String someDescription;
	private Integer amount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSomeDescription() {
		return someDescription;
	}
	public void setSomeDescription(String someDescription) {
		this.someDescription = someDescription;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public SomeObject(String id, String someDescription, Integer amount) {
		super();
		this.id = id;
		this.someDescription = someDescription;
		this.amount = amount;
	}
	public SomeObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
