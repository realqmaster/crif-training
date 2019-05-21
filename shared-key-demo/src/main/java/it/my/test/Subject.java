package it.my.test;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.eaio.uuid.UUID;

@Entity
public class Subject {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "it.my.test.MyGenerator")
  private UUID uidSubject;

  @OneToOne(cascade = CascadeType.ALL)
  @MapsId
  private PrivateIndividual privateIndividual;

  public UUID getUidSubject() {
    return uidSubject;
  }

  public void setUidSubject(UUID uidSubject) {
    this.uidSubject = uidSubject;
  }

  public PrivateIndividual getPrivateIndividual() {
    return privateIndividual;
  }

  public void setPrivateIndividual(PrivateIndividual privateIndividual) {
    this.privateIndividual = privateIndividual;
  }
}
