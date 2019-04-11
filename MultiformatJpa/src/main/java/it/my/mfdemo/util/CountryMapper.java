package it.my.mfdemo.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.eaio.uuid.UUID;

import it.my.mfdemo.domain.DomainCountry;
import it.my.mfdemo.model.Country;

@Mapper(componentModel = "spring")
public abstract class CountryMapper {
	
	@Mapping(target = "funnyId", source = "id")
	public abstract DomainCountry toDomainCountry(Country c);
	
	public String map(UUID id){
		return id.toString() + "LOL";
	}
}
