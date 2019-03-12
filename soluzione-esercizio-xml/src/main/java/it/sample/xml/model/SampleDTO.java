package it.sample.xml.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import it.sample.xml.entity.OtherObject;
import it.sample.xml.entity.SomeObject;

@XmlRootElement(name = "SampleDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class SampleDTO {
	
	private String id;
	@XmlElementWrapper(name = "someList", nillable = true)
	@XmlElement(name = "someObject")
	private List<SomeObject> someObjects;
	@XmlElementWrapper(name ="otherList", nillable = true)
	@XmlElement(name = "otherObject")
	private List<OtherObject> otherObjects;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<SomeObject> getSomeObjects() {
		return someObjects;
	}
	public void setSomeObjects(List<SomeObject> someObjects) {
		this.someObjects = someObjects;
	}
	public List<OtherObject> getOtherObjects() {
		return otherObjects;
	}
	public void setOtherObjects(List<OtherObject> otherObjects) {
		this.otherObjects = otherObjects;
	}
	public SampleDTO(String id, List<SomeObject> someObjects, List<OtherObject> otherObjects) {
		super();
		this.id = id;
		this.someObjects = someObjects;
		this.otherObjects = otherObjects;
	}
	public SampleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
