package it.my.mfdemo.util;

import it.my.mfdemo.domain.DomainCity;
import it.my.mfdemo.domain.DomainCountry;
import it.my.mfdemo.domain.DomainProvince;
import it.my.mfdemo.model.City;
import it.my.mfdemo.model.Country;
import it.my.mfdemo.model.Province;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-04-11T23:00:09+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class CountryMapperImpl extends CountryMapper {

    @Override
    public DomainCountry toDomainCountry(Country c) {
        if ( c == null ) {
            return null;
        }

        DomainCountry domainCountry = new DomainCountry();

        domainCountry.setFunnyId( map( c.getId() ) );
        domainCountry.setCode( c.getCode() );
        domainCountry.setName( c.getName() );
        domainCountry.setProvinces( provinceListToDomainProvinceList( c.getProvinces() ) );

        return domainCountry;
    }

    protected DomainCity cityToDomainCity(City city) {
        if ( city == null ) {
            return null;
        }

        DomainCity domainCity = new DomainCity();

        domainCity.setId( city.getId() );
        domainCity.setName( city.getName() );
        domainCity.setPopulation( city.getPopulation() );

        return domainCity;
    }

    protected List<DomainCity> cityListToDomainCityList(List<City> list) {
        if ( list == null ) {
            return null;
        }

        List<DomainCity> list1 = new ArrayList<DomainCity>( list.size() );
        for ( City city : list ) {
            list1.add( cityToDomainCity( city ) );
        }

        return list1;
    }

    protected DomainProvince provinceToDomainProvince(Province province) {
        if ( province == null ) {
            return null;
        }

        DomainProvince domainProvince = new DomainProvince();

        domainProvince.setId( province.getId() );
        domainProvince.setCode( province.getCode() );
        domainProvince.setName( province.getName() );
        domainProvince.setCities( cityListToDomainCityList( province.getCities() ) );

        return domainProvince;
    }

    protected List<DomainProvince> provinceListToDomainProvinceList(List<Province> list) {
        if ( list == null ) {
            return null;
        }

        List<DomainProvince> list1 = new ArrayList<DomainProvince>( list.size() );
        for ( Province province : list ) {
            list1.add( provinceToDomainProvince( province ) );
        }

        return list1;
    }
}
