package it.sample.xml.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OtherObject {
	
	@Id
	private String id;
	private String otherDescription;
	private boolean flag;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOtherDescription() {
		return otherDescription;
	}
	public void setOtherDescription(String otherDescription) {
		this.otherDescription = otherDescription;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public OtherObject(String id, String otherDescription, boolean flag) {
		super();
		this.id = id;
		this.otherDescription = otherDescription;
		this.flag = flag;
	}
	public OtherObject() {
		super();
		// TODO Auto-generated constructor stub
	}

}
