package it.my.mfdemo.util;

import java.util.List;

import org.mapstruct.Mapper;

import com.eaio.uuid.UUID;

import it.my.mfdemo.domain.DomainCountry;
import it.my.mfdemo.domain.DomainProvince;
import it.my.mfdemo.model.Country;
import it.my.mfdemo.model.Province;

@Mapper(componentModel = "spring")
public abstract class DomainCountryMapper {
	
	public Country domainCountryToCountry(DomainCountry dc){
		Country c = new Country();
		c.setId(new UUID(dc.getFunnyId()));
		c.setCode(dc.getCode());
		c.setName(dc.getName());
		c.setProvinces(toProvinces(dc.getProvinces()));
		
		return c;
	}

	public abstract List<Province> toProvinces(List<DomainProvince> provinces);
}
