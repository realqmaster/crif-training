package it.my.mfdemo.util;

import it.my.mfdemo.domain.DomainCity;
import it.my.mfdemo.domain.DomainProvince;
import it.my.mfdemo.model.City;
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
public class DomainCountryMapperImpl extends DomainCountryMapper {

    @Override
    public List<Province> toProvinces(List<DomainProvince> provinces) {
        if ( provinces == null ) {
            return null;
        }

        List<Province> list = new ArrayList<Province>( provinces.size() );
        for ( DomainProvince domainProvince : provinces ) {
            list.add( domainProvinceToProvince( domainProvince ) );
        }

        return list;
    }

    protected City domainCityToCity(DomainCity domainCity) {
        if ( domainCity == null ) {
            return null;
        }

        City city = new City();

        city.setId( domainCity.getId() );
        city.setName( domainCity.getName() );
        city.setPopulation( domainCity.getPopulation() );

        return city;
    }

    protected List<City> domainCityListToCityList(List<DomainCity> list) {
        if ( list == null ) {
            return null;
        }

        List<City> list1 = new ArrayList<City>( list.size() );
        for ( DomainCity domainCity : list ) {
            list1.add( domainCityToCity( domainCity ) );
        }

        return list1;
    }

    protected Province domainProvinceToProvince(DomainProvince domainProvince) {
        if ( domainProvince == null ) {
            return null;
        }

        Province province = new Province();

        province.setId( domainProvince.getId() );
        province.setCode( domainProvince.getCode() );
        province.setName( domainProvince.getName() );
        province.setCities( domainCityListToCityList( domainProvince.getCities() ) );

        return province;
    }
}
