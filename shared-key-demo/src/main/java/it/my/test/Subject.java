package it.my.test;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer uidSubject;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	private PrivateIndividual privateIndividual;

	public Integer getUidSubject() {
		return uidSubject;
	}

	public void setUidSubject(Integer uidSubject) {
		this.uidSubject = uidSubject;
	}

	public PrivateIndividual getPrivateIndividual() {
		return privateIndividual;
	}

	public void setPrivateIndividual(PrivateIndividual privateIndividual) {
		this.privateIndividual = privateIndividual;
	}
	


}
