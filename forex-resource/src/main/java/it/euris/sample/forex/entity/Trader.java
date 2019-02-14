package it.euris.sample.forex.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trader {
	
	@Id
	private String name;
	
	@Column(name = "country")
	private String baseCountry;
	
	/*Potere*/
	private BigDecimal marketShare;
	
	/*Descrizzione*/
	private String descrition;

	
		
	public Trader() {
		
	}
	
	

	public Trader(String name, String baseCountry, String descrition) {
		this.name = name;
		this.baseCountry = baseCountry;
		this.descrition = descrition;
	}



	public String getBaseCountry() {
		return baseCountry;
	}

	public void setBaseCountry(String baseCountry) {
		this.baseCountry = baseCountry;
	}

	public BigDecimal getMarketShare() {
		return marketShare;
	}

	public void setMarketShare(BigDecimal marketShare) {
		this.marketShare = marketShare;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Traders [name=" + name + ", baseCountry=" + baseCountry + ", marketShare=" + marketShare
				+ ", descrition=" + descrition + "]";
	}
	
}
