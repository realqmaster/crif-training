package it.sample.xml.repository;

import org.springframework.data.repository.CrudRepository;

import it.sample.xml.entity.OtherObject;

public interface OtherObjectRepository extends CrudRepository<OtherObject, String> {

}
